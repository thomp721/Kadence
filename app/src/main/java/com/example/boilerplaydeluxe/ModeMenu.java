package com.example.boilerplaydeluxe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ModeMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_menu);
        Button hBTN = findViewById(R.id.TempoBTN);
        Button mBTN = findViewById(R.id.TempoBTN);
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
