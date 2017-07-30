package com.fengpeihao.outlook.base;

import com.fengpeihao.outlook.component.DaggerActivityComponent;
import com.fengpeihao.outlook.moudle.ActivityModule;
import com.fengpeihao.outlook.moudle.AppModule;

/**
 * Created by fengpeihao on 2017/7/30.
 */

public abstract class BaseActivity<P extends BasePresenter> extends SimpleActivity {

    protected P mPresenter;

    @Override
    protected void init() {
        DaggerActivityComponent.builder()
                .appModule(new AppModule(getApplication()))
                .activityModule(new ActivityModule(this))
                .build();
        inject();
        initViews();
    }

    protected abstract void initViews();

    protected abstract void inject();
}
