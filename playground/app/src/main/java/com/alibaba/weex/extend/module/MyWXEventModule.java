package com.alibaba.weex.extend.module;

import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;

/**
 * Created by Administrator on 2016/8/15.
 */
public class MyWXEventModule extends WXModule {

    private static final String WEEX_CATEGORY = "com.taobao.android.intent.category.WEEX";

    @WXModuleAnno
    public void openUrl(String url) throws WXException{
        WXSDKEngine.registerModule("event", WXEventModule.class);


    }
}
