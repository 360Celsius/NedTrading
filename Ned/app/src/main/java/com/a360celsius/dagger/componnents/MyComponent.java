package com.a360celsius.dagger.componnents;


import com.a360celsius.ned.BaseActivity;
import com.a360celsius.dagger.modules.ContextModule;
import com.a360celsius.dagger.modules.RetrofitClientModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules={ContextModule.class, RetrofitClientModule.class})
public interface MyComponent {
    void inject(BaseActivity presenter);
}
