package com.fengpeihao.outlook.moudle;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fengpeihao on 2017/7/30.
 */
@Module
public class AppModule {
    private final   Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public Application provideApplication(){
        return application;
    }
}
