package com.bwei.frame;

import dagger.Component;

/**
 * 1. 类的用途  桥梁 关联调用者和容器
 * 2. @author forever
 * 3. @date 2017/12/3 12:38
 */

@Component(modules = ShowListModule.class)
public interface ShowListComponent {
    //注入方法   调用者
    void inject(MainActivity mainActivity);

}
