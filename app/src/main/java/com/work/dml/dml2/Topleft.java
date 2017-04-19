package com.work.dml.dml2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Topleft extends Baseact {

    String filename = "ResponseTL.txt";
    String responseTL = "";
    public Button done;

    public void initb(){
        done = (Button) findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitText();
                Intent intent = new Intent(Topleft.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topleft);
        initb();
        responseTL = readfile(filename);
        if(responseTL != ""){
            EditText response = (EditText) findViewById(R.id.responseTL);
            response.setText(responseTL, TextView.BufferType.EDITABLE);
        }
    }
    public void submitText() {
        EditText response = (EditText) findViewById(R.id.responseTL);
        String mine = response.getText().toString();
        savefile(filename, mine);
    }
}
