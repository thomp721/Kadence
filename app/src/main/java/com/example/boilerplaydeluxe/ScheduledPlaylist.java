package com.example.boilerplaydeluxe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScheduledPlaylist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheduled_playlist);
    }

    public void ToMusicPlayer(View view) {
        Intent intent = new Intent(this, MusicPlayer.class);
        startActivity(intent);
    }

    public void AddSoundtrack(View view) {

    }
}
