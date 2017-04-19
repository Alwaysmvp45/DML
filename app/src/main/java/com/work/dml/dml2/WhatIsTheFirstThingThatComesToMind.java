package com.work.dml.dml2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WhatIsTheFirstThingThatComesToMind extends Baseact {
    String filename = "Response1.txt";
    String response1 = "";
    public Button b;

    public void initb(){
        b = (Button) findViewById(R.id.Done1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitText();
                Intent intent = new Intent(WhatIsTheFirstThingThatComesToMind.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_is_the_first_thing_that_comes_to_mind);
        initb();
        response1 = readfile(filename);
        if(response1 != "") {
            EditText response = (EditText) findViewById(R.id.response1);
            response.setText(response1, TextView.BufferType.EDITABLE);
        }
    }

    public void submitText(){
        EditText response = (EditText) findViewById(R.id.response1);
        String mine = response.getText().toString();
        savefile(filename, mine);
    }
}
