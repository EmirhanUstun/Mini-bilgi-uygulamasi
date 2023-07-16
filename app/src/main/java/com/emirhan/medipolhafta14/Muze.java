package com.emirhan.medipolhafta14;

import android.os.Parcel;
import android.os.Parcelable;

public class Muze implements Parcelable {

    private String isim;
    private String semt;
    private String resimUrl;
    private String detayResimUrl;
    private String hakkında;

    protected Muze(Parcel in) {
        isim = in.readString();
        semt = in.readString();
        resimUrl = in.readString();
        detayResimUrl = in.readString();
        hakkında = in.readString();
    }

    public static final Creator<Muze> CREATOR = new Creator<Muze>() {
        @Override
        public Muze createFromParcel(Parcel in) {
            return new Muze(in);
        }

        @Override
        public Muze[] newArray(int size) {
            return new Muze[size];
        }
    };

    public String getIsim() {
        return isim;
    }

    public String getSemt() {
        return semt;
    }

    public String getResimUrl() {
        return resimUrl;
    }

    public String getDetayResimUrl() {
        return detayResimUrl;
    }

    public String getHakkında() {
        return hakkında;
    }

    public Muze(String isim, String semt, String resimUrl, String detayResimUrl, String hakkında) {
        this.isim = isim;
        this.semt = semt;
        this.resimUrl = resimUrl;
        this.detayResimUrl = detayResimUrl;
        this.hakkında = hakkında;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(isim);
        parcel.writeString(semt);
        parcel.writeString(resimUrl);
        parcel.writeString(detayResimUrl);
        parcel.writeString(hakkında);
    }
}
