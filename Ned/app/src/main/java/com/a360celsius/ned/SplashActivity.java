package com.a360celsius.ned;

import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import com.a360celsius.ned.databinding.ActivitySplashBinding;


public class SplashActivity extends BaseActivity {

    private ActivitySplashBinding activitySplashBinding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activitySplashBinding = DataBindingUtil.setContentView(this, R.layout.activity_splash);
    }
}
