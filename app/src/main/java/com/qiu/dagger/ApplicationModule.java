package com.qiu.dagger;

import android.content.Context;
import android.location.LocationManager;

import dagger.Module;
import dagger.Provides;

/**
 * Created by qiuxunrong973 on 2017/6/28.
 */

@Module
public class ApplicationModule {
    private final MyApplication myApplication;

    public ApplicationModule(MyApplication myApplication) {
        this.myApplication = myApplication;
    }

    @Provides
    @ApplicationScope
    public Context provideApplicationContext() {
        return myApplication;
    }

    @Provides
    @ApplicationScope
    public LocationManager provideLocationManager() {
        return (LocationManager) myApplication.getSystemService(Context.LOCATION_SERVICE);
    }
}
