package com.ivollo.bluetoothlegatt;

import android.app.Application;

/**
 * Created by huangbing on 2016/3/31.
 */
public class IvolloApplication  extends Application {
    public static Application app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }
}