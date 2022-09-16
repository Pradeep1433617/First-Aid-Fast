package com.example.clgproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class choke extends AppCompatActivity {
    WebView web;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choke);

        web=findViewById(R.id.other);
        WebSettings webSettings=web.getSettings();
        webSettings.setJavaScriptEnabled(true);


        web.setWebViewClient(new otherapps.Callback());
        web.loadUrl("https://drive.google.com/file/d/1aK5saYSGCYTRXRB0G1_hFs2QIFq3yDJN/view?usp=sharing");
    }

    public static class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }
    }
}