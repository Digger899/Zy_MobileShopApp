package com.example.zy.zy_mobileshop.activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;


import com.example.zy.zy_mobileshop.R;
import com.example.zy.zy_mobileshop.common.BaseActivity;
import com.example.zy.zy_mobileshop.fragment.NavigationFragment;

public class MainActivity extends BaseActivity {

    @Override
    public int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        super.initView();
        //将fragment添加到Activity中
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=manager.beginTransaction();
        fragmentTransaction.replace(R.id.f1_main,new NavigationFragment());
        fragmentTransaction.commit();
    }
}
