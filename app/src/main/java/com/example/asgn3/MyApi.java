package com.example.asgn3;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyApi {
    String BASE_URL="https://data.covid19.go.id/public/api/";
    @GET("update.json")
    Call<GetData> view();

}

