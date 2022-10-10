package com.example.asgn3;

import com.google.gson.annotations.SerializedName;

public class Penambahan
{
    @SerializedName("created")
    private String created;
    @SerializedName("jumlah_meninggal")
    private String jumlah_meninggal;
    @SerializedName("tanggal")
    private String tanggal;
    @SerializedName("jumlah_sembuh")
    private String jumlah_sembuh;
    @SerializedName("jumlah_positif")
    private String jumlah_positif;
    @SerializedName("jumlah_dirawat")
    private String jumlah_dirawat;

    public String getCreated ()
    {
        return created;
    }

    public void setCreated (String created)
    {
        this.created = created;
    }

    public String getJumlah_meninggal ()
    {
        return jumlah_meninggal;
    }

    public void setJumlah_meninggal (String jumlah_meninggal)
    {
        this.jumlah_meninggal = jumlah_meninggal;
    }

    public String getTanggal ()
    {
        return tanggal;
    }

    public void setTanggal (String tanggal)
    {
        this.tanggal = tanggal;
    }

    public String getJumlah_sembuh ()
    {
        return jumlah_sembuh;
    }

    public void setJumlah_sembuh (String jumlah_sembuh)
    {
        this.jumlah_sembuh = jumlah_sembuh;
    }

    public String getJumlah_positif ()
    {
        return jumlah_positif;
    }

    public void setJumlah_positif (String jumlah_positif)
    {
        this.jumlah_positif = jumlah_positif;
    }

    public String getJumlah_dirawat ()
    {
        return jumlah_dirawat;
    }

    public void setJumlah_dirawat (String jumlah_dirawat)
    {
        this.jumlah_dirawat = jumlah_dirawat;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [created = "+created+", jumlah_meninggal = "+jumlah_meninggal+", tanggal = "+tanggal+", jumlah_sembuh = "+jumlah_sembuh+", jumlah_positif = "+jumlah_positif+", jumlah_dirawat = "+jumlah_dirawat+"]";
    }
}


