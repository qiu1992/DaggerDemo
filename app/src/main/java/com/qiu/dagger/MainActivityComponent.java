package com.qiu.dagger;

import dagger.Component;

/**
 * Created by qiuxunrong973 on 2017/6/27.
 */
@ActivityScope
@Component(modules = {MainModule.class}, dependencies = {ApplicationComponent.class})
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}
