package com.bwei.frame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements ShowListView{
    @Inject
   ShowListPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     DaggerShowListComponent.builder().showListModule(new ShowListModule(this)).build().inject(this);
        presenter.attachView(this);
        presenter.relevanceData();
    }

    @Override
    public void showData(List<ShowInfo> showInfos) {


    }
}
