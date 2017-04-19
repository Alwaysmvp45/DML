package com.work.dml.dml2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends Baseact {
    public Button b6;
    public Button b7;
    public Button b8;
    public Button b9;
    public Button back;
    public Button next;

    public void initb6(){
        b6 = (Button) findViewById(R.id.butt6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, DesiredOutcome.class);
                startActivity(intent);
            }
        });
    }
    public void initb7(){
        b7 = (Button) findViewById(R.id.butt7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, NursingInt.class);
                startActivity(intent);
            }
        });
    }
    public void initb8(){
        b8 = (Button) findViewById(R.id.butt8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, ClientResponse.class);
                startActivity(intent);
            }
        });
    }
    public void initb9(){
        b9 = (Button) findViewById(R.id.butt9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, EvalandSum.class);
                startActivity(intent);
            }
        });
    }
    public void initback(){
        back = (Button) findViewById(R.id.backb);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void initnext(){
        next = (Button) findViewById(R.id.nextb);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initb6();
        initb7();
        initb8();
        initb9();
        initnext();
        initback();
    }
}
