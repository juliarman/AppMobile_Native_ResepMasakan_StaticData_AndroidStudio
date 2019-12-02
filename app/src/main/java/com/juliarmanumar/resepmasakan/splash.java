package com.juliarmanumar.resepmasakan;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends AppCompatActivity {

    Handler mulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        mulai = new Handler();
        mulai.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(splash.this, MainActivity.class);
                startActivity(intent);

            }
        }, 3000);

    }
}
