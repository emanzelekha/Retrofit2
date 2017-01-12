package com.example.ok.retrofit.WebService;

import retrofit2.Call;
import retrofit2.http.GET;


/**
 * Created by ok on 12/01/2017.
 */

public interface InterfaceService {

    @GET("getposts.php")
    Call<ResultModle> getposts();
}
