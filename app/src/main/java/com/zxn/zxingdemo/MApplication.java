package com.zxn.zxingdemo;

import android.app.Application;

import com.zxn.zxing.activity.ZXingLibrary;

/**
 * Created by aaron on 16/9/7.
 */

public class MApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        ZXingLibrary.initDisplayOpinion(this);
    }
}
