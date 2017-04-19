package com.work.dml.dml2;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends Baseact {
    String Name = "";
    public Button b1;
    public Button b2;
    public Button b3;
    public Button b4;
    public Button b5;
    public Button nxb;
    String filename = "Name1.txt";


    public void initnext(){
        nxb = (Button) findViewById(R.id.nextbutt);
        nxb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitText();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    public void initb1(){
        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitText();
                Intent intent = new Intent(MainActivity.this, WhatIsTheFirstThingThatComesToMind.class);
                startActivity(intent);
            }
        });
    }

    public void initb2(){
        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitText();
                Intent intent = new Intent(MainActivity.this, WhatWentRight.class);
                startActivity(intent);
            }
        });
    }

    public void initb3(){
        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitText();
                Intent intent = new Intent(MainActivity.this, DoDifferently.class);
                startActivity(intent);
            }
        });
    }

    public void initb4(){
        b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitText();
                Intent intent = new Intent(MainActivity.this, Framing.class);
                startActivity(intent);
            }
        });
    }

    public void initb5(){
        b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitText();
                Intent intent = new Intent(MainActivity.this, Focus.class);
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initb1();
        initb2();
        initb3();
        initb4();
        initb5();
        initnext();
        Name = readfile(filename);
        if(!(Name.equals(""))){
            EditText response = (EditText) findViewById(R.id.myName);
            response.setText(Name, TextView.BufferType.EDITABLE);
            //Toast.makeText(getBaseContext(), Name, Toast.LENGTH_LONG).show();
        }
    }


    public void submitText(){
        EditText response = (EditText) findViewById(R.id.myName);
        Name = response.getText().toString();
        savefile(filename, Name);

    }
}
