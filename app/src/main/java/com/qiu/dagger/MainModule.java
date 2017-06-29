package com.qiu.dagger;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by qiuxunrong973 on 2017/6/27.
 */

@Module
public class MainModule {
    @ActivityScope
    @Provides
    Test provideTest(Context context) {
        return new Test(context);
    }
}
