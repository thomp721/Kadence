package com.example.boilerplaydeluxe;
;
import android.content.Context;
import android.os.Bundle;

import com.example.Library.Soundtrack;
import com.example.Library.SoundtrackWrapper;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String FILE_NAME = "SoundtrackQueue.txt";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
            }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void Welcome() {
        Toast.makeText(getApplicationContext(), "Welcome to Beatmaker!", Toast.LENGTH_SHORT).show();
    }

    public void Clicked(View v)
    {
        SoundtrackWrapper rapper = new SoundtrackWrapper();

        Soundtrack one = new Soundtrack();
        Soundtrack two = new Soundtrack();
        Soundtrack three = new Soundtrack();

        one.setGenre("Leggo ma Eggo");
        one.setHeartRate(69);
        one.setTime(69.69);

        two.setGenre("The fourth wall is well and truly gone");
        two.setHeartRate(96);
        two.setTime(96.96);

        three.setGenre("All your base");
        three.setHeartRate(20);
        three.setTime(123.0);

        Soundtrack Test[] = new Soundtrack[2];
        Test[0] = one;
        Test[1] = two;
        Test[2] = three;

        rapper.SaveSoundtrackQueue(Test, getApplicationContext().getApplicationContext());
    }


}
