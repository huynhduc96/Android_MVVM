package com.example.duclh.mvvm_demo.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.duclh.mvvm_demo.BR;
import com.example.duclh.mvvm_demo.R;
import com.example.duclh.mvvm_demo.model.Article;

/**
 * Created by duclh on 31/07/2017.
 */

public class ReadMoreViewModel extends BaseObservable {
    private Article mArticle;
    private Context mContext;

    public ReadMoreViewModel(Article mArticle, Context mContext) {
        this.mArticle = mArticle;
        this.mContext = mContext;
    }

    @Bindable
    public String getTitle() {
        return mArticle.getTitle();
    }

    public void setTitle(String title) {
        mArticle.setTitle(title);
        notifyPropertyChanged(BR.title);
    }

    public int getCardBackgroundColor() {
        return mArticle.isHighlight() ?
                ContextCompat.getColor(mContext, R.color.highlight) :
                Color.parseColor("#ffffffff");
    }

    public String getExcerpt() {
        return mArticle.getMoreRead();
    }

    public String getImageUrl() {
        return mArticle.getImageUrl();
    }

    @BindingAdapter({"image"})
    public static void loadImage(ImageView view, String url) {
        Glide.with(view.getContext()).load(url).centerCrop().into(view);
    }
}
