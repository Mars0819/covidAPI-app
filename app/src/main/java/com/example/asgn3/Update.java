package com.example.asgn3;


import com.google.gson.annotations.SerializedName;

public class Update
{
    @SerializedName("penambahan")
    private Penambahan penambahan;
    @SerializedName("total")
    private Total total;
    @SerializedName("harian")
    private Harian[] harian;

    public Penambahan getPenambahan ()
    {
        return penambahan;
    }

    public void setPenambahan (Penambahan penambahan)
    {
        this.penambahan = penambahan;
    }

    public Total getTotal ()
    {
        return total;
    }

    public void setTotal (Total total)
    {
        this.total = total;
    }

    public Harian[] getHarian ()
    {
        return harian;
    }

    public void setHarian (Harian[] harian)
    {
        this.harian = harian;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [penambahan = "+penambahan+", total = "+total+", harian = "+harian+"]";
    }
}
