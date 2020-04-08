package com.example.nacwebview;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class ResultadoMr extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultadomr);

        WebView mlWeb = findViewById(R.id.americanas);
        mlWeb.setWebViewClient(new WebViewClient());

        mlWeb.getSettings().setJavaScriptEnabled(true);
        mlWeb.loadUrl("https://www.americanas.com.br");
    }
}
