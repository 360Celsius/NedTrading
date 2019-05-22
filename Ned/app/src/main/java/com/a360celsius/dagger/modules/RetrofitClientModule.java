package com.a360celsius.dagger.modules;
import android.content.Context;

import com.a360celsius.retrofit.RetrofitClient;

import javax.inject.Named;
import dagger.Module;
import dagger.Provides;

@Module
public class RetrofitClientModule {
    RetrofitClient retrofitClient;

    public RetrofitClientModule() {

    }

    @Provides
    @Named("RetrofitClient")
    RetrofitClient getRetrofitClient() {
        return retrofitClient;
    }
}