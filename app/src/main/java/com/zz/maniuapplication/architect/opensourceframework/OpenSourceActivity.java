package com.zz.maniuapplication.architect.opensourceframework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.zz.maniuapplication.R;
import com.zz.maniuapplication.architect.opensourceframework.glide.GlideActivity;

public class OpenSourceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_source);
    }

    public void glide(View view) {
        Intent intent = new Intent(OpenSourceActivity.this, GlideActivity.class);
        startActivity(intent);
    }

    public void hilt(View view) {
        Intent intent = new Intent(OpenSourceActivity.this, GlideActivity.class);
        startActivity(intent);
    }
}