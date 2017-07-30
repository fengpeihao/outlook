package com.fengpeihao.outlook.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by fengpeihao on 2017/7/30.
 */

public abstract class SimleFragment extends Fragment {

    private View mRootView;
    private Unbinder mBind;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (mRootView == null)
            mRootView = inflater.inflate(getLayoutId(), null);
        mBind = ButterKnife.bind(getActivity());

        init();
        return mRootView;
    }

    protected abstract void init();

    protected abstract int getLayoutId();

    protected void showToast(String msg) {
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }

    protected void startActivity(Class cls, Bundle bundle) {
        Intent intent = new Intent(getContext(), cls);
        if (bundle != null)
            intent.putExtras(bundle);
        startActivity(intent);
    }

    protected void startActivity(Class cls) {
        startActivity(cls, null);
    }

    protected void startActivityForResult(Class cls, Bundle bundle, int requestCode) {
        Intent intent = new Intent(getContext(), cls);
        if (bundle != null) intent.putExtras(bundle);
        startActivityForResult(intent, requestCode);
    }

    protected void startActivityForResult(Class cls, int requestCode) {
        startActivityForResult(cls, null, requestCode);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mBind.unbind();
    }
}
