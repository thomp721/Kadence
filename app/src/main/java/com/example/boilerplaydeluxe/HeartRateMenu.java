package com.example.boilerplaydeluxe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HeartRateMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_rate_menu);
    }

    public void HRToMusicPlayer(View view) {
        Intent intent = new Intent(this, MusicPlayer.class);
        startActivity(intent);
    }
}
