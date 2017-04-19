package com.work.dml.dml2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends Baseact {
    public Button back;
    public Button email;
    public Button inact;
    public Button onact;
    public Button beyond;

    public void initemail(){
        email = (Button) findViewById(R.id.email);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, Emailout.class);
                startActivity(intent);
            }
        });
    }
    public void initinact(){
        inact = (Button) findViewById(R.id.inact);
        inact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, Inaction.class);
                startActivity(intent);
            }
        });
    }
    public void initonact(){
        onact = (Button) findViewById(R.id.onact);
        onact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, Onaction.class);
                startActivity(intent);
            }
        });
    }
    public void initback(){
        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }
    public void initbeyond(){
        beyond = (Button) findViewById(R.id.beyond);
        beyond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, Beyond.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        initback();
        initbeyond();
        initemail();
        initinact();
        initonact();

    }
}
