package com.fengpeihao.outlook.app;

import android.app.Application;
import android.content.Context;

import com.fengpeihao.outlook.component.DaggerAppComponent;
import com.fengpeihao.outlook.moudle.ApiModule;
import com.fengpeihao.outlook.moudle.AppModule;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobConfig;

/**
 * Created by fengpeihao on 2017/7/30.
 */

public class App extends Application {

    private static Context appContext;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this;
        DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .apiModule(new ApiModule())
                .build();
        initBmob();
    }

    private void initBmob(){
        BmobConfig config =new BmobConfig.Builder(this)
        //设置appkey
        .setApplicationId("6077d5b450eb4637d2b40550374c2f82")
        //请求超时时间（单位为秒）：默认15s
        .setConnectTimeout(15)
        //文件分片上传时每片的大小（单位字节），默认512*1024
        .setUploadBlockSize(1024*1024)
        //文件的过期时间(单位为秒)：默认1800s
        .setFileExpiration(2500)
        .build();
        Bmob.initialize(config);
    }
}
