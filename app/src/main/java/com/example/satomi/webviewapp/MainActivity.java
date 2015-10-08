package com.example.satomi.webviewapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.app.Activity;
import android.webkit.WebView;

public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // myWebViewのインスタンスを取得
        WebView myWebView = (WebView)findViewById(R.id.myWebView);

        // htmlデータを表示
        myWebView.loadUrl("https://github.com/rei-yu/MyFirstAndroidApp");
    }
}
