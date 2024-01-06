package com.example.doctree.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.doctree.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the main activity
                startActivity(new Intent(SplashScreenActivity.this, SplashScreenTwoActivity.class));
                finish();
            }
        }, 2000); // Delay for 2000 milliseconds (2 seconds)
    }
}