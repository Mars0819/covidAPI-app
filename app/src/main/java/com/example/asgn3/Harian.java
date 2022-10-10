package com.example.asgn3;

import com.google.gson.annotations.SerializedName;

public class Harian
{
    @SerializedName("key_as_string")
    private String key_as_string;
    @SerializedName("doc_count")
    private String doc_count;
    @SerializedName("jumlah_positif_kum")
    private Jumlah_positif_kum jumlah_positif_kum;
    @SerializedName("jumlah_sembuh_kum")
    private Jumlah_sembuh_kum jumlah_sembuh_kum;
    @SerializedName("jumlah_meninggal_kum")
    private Jumlah_meninggal_kum jumlah_meninggal_kum;
    @SerializedName("jumlah_meninggal")
    private Jumlah_meninggal jumlah_meninggal;
    @SerializedName("jumlah_sembuh")
    private Jumlah_sembuh jumlah_sembuh;
    @SerializedName("key")
    private String key;
    @SerializedName("jumlah_positif")
    private Jumlah_positif jumlah_positif;
    @SerializedName("jumlah_dirawat_kum")
    private Jumlah_dirawat_kum jumlah_dirawat_kum;
    @SerializedName("jumlah_dirawat")
    private Jumlah_dirawat jumlah_dirawat;

    public String getKey_as_string ()
    {
        return key_as_string;
    }

    public void setKey_as_string (String key_as_string)
    {
        this.key_as_string = key_as_string;
    }

    public String getDoc_count ()
    {
        return doc_count;
    }

    public void setDoc_count (String doc_count)
    {
        this.doc_count = doc_count;
    }

    public Jumlah_positif_kum getJumlah_positif_kum ()
    {
        return jumlah_positif_kum;
    }

    public void setJumlah_positif_kum (Jumlah_positif_kum jumlah_positif_kum)
    {
        this.jumlah_positif_kum = jumlah_positif_kum;
    }

    public Jumlah_sembuh_kum getJumlah_sembuh_kum ()
    {
        return jumlah_sembuh_kum;
    }

    public void setJumlah_sembuh_kum (Jumlah_sembuh_kum jumlah_sembuh_kum)
    {
        this.jumlah_sembuh_kum = jumlah_sembuh_kum;
    }

    public Jumlah_meninggal_kum getJumlah_meninggal_kum ()
    {
        return jumlah_meninggal_kum;
    }

    public void setJumlah_meninggal_kum (Jumlah_meninggal_kum jumlah_meninggal_kum)
    {
        this.jumlah_meninggal_kum = jumlah_meninggal_kum;
    }

    public Jumlah_meninggal getJumlah_meninggal ()
    {
        return jumlah_meninggal;
    }

    public void setJumlah_meninggal (Jumlah_meninggal jumlah_meninggal)
    {
        this.jumlah_meninggal = jumlah_meninggal;
    }

    public Jumlah_sembuh getJumlah_sembuh ()
    {
        return jumlah_sembuh;
    }

    public void setJumlah_sembuh (Jumlah_sembuh jumlah_sembuh)
    {
        this.jumlah_sembuh = jumlah_sembuh;
    }

    public String getKey ()
    {
        return key;
    }

    public void setKey (String key)
    {
        this.key = key;
    }

    public Jumlah_positif getJumlah_positif ()
    {
        return jumlah_positif;
    }

    public void setJumlah_positif (Jumlah_positif jumlah_positif)
    {
        this.jumlah_positif = jumlah_positif;
    }

    public Jumlah_dirawat_kum getJumlah_dirawat_kum ()
    {
        return jumlah_dirawat_kum;
    }

    public void setJumlah_dirawat_kum (Jumlah_dirawat_kum jumlah_dirawat_kum)
    {
        this.jumlah_dirawat_kum = jumlah_dirawat_kum;
    }

    public Jumlah_dirawat getJumlah_dirawat ()
    {
        return jumlah_dirawat;
    }

    public void setJumlah_dirawat (Jumlah_dirawat jumlah_dirawat)
    {
        this.jumlah_dirawat = jumlah_dirawat;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [key_as_string = "+key_as_string+", doc_count = "+doc_count+", jumlah_positif_kum = "+jumlah_positif_kum+", jumlah_sembuh_kum = "+jumlah_sembuh_kum+", jumlah_meninggal_kum = "+jumlah_meninggal_kum+", jumlah_meninggal = "+jumlah_meninggal+", jumlah_sembuh = "+jumlah_sembuh+", key = "+key+", jumlah_positif = "+jumlah_positif+", jumlah_dirawat_kum = "+jumlah_dirawat_kum+", jumlah_dirawat = "+jumlah_dirawat+"]";
    }
}


