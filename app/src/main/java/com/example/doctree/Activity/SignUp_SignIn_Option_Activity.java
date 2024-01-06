package com.example.doctree.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.doctree.R;

public class SignUp_SignIn_Option_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_sign_in);
    }

    public void go_to_signUp(View view) {
        startActivity(new Intent(SignUp_SignIn_Option_Activity.this, SignUpActivity.class));
        finish();
    }

    public void go_to_signIn(View view) {
        startActivity(new Intent(SignUp_SignIn_Option_Activity.this, SignInActivity.class));
        finish();
    }
}