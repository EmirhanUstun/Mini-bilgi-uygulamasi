package com.emirhan.medipolhafta14;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
    }

    private void initRecyclerView()
    {
        recyclerView = findViewById(R.id.rcvMuzeler);

        MuzeAdaptor muuzeAdaptor = new MuzeAdaptor(DataUtil.muzeDatasiAl(), getApplicationContext(), new MuzeAdaptor.OnItemClickListener() {
            @Override
            public void onItemClick(Muze tiklanaMuze) {
                Toast.makeText(getApplicationContext(), "Tiklanan Muze: " + tiklanaMuze.getIsim(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, DetayActivity.class);

                intent.putExtra("TASINAN_DATA", tiklanaMuze);

                startActivity(intent);
            }
        });
        recyclerView.setAdapter(muuzeAdaptor);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
    }


}