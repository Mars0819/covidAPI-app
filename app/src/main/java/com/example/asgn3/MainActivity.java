package com.example.asgn3;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TextView textView1,textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 =findViewById(R.id.tv1);
        textView2 =findViewById(R.id.tv2);
        textView3 =findViewById(R.id.tv3);

        getCovid19();
    }

    private void getCovid19() {
        Call<GetData> apiCall = CovidClient.getInstance().getApi().view();
        apiCall.enqueue(new Callback<GetData>() {
            @Override
            public void onResponse(Call<GetData> call, Response<GetData> response) {
                if (response.isSuccessful()){
                    GetData dataList = response.body();
                    GetData covidList = response.body();
                    textView1.setText(String.valueOf(covidList.getUpdate().getTotal().getJumlah_positif()));
                    textView3.setText(String.valueOf(covidList.getUpdate().getTotal().getJumlah_sembuh()));
                    textView2.setText(String.valueOf(covidList.getUpdate().getTotal().getJumlah_meninggal()));
                }
            }

            @Override
            public void onFailure(Call<GetData> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error: "+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}