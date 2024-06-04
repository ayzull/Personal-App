package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class timetable extends MainActivity {

    WebView wvTimetable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);

        getSupportActionBar().setTitle("Time Table");

        wvTimetable = findViewById(R.id.wv_timetable);

        WebSettings webSettings = wvTimetable.getSettings();
        webSettings.setJavaScriptEnabled(true);

        wvTimetable.loadUrl("file:///android_asset/html/time_table.html");
    }
}