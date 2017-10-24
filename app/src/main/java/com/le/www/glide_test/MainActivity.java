package com.le.www.glide_test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView)findViewById(R.id.iv);
        Glide.with(MainActivity.this)
                .load("http://i1.letvimg.com//lc03_iptv//201706//13//13//50//tmp10cf626e-4099-4b3b-99a9-b6e709de7ac8256.png")
                .into(imageView);

    }
}
