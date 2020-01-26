package com.example.boilerplaydeluxe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ModeMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_menu);
    }

    public void ToHeartRateMenu(View v)
    {
        Intent intent = new Intent(this, HeartRateMenu.class);
        startActivity(intent);
    }
    public void ToScheduledMenu(View v)
    {

        Intent intent = new Intent(this, ScheduledPlaylist.class);
        startActivity(intent);

    }

}
