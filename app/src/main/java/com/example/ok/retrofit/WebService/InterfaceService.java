package com.example.ok.retrofit.WebService;





import org.json.JSONObject;

import java.util.List;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;


/**
 * Created by ok on 12/01/2017.
 */

public interface InterfaceService {

    @GET("getposts.php")  //Get,Post
   // void getRoutes(Callback<List<ResultModle>> routesCallback);
    Call <List<ResultModle>> getposts(); //if has Json Array
   // Call <ResultModle> getposts(); //if has Json object
   @GET("getposts.php")
   Call<String> getStringScalar();


}
