package com.example.nacwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mlBrowser(View view) {
        Intent mlIntent = new Intent(this, com.example.nacwebview.ResultadoML.class);
        startActivity(mlIntent);
    }
    public void SBBrowser(View view) {
        Intent SBIntent = new Intent(this, com.example.nacwebview.ResultadoSB.class);
        startActivity(SBIntent);
    }
    public void EbBrowser(View view) {
        Intent EbIntent = new Intent(this, com.example.nacwebview.ResultadoEb.class);
        startActivity(EbIntent);
    }
    public void MrBrowser(View view) {
        Intent MrIntent = new Intent(this, com.example.nacwebview.ResultadoMr.class);
        startActivity(MrIntent);
    }
    public void ButtonS(View view) {
        Intent ButtonS = new Intent(this, com.example.nacwebview.ButtonS.class);
        startActivity(ButtonS);
    }

}