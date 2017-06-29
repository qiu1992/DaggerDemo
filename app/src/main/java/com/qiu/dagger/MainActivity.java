package com.qiu.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public Test test;

    @Inject
    public Test test2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DaggerMainActivityComponent
//                .builder()
//                .mainModule(new MainModule())
//                .build()
//                .inject(this);

        DaggerMainActivityComponent
                .builder()
                .applicationComponent(((MyApplication) getApplication()).getApplicationComponent())
                .mainModule(new MainModule())
                .build()
                .inject(this);

        findViewById(R.id.test_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test.printHelloWorld();
                test2.printHelloWorld();
            }
        });
    }
}
