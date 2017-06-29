package com.qiu.dagger;

import android.content.Context;

import dagger.Component;

/**
 * Created by qiuxunrong973 on 2017/6/28.
 */

@ApplicationScope
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    Context getApplicationContext ();
}
