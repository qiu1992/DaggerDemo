package com.qiu.dagger;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by qiuxunrong973 on 2017/6/28.
 */

@Scope
@Documented
@Retention(RUNTIME)
public @interface ActivityScope {
}
