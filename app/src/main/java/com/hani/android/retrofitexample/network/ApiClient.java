package com.hani.android.retrofitexample.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by SURBHI PATEL on 09-04-2017.
 */

public class ApiClient {
    public static final String Base_Url="http://www.shaoniiuc.com/";

    private static Retrofit retrofit=null;

    public static Retrofit getClient(){
        if (retrofit==null){
            retrofit=new Retrofit.Builder().baseUrl(Base_Url).addConverterFactory(GsonConverterFactory.create()).build();
        }
    return retrofit;
    }
}
