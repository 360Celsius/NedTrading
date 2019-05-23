package com.a360celsius.ned;

import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;

import com.a360celsius.ned.databinding.ActivitySplashBinding;
import com.a360celsius.retrofit.RetrofitClient;
import com.a360celsius.retrofit.endpoints.interfaces.GetData;
import com.a360celsius.retrofit.pojo.Symbol;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class SplashActivity extends BaseActivity {

    private ActivitySplashBinding activitySplashBinding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activitySplashBinding = DataBindingUtil.setContentView(this, R.layout.activity_splash);



        /*Create handle for the RetrofitInstance interface*/
        GetData service = RetrofitClient.getRetrofit().create(GetData.class);
        Call<List<Symbol>> call = service.getAllSymbols();
        call.enqueue(new Callback<List<Symbol>>() {
            @Override
            public void onResponse(Call<List<Symbol>> call, Response<List<Symbol>> response) {
                Log.e("Test", "I am here");
            }

            @Override
            public void onFailure(Call<List<Symbol>> call, Throwable t) {

            }
        });

    }
}
