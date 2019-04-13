package com.example.app_fashion;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class Api {
    private  static Retrofit retrofit=null;
    public static String DOMAIN="https://android-review-food.000webhostapp.com"  ;
    public static String BaseURL=DOMAIN + "/Titee/Code/"  ;

    //    Cau hinh cho retrofit
    public  static Retrofit getRetrofit(){


        //Gson gson = new GsonBuilder().setLenient().create();
        if (retrofit==null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(BaseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }


        return retrofit;
    }

    public interface Data_Service {
        @GET("index.php?action=get")
        public Call<Fashion_ListResponse> getFashio(@Query("token") String usertoken, @Query("id") int idGR);
    }
}
