package com.qiu.dagger;

import android.app.Application;

/**
 * Created by qiuxunrong973 on 2017/6/27.
 */

public class MyApplication extends Application {
    public ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
