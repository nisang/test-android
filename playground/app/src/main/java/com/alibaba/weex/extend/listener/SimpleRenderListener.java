package com.alibaba.weex.extend.listener;

import android.view.View;
import android.view.ViewGroup;

import com.taobao.weex.IWXRenderListener;
import com.taobao.weex.WXSDKInstance;

/** 事件监听器
 * https://open.taobao.com/doc2/detail?spm=a219a.7629140.0.0.uSHthx&&docType=1&articleId=104828#s0
 * 通过注册RenderListener来关注Weex运行时的各种事件，例如渲染完成后把创建的View添加到容器组件中
 * Created by Administrator on 2016/8/16.
 */
public class SimpleRenderListener implements IWXRenderListener {

    ViewGroup mContainer;
    @Override
    public void onViewCreated(WXSDKInstance instance, View view) {
        if (mContainer != null) {
            mContainer.addView(view);
        }
    }

    @Override
    public void onRenderSuccess(WXSDKInstance instance, int width, int height) {

    }

    @Override
    public void onRefreshSuccess(WXSDKInstance instance, int width, int height) {

    }

    @Override
    public void onException(WXSDKInstance instance, String errCode, String msg) {

    }
}
