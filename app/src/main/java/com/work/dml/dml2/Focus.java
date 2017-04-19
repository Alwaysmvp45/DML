package com.work.dml.dml2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Focus extends Baseact {
    String filename = "Response5.txt";
    String response5 = "";
    public Button done;

    public void initb(){
        done = (Button) findViewById(R.id.Done5);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitText();
                Intent intent = new Intent(Focus.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_focus);

        initb();
        response5 = readfile(filename);
        if(response5 != ""){
            EditText response = (EditText) findViewById(R.id.Response5);
            response.setText(response5, TextView.BufferType.EDITABLE);
        }
    }

    public void submitText(){
        EditText response = (EditText) findViewById(R.id.Response5);
        String mine = response.getText().toString();
        savefile(filename, mine);
    }
}
