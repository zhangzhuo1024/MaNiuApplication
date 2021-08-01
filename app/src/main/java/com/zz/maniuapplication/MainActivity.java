package com.zz.maniuapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.zz.maniuapplication.architect.opensourceframework.OpenSourceActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openSourceFramework(View view) {
        Intent intent = new Intent(MainActivity.this, OpenSourceActivity.class);
        startActivity(intent);
    }
}