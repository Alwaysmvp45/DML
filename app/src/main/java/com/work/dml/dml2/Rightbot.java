package com.work.dml.dml2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rightbot extends Baseact {

    String filename = "ResponseRB.txt";
    String responseRB = "";
    public Button done;

    public void initb() {
        done = (Button) findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitText();
                Intent intent = new Intent(Rightbot.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rightbot);
        initb();
        responseRB = readfile(filename);
        if (responseRB != "") {
            EditText response = (EditText) findViewById(R.id.responseRB);
            response.setText(responseRB, TextView.BufferType.EDITABLE);
        }
    }

    public void submitText() {
        EditText response = (EditText) findViewById(R.id.responseRB);
        String mine = response.getText().toString();
        savefile(filename, mine);
    }
}
