package com.alibaba.weex;

import android.app.Application;

import com.alibaba.weex.commons.adapter.ImageAdapter;
import com.taobao.weex.WXSDKEngine;

/**
 * Created by Administrator on 2016/8/16.
 */
public class MyWXApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        WXSDKEngine.init(this,null,null,new ImageAdapter(),null);
    }
}
