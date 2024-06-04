package com.example.assignment;


import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class istudent extends MainActivity {

    WebView wvPortal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_istudent);

        getSupportActionBar().setTitle("iStudent Portal");

        wvPortal = findViewById(R.id.wv_portal);
        wvPortal.setWebViewClient(new WebViewClient());
        wvPortal.loadUrl("https://simsweb.uitm.edu.my/SPORTAL_APP/SPORTAL_LOGIN/index_login.htm");

        WebSettings webSettings = wvPortal.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK && wvPortal.canGoBack()){
            wvPortal.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}