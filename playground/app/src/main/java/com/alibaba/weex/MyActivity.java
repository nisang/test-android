package com.alibaba.weex;

import android.app.Activity;

import android.os.Bundle;

import android.view.ViewGroup;
import android.view.WindowManager;

import com.alibaba.weex.R;
import com.alibaba.weex.commons.util.ScreenUtil;
import com.alibaba.weex.extend.listener.SimpleRenderListener;

import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXRenderStrategy;

import java.util.HashMap;

/**
 * 测试
 * Created by Administrator on 2016/8/16.
 */
public class MyActivity extends Activity {

    WXSDKInstance mInstance;
    ViewGroup mContainer;
    String TAG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContainer = (ViewGroup) findViewById(R.id.container);
        mInstance = new WXSDKInstance(this);
        mInstance.registerRenderListener(new SimpleRenderListener());
        WindowManager wm = this.getWindowManager();
        int with = wm.getDefaultDisplay().getWidth();
        int height = wm.getDefaultDisplay().getHeight();
        mInstance.renderByUrl(TAG,"http://192.168.7.158/examples/build/acgj.js",new HashMap<String,Object>(),null,with,height, WXRenderStrategy.APPEND_ASYNC);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (mContainer!=null) {
            mInstance.onActivityStart();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mContainer!=null) {
            mInstance.onActivityResume();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mContainer!=null) {
            mInstance.onActivityPause();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mContainer!=null) {
            mInstance.onActivityPause();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mContainer != null) {
            mInstance.onActivityDestroy();
        }
    }
}
