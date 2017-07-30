package com.fengpeihao.outlook.moudle;

import android.support.v4.app.Fragment;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fengpeihao on 2017/7/30.
 */
@PreFragment
@Module
public class FragmentModule {
    private Fragment mFragment;

    public FragmentModule(Fragment fragment) {
        mFragment = fragment;
    }

    @PreFragment
    @Provides
    public Fragment provideFragment(){
        return mFragment;
    }
}
