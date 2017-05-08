package com.hani.android.retrofitexample.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.hani.android.retrofitexample.R;
import com.hani.android.retrofitexample.adapter.RecyclerviewAdapter;
import com.hani.android.retrofitexample.model.User;
import com.hani.android.retrofitexample.network.ApiClient;
import com.hani.android.retrofitexample.service.ApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
LinearLayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getUserList();
    }
    private void getUserList(){
    try {
        ApiService service= ApiClient.getClient().create(ApiService.class);
        Call<List<User>> call=service.getData();
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                List<User> rowListItem=response.body();
                layoutManager=new LinearLayoutManager(MainActivity.this);
                RecyclerView recyclerView=(RecyclerView)findViewById(R.id.re1);
                recyclerView.setLayoutManager(layoutManager);
                RecyclerviewAdapter recyclerviewAdapter=new RecyclerviewAdapter(rowListItem);
                recyclerView.setAdapter(recyclerviewAdapter);
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                Log.d("failure",t.toString());
            }
        });

    }
    catch (Exception e){
    }
}
}
