package com.work.dml.dml2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Framing extends Baseact {
    String filename = "Response4.txt";
    String response4 = "";
    public Button done;

    public void initb(){
        done = (Button) findViewById(R.id.Done4);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitText();
                Intent intent = new Intent(Framing.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_framing);
        initb();
        response4 = readfile(filename);
        if(response4 != ""){
            EditText response = (EditText) findViewById(R.id.response4);
            response.setText(response4, TextView.BufferType.EDITABLE);
        }

    }

    public void submitText(){
        EditText response = (EditText) findViewById(R.id.response4);
        String mine = response.getText().toString();
        savefile(filename, mine);
    }
}
