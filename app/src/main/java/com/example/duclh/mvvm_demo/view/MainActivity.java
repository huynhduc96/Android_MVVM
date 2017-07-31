package com.example.duclh.mvvm_demo.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.duclh.mvvm_demo.BindingUtils;
import com.example.duclh.mvvm_demo.R;
import com.example.duclh.mvvm_demo.databinding.ActivityMainBinding;
import com.example.duclh.mvvm_demo.model.Article;
import com.example.duclh.mvvm_demo.viewmodel.MainViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Article> articles = new ArrayList<>();
    ActivityMainBinding binding;
    MainViewModel mainViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainViewModel = new MainViewModel(this,articles);
        binding.setViewModel(mainViewModel);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        binding.contactList.setLayoutManager(layoutManager);

        ArticleAdapter adapter = new ArticleAdapter(articles, this);
        BindingUtils.setAdapter(binding.contactList,adapter);
    }


}
