package com.example.clgproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class first extends AppCompatActivity {


    WebView web;


    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        web=findViewById(R.id.pdf);
        WebSettings webSettings=web.getSettings();
        webSettings.setJavaScriptEnabled(true);


        web.setWebViewClient(new Callback());
        web.loadUrl("https://drive.google.com/file/d/1dS5rYCrDs2oqHyR04LbUETE5F7z9kDlo/view?usp=sharing");
    }

    public static class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }
    }
}
