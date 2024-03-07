package com.coderfaysal.abubakrra;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WebView extends AppCompatActivity {

    android.webkit.WebView webView;
    public static String BOOK_URL = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);


        webView = findViewById(R.id.webView);

        webView.loadUrl(BOOK_URL);

        webView.getSettings().setJavaScriptEnabled(true);


    }
}