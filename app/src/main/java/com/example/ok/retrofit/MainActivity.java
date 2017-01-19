package com.example.ok.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.ok.retrofit.WebService.InterfaceService;
import com.example.ok.retrofit.WebService.ResultModle;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://developerhendy.16mb.com/").
                addConverterFactory(ScalarsConverterFactory.create()).
                addConverterFactory(GsonConverterFactory.create()).build();

        InterfaceService test = retrofit.create(InterfaceService.class);//conected api

        Call<List<ResultModle>> connection = test.getposts();
//get all data as string

        Call<String> call = test.getStringScalar();

      call.enqueue(new Callback<String>() {
          @Override
          public void onResponse(Call<String> call, Response<String> response) {
              Log.i("onResponse1", response.body() + "");
          }

          @Override
          public void onFailure(Call<String> call, Throwable t) {

          }
      });


        connection.enqueue(new Callback<List<ResultModle>>() {

            @Override
            public void onResponse(Call<List<ResultModle>> call, Response<List<ResultModle>> response) {

                Log.i("onResponse", response.body() + "");

                //JSONObject jObject = new JSONObject(response.body().string());


                for (int i = 0; i < response.body().size(); i++) {

                    Log.i("onResponse", response.body().get(i).getPost_content() + "");
                }


            }

            @Override
            public void onFailure(Call<List<ResultModle>> call, Throwable t) {

                System.out.println(t.getMessage() + "jyhgfhfrtyd");
            }
        });

    }


}
