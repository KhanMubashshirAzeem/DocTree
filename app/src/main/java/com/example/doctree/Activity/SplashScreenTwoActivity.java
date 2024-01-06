package com.example.doctree.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.doctree.R;

public class SplashScreenTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_two);


    }

    public void get_started(View view) {
        startActivity(new Intent(SplashScreenTwoActivity.this, SignUp_SignIn_Option_Activity.class));
        finish();
    }
}