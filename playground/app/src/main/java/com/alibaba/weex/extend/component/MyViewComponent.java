package com.alibaba.weex.extend.component;

import android.widget.TextView;

import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.dom.WXDomObject;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;

/**
 * 自定义组件
 * Created by Administrator on 2016/8/15.
 */
public class MyViewComponent extends WXComponent {

    private TextView mhost;
    public MyViewComponent(WXSDKInstance instance, WXDomObject dom, WXVContainer parent, boolean isLazy) {
        super(instance, dom, parent, isLazy);
    }

    public MyViewComponent(WXSDKInstance instance, WXDomObject dom, WXVContainer parent, String instanceId, boolean isLazy) {
        super(instance, dom, parent, instanceId, isLazy);
    }

    @Override
    protected void initView(){
        mHost = new TextView(mContext);



    }
}
