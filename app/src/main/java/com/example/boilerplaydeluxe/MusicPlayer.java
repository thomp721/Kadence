package com.example.boilerplaydeluxe;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Scanner;
import java.io.IOException;

public class MusicPlayer extends AppCompatActivity {
    Scanner s = new Scanner(System.in);
    private double timeRemaining;
    private int[] soundtrack;
    public MusicPlayer(int[] soundtrack) {
        this.soundtrack = soundtrack;
        System.out.println("Enter a number of minutes you would like to listen to music for");
        timeRemaining = s.nextDouble();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer mp = new MediaPlayer();
        try {
            mp.setDataSource("/sdcard/Music/maine.mp3");
            timeRemaining = timeRemaining - mp.getDuration();

        } catch(IOException io) {

        }
    }
}
