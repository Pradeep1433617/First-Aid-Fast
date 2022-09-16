package com.example.clgproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class weezing extends AppCompatActivity {

    WebView web;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weezing);

        web=findViewById(R.id.other);
        WebSettings webSettings=web.getSettings();
        webSettings.setJavaScriptEnabled(true);


        web.setWebViewClient(new otherapps.Callback());
        web.loadUrl("https://drive.google.com/file/d/1Mfc8OPCx3ngwt3A664juHFFkq2FiKoQK/view?usp=sharing");
    }

    public static class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }
    }
}