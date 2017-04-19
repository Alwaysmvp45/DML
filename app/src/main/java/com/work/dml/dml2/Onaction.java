package com.work.dml.dml2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Onaction extends Baseact {

    String filename = "ResponseOA.txt";
    String responseOA = "";
    public Button done;

    public void initb(){
        done = (Button) findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitText();
                Intent intent = new Intent(Onaction.this, MainActivity4.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onaction);
        initb();
        responseOA = readfile(filename);
        if(responseOA != ""){
            EditText response = (EditText) findViewById(R.id.responseOA);
            response.setText(responseOA, TextView.BufferType.EDITABLE);
        }
    }
    public void submitText(){
        EditText response = (EditText) findViewById(R.id.responseOA);
        String mine = response.getText().toString();
        savefile(filename, mine);
    }
}
