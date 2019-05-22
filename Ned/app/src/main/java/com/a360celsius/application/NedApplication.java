package com.a360celsius.application;

import android.app.Application;

import com.a360celsius.dagger.componnents.DaggerMyComponent;
import com.a360celsius.dagger.componnents.MyComponent;
import com.a360celsius.dagger.modules.ContextModule;
import com.a360celsius.dagger.modules.RetrofitClientModule;

public class NedApplication extends Application {
    private static MyComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerMyComponent.builder()
                .contextModule(new ContextModule(getApplicationContext()))
                .retrofitClientModule(new RetrofitClientModule())
                .build();
    }

    public static MyComponent getMyComponent() {
        return component;
    }
}
