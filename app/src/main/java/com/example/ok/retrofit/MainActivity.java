package com.example.ok.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import com.example.ok.retrofit.WebService.ResultModle;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements ResultModle {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://developerhendy.16mb.com/").
                addConverterFactory(GsonConverterFactory.create()).build();
        MainActivity test = retrofit.create(MainActivity.class);//conected api

        Call<ResultModle> connection = test.getPosts();

    }


}
