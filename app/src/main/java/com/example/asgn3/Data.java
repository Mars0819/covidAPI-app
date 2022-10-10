package com.example.asgn3;

import com.google.gson.annotations.SerializedName;

public class Data
{
    @SerializedName("jumlah_odp")
    private String jumlah_odp;
    @SerializedName("jumlah_pdp")
    private String jumlah_pdp;
    @SerializedName("total_spesimen")
    private String total_spesimen;
    @SerializedName("total_spesimen_negatif")
    private String total_spesimen_negatif;
    @SerializedName("id")
    private String id;

    public String getJumlah_odp ()
    {
        return jumlah_odp;
    }

    public void setJumlah_odp (String jumlah_odp)
    {
        this.jumlah_odp = jumlah_odp;
    }

    public String getJumlah_pdp ()
    {
        return jumlah_pdp;
    }

    public void setJumlah_pdp (String jumlah_pdp)
    {
        this.jumlah_pdp = jumlah_pdp;
    }

    public String getTotal_spesimen ()
    {
        return total_spesimen;
    }

    public void setTotal_spesimen (String total_spesimen)
    {
        this.total_spesimen = total_spesimen;
    }

    public String getTotal_spesimen_negatif ()
    {
        return total_spesimen_negatif;
    }

    public void setTotal_spesimen_negatif (String total_spesimen_negatif)
    {
        this.total_spesimen_negatif = total_spesimen_negatif;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [jumlah_odp = "+jumlah_odp+", jumlah_pdp = "+jumlah_pdp+", total_spesimen = "+total_spesimen+", total_spesimen_negatif = "+total_spesimen_negatif+", id = "+id+"]";
    }
}
























