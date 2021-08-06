package com.example.shortvideosharingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        //object of the button, which needs data
        TextView button = findViewById(R.id.alreadyHaveAccount);
        //settting up the set on click listner
        button.setOnClickListner(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        })
    }
}