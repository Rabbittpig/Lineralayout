package com.example.lineralayout.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.lineralayout.R;

public class WebViewActivity extends AppCompatActivity {
    private WebView mWvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        mWvMain = findViewById(R.id.wv);
        /**
         * 加载本地html
         */
       // mWvMain.loadUrl("file:///android_asset/test.html");
        /**
         * 加载网络url
         */
        mWvMain.getSettings().setJavaScriptEnabled(true);
        mWvMain.setWebViewClient(new MyWebViewClient());
//        mWvMain.setWebChromeClient();
        mWvMain.loadUrl("https://m.baidu.com");
    }
    class MyWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(request.getUrl().toString());
            return true;
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            Log.d("WebView","onPageStarted...");
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            Log.d("WebView","onPageFinished...");
        }
    }

    class MyWebChromeClient extends WebChromeClient{

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode ==KeyEvent.KEYCODE_BACK &&mWvMain.canGoBack()){
            mWvMain.goBack();
            return true;

        }
        return super.onKeyDown(keyCode, event);
    }
}