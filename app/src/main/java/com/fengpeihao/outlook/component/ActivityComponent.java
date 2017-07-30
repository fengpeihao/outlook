package com.fengpeihao.outlook.component;

import com.fengpeihao.outlook.moudle.ActivityModule;
import com.fengpeihao.outlook.moudle.AppModule;

import dagger.Component;

/**
 * Created by fengpeihao on 2017/7/30.
 */
@Component(dependencies = AppModule.class, modules = ActivityModule.class)
public interface ActivityComponent {
}
