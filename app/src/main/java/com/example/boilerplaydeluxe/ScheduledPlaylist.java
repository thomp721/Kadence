package com.example.boilerplaydeluxe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class ScheduledPlaylist extends AppCompatActivity {

    List<Spinner> Spinners = new ArrayList<Spinner>();
    Button AddBTN;
    FloatingActionButton NextBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toast.makeText(this, "dsgfoinf", Toast.LENGTH_LONG);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheduled_playlist);

        NextBTN = findViewById((R.id.PlayBTN));


    }

    public void ToMusicPlayer(View view) {
        Intent intent = new Intent(this, MusicPlayer.class);
        startActivity(intent);

    }

    public void AddSoundtrack(View view) {
        //ScrollView MyRoot = (ScrollView) findViewById(R.id.RootScroll);
        Toast.makeText(this, "jsdnminb", Toast.LENGTH_LONG);
        /*
        LinearLayout a = new LinearLayout(this);
        a.setOrientation(LinearLayout.HORIZONTAL);
        MyRoot.addView(a);
        Spinner spin = new Spinner(this);
        Spinner spin2 = new Spinner(this);
        Spinner spin3 = new Spinner(this);
        */


        /*

                        android:layout_width="120dp"
                android:layout_height="match_parent"

         */
/*
        Spinner.LayoutParams layoutParams = spin.getLayoutParams();

        layoutParams.height = 50;
        layoutParams.width = 120;

        spin.setLayoutParams(layoutParams);
        spin2.setLayoutParams(layoutParams);
        spin3.setLayoutParams(layoutParams);

        Spinners.add(spin);
        Spinners.add(spin2);
        Spinners.add(spin3);


        a.addView(spin);
        a.addView(spin2);
        a.addView(spin3);
*/
    }
}
