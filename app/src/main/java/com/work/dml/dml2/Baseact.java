package com.work.dml.dml2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by dreifuerstrm on 4/18/2017.
 */

public class Baseact extends AppCompatActivity{
    String text;
    public void savefile(String file, String text){
        try{
            FileOutputStream fos = openFileOutput(file, Context.MODE_PRIVATE);
            fos.write(text.getBytes());
            fos.close();
            //Toast.makeText(MainActivity.this, "SAVED!", Toast.LENGTH_LONG).show();
        } catch(Exception e){
            e.printStackTrace();
            //Toast.makeText(MainActivity.this, "Error Saving File", Toast.LENGTH_LONG).show();
        }
    }
    public String readfile(String file){
        try{
            FileInputStream fis = openFileInput(file);
            int size = fis.available();
            byte[] buffer = new byte[size];
            fis.read(buffer);
            fis.close();
            text = new String(buffer);
        }catch (Exception e){
            e.printStackTrace();
            //Toast.makeText(MainActivity.this, "Error Saving File", Toast.LENGTH_LONG).show();
        }
        return text;
    }
}
