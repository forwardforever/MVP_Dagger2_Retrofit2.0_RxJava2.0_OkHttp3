package com.bwei.frame;

import dagger.Module;

/**
 * 1. 类的用途 容器
 * 2. @author forever
 * 3. @date 2017/12/3 12:26
 */

@Module
public class ShowListModule {

    //view实例
    private ShowListView view;

    public ShowListModule(ShowListView view) {
        this.view = view;
    }
}
