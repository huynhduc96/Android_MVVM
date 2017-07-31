package com.example.duclh.mvvm_demo;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;

import com.example.duclh.mvvm_demo.view.ArticleAdapter;

/**
 * Created by duclh on 31/07/2017.
 */

public class BindingUtils {
    @BindingAdapter("setAdapter")
    public static void setAdapter(RecyclerView recyclerView, ArticleAdapter adapter) {
        recyclerView.setAdapter(adapter);
    }
}
