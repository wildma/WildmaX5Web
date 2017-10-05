package com.wildma.wildmax5web;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (com.tencent.smtt.sdk.WebView) findViewById(R.id.webview);
        mWebView.getSettings().setJavaScriptEnabled(true);// 支持js
        mWebView.setWebViewClient(new WebViewClient());//防止加载网页时调起系统浏览器
        mWebView.loadUrl("http://mp.weixin.qq.com/s/6QiZXzpUSuJKjoIoKovgtg");
    }
}
