package com.example.boilerplaydeluxe;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.Library.MusicPlayerSetup;


import java.io.IOException;

public class MusicPlayer extends AppCompatActivity {

    private double timeRemaining;
    private com.example.Library.Soundtrack[] soundtrack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
