package com.example.nacwebview;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class ResultadoEb extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultadoeb);

        WebView mlWeb = findViewById(R.id.ebay);
        mlWeb.setWebViewClient(new WebViewClient());

        mlWeb.getSettings().setJavaScriptEnabled(true);
        mlWeb.loadUrl("https://www.ebay.com");
    }
}
