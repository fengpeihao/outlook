package com.fengpeihao.outlook.app;

import android.app.Application;

import com.fengpeihao.outlook.component.DaggerAppComponent;
import com.fengpeihao.outlook.moudle.ApiModule;
import com.fengpeihao.outlook.moudle.AppModule;

/**
 * Created by fengpeihao on 2017/7/30.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .apiModule(new ApiModule())
                .build();
    }
}
