package com.work.dml.dml2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Topright extends Baseact {
    String filename = "ResponseTR.txt";
    String responseTR = "";
    public Button done;

    public void initb(){
        done = (Button) findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitText();
                Intent intent = new Intent(Topright.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topright);
    initb();
    responseTR = readfile(filename);
        if(responseTR != ""){
        EditText response = (EditText) findViewById(R.id.responseTR);
        response.setText(responseTR, TextView.BufferType.EDITABLE);
    }
}
    public void submitText(){
        EditText response = (EditText) findViewById(R.id.responseTR);
        String mine = response.getText().toString();
        savefile(filename, mine);
    }
}
