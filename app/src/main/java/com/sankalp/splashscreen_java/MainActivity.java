package com.sankalp.splashscreen_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    public static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent welcomePage = new Intent(MainActivity.this, WelcomePage.class);
                startActivity(welcomePage);
                finish();
            }
        },SPLASH_TIME_OUT);
    }

}