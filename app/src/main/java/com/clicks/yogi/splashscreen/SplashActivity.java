package com.clicks.yogi.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

    final Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                // 10000 mili seconds = 1 second.
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            startActivity(new Intent(SplashActivity.this,MainActivity.class));
        }
    });
    thread.start();
    }
}