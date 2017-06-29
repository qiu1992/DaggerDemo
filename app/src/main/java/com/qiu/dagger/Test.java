package com.qiu.dagger;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

/**
 * Created by qiuxunrong973 on 2017/6/27.
 */

public class Test {

    private Context context;

    @Inject
    public Test(Context context) {
        this.context = context;
    }

    public void printHelloWorld() {
        System.out.println("hello world");
        Toast.makeText(context, "params inject", Toast.LENGTH_SHORT).show();
    }
}
