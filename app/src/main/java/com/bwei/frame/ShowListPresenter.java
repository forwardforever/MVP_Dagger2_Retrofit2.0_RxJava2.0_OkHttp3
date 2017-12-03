package com.bwei.frame;

import android.util.Log;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;

/**
 * 1. 类的用途
 * 2. @author forever
 * 3. @date 2017/12/3 12:36
 */


public class ShowListPresenter {
    private ShowListView view;
    @Inject
    ShowListModel model;

    @Inject
    public ShowListPresenter() {
    }

    public void relevanceData() {
       /* Flowable<Infos> flowable = model.getData();
        flowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSubscriber<Infos>() {
                    @Override
                    public void onNext(Infos infos) {
                        Log.i("xxx", infos.getMsg());
                    }

                    @Override
                    public void onError(Throwable t) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });*/
        Flowable<List<ShowInfo>> listData = model.getListData();
        listData.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSubscriber<List<ShowInfo>>() {
                    @Override
                    public void onNext(List<ShowInfo> showInfos) {
                        String name = showInfos.get(0).getName();
                        Log.i("xxx",name);
                    }

                    @Override
                    public void onError(Throwable t) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public void attachView(ShowListView view) {
        this.view = view;


    }
}
