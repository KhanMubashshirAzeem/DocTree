package com.example.doctree.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.doctree.R;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void go_to_main_activity(View view) {
        startActivity(new Intent(SignUpActivity.this, MainActivity.class));
        finish();
    }

    public void go_to_signIn(View view) {
        startActivity(new Intent(SignUpActivity.this, SignInActivity.class));
        finish();
    }
}