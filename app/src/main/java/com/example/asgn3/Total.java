package com.example.asgn3;
import com.google.gson.annotations.SerializedName;

public class Total
{
    @SerializedName("jumlah_meninggal")
    private String jumlah_meninggal;
    @SerializedName("jumlah_sembuh")
    private String jumlah_sembuh;
    @SerializedName("jumlah_positif")
    private String jumlah_positif;
    @SerializedName("jumlah_dirawat")
    private String jumlah_dirawat;

    public String getJumlah_meninggal ()
    {
        return jumlah_meninggal;
    }

    public void setJumlah_meninggal (String jumlah_meninggal)
    {
        this.jumlah_meninggal = jumlah_meninggal;
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
        return "ClassPojo [jumlah_meninggal = "+jumlah_meninggal+", jumlah_sembuh = "+jumlah_sembuh+", jumlah_positif = "+jumlah_positif+", jumlah_dirawat = "+jumlah_dirawat+"]";
    }
}


