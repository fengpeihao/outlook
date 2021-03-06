package com.fengpeihao.outlook.base;

import com.fengpeihao.outlook.component.DaggerFragmentComponent;
import com.fengpeihao.outlook.moudle.AppModule;
import com.fengpeihao.outlook.moudle.FragmentModule;

/**
 * Created by fengpeihao on 2017/7/30.
 */

public abstract class BaseFragment<P extends BasePresenter> extends SimleFragment {

    protected P mPresenter;

    @Override
    protected void init() {
        DaggerFragmentComponent.builder()
                .appModule(new AppModule(getActivity().getApplication()))
                .fragmentModule(new FragmentModule(this))
                .build();

        initViews();
    }

    protected abstract void initViews();
}
