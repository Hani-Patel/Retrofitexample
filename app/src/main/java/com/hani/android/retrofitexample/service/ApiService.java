package com.hani.android.retrofitexample.service;

import com.hani.android.retrofitexample.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by SURBHI PATEL on 09-04-2017.
 */

public interface ApiService {
    @GET("json_bangla")
    Call<List<User>> getData();

}
