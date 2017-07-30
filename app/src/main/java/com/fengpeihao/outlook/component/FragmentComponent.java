package com.fengpeihao.outlook.component;

import com.fengpeihao.outlook.moudle.ActivityModule;
import com.fengpeihao.outlook.moudle.FragmentModule;
import com.fengpeihao.outlook.moudle.PreFragment;

import dagger.Component;

/**
 * Created by fengpeihao on 2017/7/30.
 */
@PreFragment
@Component(dependencies = ActivityModule.class,modules = FragmentModule.class)
public interface FragmentComponent {
}
