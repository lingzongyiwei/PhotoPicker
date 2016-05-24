/*
 * Copyright (C) 2014 pengjianbo(pengjianbosoft@gmail.com), Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.luosifan.photopicker;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;

import com.luosifan.photopicker.view.GFImageView;

import java.io.Serializable;


/**
 * Desction:imageloader抽象类，外部需要实现这个类去加载图片， GalleryFinal尽力减少对第三方库的依赖，所以这么干了
 * Author:pengjianbo
 * Date:15/10/10 下午5:27
 * Updated by wzfu on 2016/5/22.
 */
public abstract class ImageLoader {

    public abstract void displayImage(Context mCxt,
                      String path,
                      GFImageView imageView,
                      int tagId, // 用于图片列表在滑动的时候，调用pause()取消请求，滑动停止时，调用resume()恢复请求
                      int placeholderResId,
                      int errorResId,
                      int width, int height);

    public View displayPreview(Context mCxt, String path,
                               int placeholderResId, int errorResId,
                               OnPhotoClickListener listener) {
        return null;
    }

    public void clearMemoryCache() {

    }

    /**
     * 图片列表滑动监听
     * @param view
     * @param scrollState <a href="http://dwz.cn/3pQB58" >OnScrollListener回调分析</>
     */

    public void onScrollStateChanged(AbsListView view, int scrollState, int tag) {

    }
}
