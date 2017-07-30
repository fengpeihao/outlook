package com.fengpeihao.outlook.moudle;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fengpeihao on 2017/7/30.
 */
@Module
public class ActivityModule {
    private Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @PreActivity
    public Activity provideActivity(){
        return activity;
    }
}
