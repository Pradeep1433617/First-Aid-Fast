package com.example.clgproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class otherapps extends AppCompatActivity {

    WebView web;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otherapps);

        web=findViewById(R.id.other);
        WebSettings webSettings=web.getSettings();
        webSettings.setJavaScriptEnabled(true);


        web.setWebViewClient(new Callback());
        web.loadUrl("https://play.google.com/store/apps/details?id=com.healthifyme.basic");
    }

    public static class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }
    }
}