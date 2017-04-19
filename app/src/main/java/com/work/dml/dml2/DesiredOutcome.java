package com.work.dml.dml2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DesiredOutcome extends Baseact {
    String filename = "Response6.txt";
    String response6 = "";
    public Button done;

    public void initb(){
        done = (Button) findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitText();
                Intent intent = new Intent(DesiredOutcome.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desired_outcome);

        initb();
        response6 = readfile(filename);
        if(response6 != ""){
            EditText response = (EditText) findViewById(R.id.response6);
            response.setText(response6, TextView.BufferType.EDITABLE);
        }
    }
    public void submitText(){
        EditText response = (EditText) findViewById(R.id.response6);
        String mine = response.getText().toString();
        savefile(filename, mine);
    }
}
