package com.cstewart.android.jniexample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    public native String stringFromJNI();

    static {
        System.loadLibrary("JniExample");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.activity_main_textview);

        String stringFromJni = stringFromJNI();
        textView.setText(stringFromJni);
    }

}
