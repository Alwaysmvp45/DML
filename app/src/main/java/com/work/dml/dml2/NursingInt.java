package com.work.dml.dml2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NursingInt extends Baseact {
    String filename = "Response7.txt";
    String response7 = "";
    public Button done;

    public void initb(){
        done = (Button) findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitText();
                Intent intent = new Intent(NursingInt.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nursing_int);
        initb();
        response7 = readfile(filename);
        if(response7 != ""){
            EditText response = (EditText) findViewById(R.id.response8);
            response.setText(response7, TextView.BufferType.EDITABLE);
        }
    }
    public void submitText(){
        EditText response = (EditText) findViewById(R.id.response8);
        String mine = response.getText().toString();
        savefile(filename, mine);
    }
}
