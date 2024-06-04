package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class hobbies extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbies);
        getSupportActionBar().setTitle("Hobbies");
    }
}