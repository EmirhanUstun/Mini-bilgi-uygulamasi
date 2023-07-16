package com.emirhan.medipolhafta14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetayActivity extends AppCompatActivity {

    ImageView imgKapak;
    TextView txtHakkinda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);

        imgKapak = findViewById(R.id.imgKapak);
        txtHakkinda = findViewById(R.id.txtHakkinda);

        Muze tasinanMuze = (Muze)getIntent().getParcelableExtra("TASINAN_DATA");
        txtHakkinda.setText(tasinanMuze.getHakkında());
        GlideUtil.resmiIndiripGoster(getApplicationContext(), tasinanMuze.getDetayResimUrl(), imgKapak);

    }
}