package com.fengpeihao.outlook.component;

import com.fengpeihao.outlook.moudle.ApiModule;
import com.fengpeihao.outlook.moudle.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by fengpeihao on 2017/7/30.
 */
@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface AppComponent {
}
