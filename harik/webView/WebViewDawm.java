package com.harik.webView;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.harik.lenovo2017.dawmrappel.R;

public class WebViewDawm extends Activity {
private WebView wb;
 public static final String  URL="http://hespress.ma";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        wb= (WebView) findViewById(R.id.webview1);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.getSettings().setAppCacheEnabled(true);
        wb.getSettings().setDomStorageEnabled(true);
       wb.loadUrl(URL);
        wb.setWebViewClient(new MonWebClient());
wb.reload();

        Intent i = getIntent();
        if(i!=null  && i.getAction()==Intent.ACTION_VIEW){
            wb.loadUrl(URL);
            Toast.makeText(this, "SCHEME "+i.getDataString()+" DATA "+i.getData().getHost(), Toast.LENGTH_SHORT).show();
            wb.reload();
        }



    }


    class MonWebClient extends WebViewClient{
        ProgressDialog prd=null;
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            prd=new ProgressDialog(WebViewDawm.this);
            prd.setTitle("Loading...");

            prd.setMessage("veuillez attendre du chargemement complet de la page ");
            prd.show();
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            if(prd!=null && prd.isShowing())
            prd.dismiss();
        }

        @Override
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
        }
    }
}
