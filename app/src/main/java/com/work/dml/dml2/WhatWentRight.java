package com.work.dml.dml2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WhatWentRight extends Baseact {
    String filename = "Response2.txt";
    String response2 = "";
    public Button done;


    public void initdone(){
        done = (Button) findViewById(R.id.bdone);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitText();
                Intent intent = new Intent(WhatWentRight.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_went_right);
        initdone();
        response2 = readfile(filename);
        if(response2 != "") {
            EditText response = (EditText) findViewById(R.id.response2);
            response.setText(response2, TextView.BufferType.EDITABLE);
        }
    }
    public void submitText(){
        EditText response = (EditText) findViewById(R.id.response2);
        String mine = response.getText().toString();
        savefile(filename, mine);

    }
}
