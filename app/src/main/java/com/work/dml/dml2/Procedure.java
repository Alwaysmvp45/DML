package com.work.dml.dml2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Procedure extends Baseact {

    String filename = "ResponseP.txt";
    String filename2 = "ResponseK.txt";
    String responseP = "";
    String responseK = "";
    public Button done;

    public void initb(){
        done = (Button) findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitText();
                Intent intent = new Intent(Procedure.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procedure);
        initb();
        responseP = readfile(filename);
        responseK = readfile(filename2);
        if(responseP != ""){
            EditText response = (EditText) findViewById(R.id.responseP);
            response.setText(responseP, TextView.BufferType.EDITABLE);
        }
        if(responseK != ""){
            EditText response = (EditText) findViewById(R.id.responseK);
            response.setText(responseK, TextView.BufferType.EDITABLE);
        }
    }
    public void submitText(){
        EditText response = (EditText) findViewById(R.id.responseP);
        String mine = response.getText().toString();
        savefile(filename, mine);
        EditText response2 = (EditText) findViewById(R.id.responseK);
        String mine2 = response.getText().toString();
        savefile(filename2, mine2);
    }
}
