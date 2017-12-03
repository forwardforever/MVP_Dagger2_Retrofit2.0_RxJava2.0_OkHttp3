package com.bwei.frame;

import android.util.Log;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Flowable;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 1. 类的用途
 * 2. @author forever
 * 3. @date 2017/12/3 12:56
 */


public class ShowListModel {
    @Inject
    public ShowListModel() {
    }

    public Flowable<Infos> getData() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.i("xxx", message);
            }
        });
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Api.url).addConverterFactory(GsonConverterFactory.create()).
                addCallAdapterFactory(RxJava2CallAdapterFactory.create()).client(okHttpClient).build();

        ApiService apiService = retrofit.create(ApiService.class);
        Flowable<Infos> flowable = apiService.getData("笔记本", 1, "android");


  return flowable;
    }
    public Flowable<List<ShowInfo>> getListData(){
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.i("xxx", message);
            }
        });
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Api.url).addConverterFactory(GsonConverterFactory.create()).
                addCallAdapterFactory(RxJava2CallAdapterFactory.create()).client(okHttpClient).build();

        ApiService apiService = retrofit.create(ApiService.class);
        Flowable<List<ShowInfo>> flowable = apiService.getData("26868b32e808498db32fd51fb422d00175e179df", 83);
        return flowable;
    }
}
