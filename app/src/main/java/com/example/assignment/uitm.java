package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class uitm extends MainActivity {

    WebView wvUitm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uitm);

        getSupportActionBar().setTitle("UiTM");

        wvUitm = findViewById(R.id.wv_uitm);
        wvUitm.setWebViewClient(new WebViewClient());
        wvUitm.loadUrl("https://uitm.edu.my/index.php/en/");

        WebSettings webSettings = wvUitm.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK && wvUitm.canGoBack()){
            wvUitm.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}