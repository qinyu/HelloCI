package com.tw.demo;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    private AsyncTask<Void, Void, Boolean> asyncTask;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        WebView webView = new WebView(this);
        String url = "http://ieat.thoughtworks.biz";
        webView.loadUrl(url);

        WebViewClient client = new WebViewClient();
        client.shouldOverrideUrlLoading(webView, url);
        webView.setWebViewClient(client);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setSavePassword(false);
        setContentView(webView);

    }
}
