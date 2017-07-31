package com.fengpeihao.outlook.component;

import com.fengpeihao.outlook.moudle.AppModule;
import com.fengpeihao.outlook.moudle.FragmentModule;
import com.fengpeihao.outlook.moudle.PreFragment;

import dagger.Component;

/**
 * Created by fengpeihao on 2017/7/30.
 */
@PreFragment
@Component(dependencies = AppModule.class,modules = FragmentModule.class)
public interface FragmentComponent {
}
