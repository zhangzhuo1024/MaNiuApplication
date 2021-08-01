package com.zz.maniuapplication.architect.opensourceframework.glide;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.zz.maniuapplication.R;

public class GlideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);
        ImageView viewById = findViewById(R.id.imageView);

        String url = "http://cn.bing.com/az/hprichbg/rb/TOAD_ZH-CN7336795473_1920x1080.jpg";

        RequestManager requestManager = Glide.with(this);
        RequestBuilder<Drawable> requestBuilder = requestManager.load(url);
        requestBuilder.into(viewById);

        Glide.with(this)
                .load(url)
                .into(viewById);
    }
}