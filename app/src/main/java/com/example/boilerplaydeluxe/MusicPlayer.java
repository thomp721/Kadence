package com.example.boilerplaydeluxe;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.Library.MusicPlayerSetup;


import java.io.IOException;

public class MusicPlayer extends AppCompatActivity {

    private double timeRemaining;
    private com.example.Library.Soundtrack[] soundtrack;
    public MusicPlayer(com.example.Library.Soundtrack[] soundtrack) {
        this.soundtrack = soundtrack;

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
