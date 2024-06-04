package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class aboutme extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutme);
        getSupportActionBar().setTitle("About Me");
    }
}