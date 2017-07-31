package com.example.duclh.mvvm_demo.view;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.duclh.mvvm_demo.R;
import com.example.duclh.mvvm_demo.databinding.ActivityReadMoreBinding;
import com.example.duclh.mvvm_demo.model.Article;
import com.example.duclh.mvvm_demo.viewmodel.ReadMoreViewModel;

import java.io.Serializable;

public class ReadMoreActivity extends AppCompatActivity {
    private static final String EXTRA_ARTICLE = "EXTRA_ARTICLE";
    ActivityReadMoreBinding activityReadMoreBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityReadMoreBinding = DataBindingUtil.setContentView(this,R.layout.activity_read_more);
        getExtrasFromIntent();
    }
    public static Intent launchDetail(Context context, Article article) {
        Intent intent = new Intent(context, ReadMoreActivity.class);
        intent.putExtra(EXTRA_ARTICLE, (Serializable) article);
        return intent;
    }

    private void getExtrasFromIntent() {
        Article article = (Article) getIntent().getSerializableExtra(EXTRA_ARTICLE);
        ReadMoreViewModel readMoreViewModel = new ReadMoreViewModel(article,getApplicationContext());
        activityReadMoreBinding.setAvm(readMoreViewModel);}
}
