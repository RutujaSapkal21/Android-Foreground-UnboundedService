package com.example.androidservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Mediaplayerservi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediaplayerservi);
    }

    public void startsong(View view) {

        Intent intent=new Intent(Mediaplayerservi.this,MediaPlayerService.class);
        startService(intent);
    }

    public void stopsong(View view) {
        Intent intent=new Intent(Mediaplayerservi.this,MediaPlayerService.class);
        stopService(intent);

    }
}