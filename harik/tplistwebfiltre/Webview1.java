package com.harik.tplistwebfiltre;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.harik.lenovo2017.dawmrappel.R;

public class Webview1 extends Activity {
WebView wb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview1);



    wb= (WebView) findViewById(R.id.webviewsites);
wb.getSettings().setJavaScriptEnabled(true);
        wb.setWebViewClient(new WebViewClient());

        Intent i = getIntent();
        if (i!=null && i.hasExtra("lien")){
            String lien = i.getStringExtra("lien");
            wb.loadUrl(lien);
        }
    }
}
