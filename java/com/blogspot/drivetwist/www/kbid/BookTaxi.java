package com.blogspot.drivetwist.www.kbid;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class BookTaxi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_taxi);
        WebView zodiac=(WebView)findViewById(R.id.taxi);
        //zodiac.getSettings().setLoadsImagesAutomatically(true);
        //zodiac.getSettings().setJavaScriptEnabled(true);
        zodiac.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        zodiac.loadUrl("https://www.uber.com/en-IN/sign-in/");

    }
}

