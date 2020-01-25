package com.example.Library;
import android.content.Context;
import android.widget.Toast;

import com.example.Library.Soundtrack;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class SoundtrackWrapper {

    private static final String File_Name = "hhhhh";




    public void SaveSoundtrackQueue(String args[], Soundtrack[] SoundtrackArray, Context c)
    {


        String text = "";
        FileOutputStream fos = null;

        try {
            fos = c.openFileOutput(File_Name, Context.MODE_PRIVATE);


            for(int i =1; i <= SoundtrackArray.length; i++)
            {
                fos.write((SoundtrackArray[i].getTime() + "," + SoundtrackArray[i].getGenre() + "," +
                SoundtrackArray[i].getHeartRate()).getBytes());
            }

            Toast.makeText(c, "Saved to " + c.getFilesDir() + "/" + File_Name, Toast.LENGTH_SHORT).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }finally {
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }




    }
    public void LoadSoundtrackQueue(String args[], Soundtrack[] SoundtrackArray, Context c)
    {
        String text;
        FileInputStream fis = null;

        try {
            fis = c.openFileInput(File_Name);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();

            while((text = br.readLine())!= null)
            {

                Soundtrack s = new Soundtrack();
                sb.append(text).append("\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
