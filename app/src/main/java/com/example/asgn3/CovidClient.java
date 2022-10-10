package com.example.asgn3;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CovidClient {
    static CovidClient instance =null;
    private MyApi api;

    private CovidClient(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(MyApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(MyApi.class);

    }
    public static synchronized CovidClient getInstance(){
        if (instance == null) {
            instance = new CovidClient();
        }
        return instance;
    }
    public MyApi getApi(){return api;}

}
