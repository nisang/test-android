package com.alibaba.weex.extend.adapter;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.adapter.IWXImgLoaderAdapter;
import com.taobao.weex.common.WXImageStrategy;
import com.taobao.weex.dom.WXImageQuality;

/**
 * 图片适配器
 * Created by Administrator on 2016/8/15.
 * https://github.com/weexteam/article/issues/28
 */
public class ImageAdapter implements IWXImgLoaderAdapter {

    private Activity mContext;

    public ImageAdapter(Activity mContext) {
        this.mContext = mContext;
    }

    @Override
    public void setImage(final String url,final ImageView view, WXImageQuality quality, WXImageStrategy strategy) {
        mContext.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (TextUtils.isEmpty(url)) {
                    view.setImageBitmap(null);
                    return;
                }
                String temp = url;
                if (url.startsWith("//")) {
                    temp = "http://"+url;
                }
                Picasso.with(WXEnvironment.getApplication())
                        .load(temp)
                        .resize(view.getLayoutParams().width,
                                view.getLayoutParams().height).into(view);

            }
        });
    }
}
