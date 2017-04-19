package com.work.dml.dml2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends Baseact {
    public Button top;
    public Button topleft;
    public Button left;
    public Button leftbot;
    public Button bot;
    public Button rightbot;
    public Button right;
    public Button topright;
    public Button back;
    public Button next;
    public Button button8;


    public void initmain(){
        top = (Button) findViewById(R.id.button8);
        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, Procedure.class);
                startActivity(intent);
            }
        });
    }
    public void initbtop(){
        top = (Button) findViewById(R.id.top);
        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, Top.class);
                startActivity(intent);
            }
        });
    }
    public void inittopleft(){
        topleft = (Button) findViewById(R.id.topleft);
        topleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, Topleft.class);
                startActivity(intent);
            }
        });
    }
    public void initleft(){
        left = (Button) findViewById(R.id.left);
        left .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, Left.class);
                startActivity(intent);
            }
        });
    }
    public void initleftbot(){
        leftbot = (Button) findViewById(R.id.leftbot);
        leftbot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, Leftbot.class);
                startActivity(intent);
            }
        });
    }
    public void initbot(){
        bot = (Button) findViewById(R.id.bot);
        bot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, Bot.class);
                startActivity(intent);
            }
        });
    }
    public void initrightbot(){
        rightbot = (Button) findViewById(R.id.rightbot);
        rightbot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, Rightbot.class);
                startActivity(intent);
            }
        });
    }
    public void initright(){
        right = (Button) findViewById(R.id.right);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, Right.class);
                startActivity(intent);
            }
        });
    }
    public void inittopright(){
        topright = (Button) findViewById(R.id.topright);
        topright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, Topright.class);
                startActivity(intent);
            }
        });
    }
    public void initback(){
        back = (Button) findViewById(R.id.backb);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
    public void initnext(){
        next = (Button) findViewById(R.id.nextb);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initbtop();
        inittopleft();
        initleft();
        initleftbot();
        initbot();
        initrightbot();
        initright();
        inittopright();
        initnext();
        initback();
        initmain();
    }
}
