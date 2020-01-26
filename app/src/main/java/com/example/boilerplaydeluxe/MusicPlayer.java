package com.example.boilerplaydeluxe;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Scanner;
import java.io.IOException;
import java.util.Random;

public class MusicPlayer extends AppCompatActivity {
    Scanner s = new Scanner(System.in);
    private double timeRemaining;
    private com.example.Library.Soundtrack[] soundtrack;
    public MusicPlayer(com.example.Library.Soundtrack[] soundtrack) {
        this.soundtrack = soundtrack;
        System.out.println("Enter a number of minutes you would like to listen to music for");
        timeRemaining = s.nextDouble();
        onCreate(new Bundle());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer mp = new MediaPlayer();
        while(timeRemaining > 0) {
            for (int i = 0; i < soundtrack.length; i++) {
                MusicPlayerSetup mps = new MusicPlayerSetup(soundtrack[i].getHeartRate());
                try {
                    com.example.Library.DbRetrieve dbr = new com.example.Library.DbRetrieve();
                    mp.setDataSource(dbr.retrieveSongUID(soundtrack[i].getGenre(), mps.getMusicLevel(),
                            (int) (Math.random() * 5 + 1)));
                    timeRemaining = timeRemaining - soundtrack[i].getTime();
                    if (timeRemaining <= 0) {
                        break;
                    }

                } catch (IOException io) {

                }
            }
        }
    }
}
