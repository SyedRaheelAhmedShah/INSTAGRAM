package com.example.instagram;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Sign_up_Page extends AppCompatActivity {

    TextView loginPageFromsignup, homePageFromSignupPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);

        homePageFromSignupPageMethod();
        loginPageFromsignupMethod();
    }

    private void loginPageFromsignupMethod() {
        this.loginPageFromsignup = findViewById(R.id.loginPageFromsignup);
        this.loginPageFromsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sign_up_Page.this, Log_in_Page.class);
                startActivity(intent);
            }
        });
    }

    private void homePageFromSignupPageMethod() {
        this.homePageFromSignupPage = findViewById(R.id.homePageFromSignupPage);
        this.homePageFromSignupPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sign_up_Page.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}