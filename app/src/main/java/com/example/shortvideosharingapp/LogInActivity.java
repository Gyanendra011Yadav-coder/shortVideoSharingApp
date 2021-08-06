package com.example.shortvideosharingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        //creating the object of the textViewButton-signUpTextView
        TextView button = findViewById(R.id.signUpTextView);
        button.setOnClickListner(new.OnClickListner(){

            public void onClick(View v) {
                startActivity(new Intent(LogInActivity.this,RegisterActivity.class));
            }
        });
    }
}