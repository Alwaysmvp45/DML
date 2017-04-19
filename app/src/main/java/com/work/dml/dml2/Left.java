package com.work.dml.dml2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Left extends Baseact {

    String filename = "ResponseL.txt";
    String responseL = "";
    public Button done;

    public void initb(){
        done = (Button) findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitText();
                Intent intent = new Intent(Left.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_left);

        initb();
        responseL = readfile(filename);
        if(responseL != ""){
            EditText response = (EditText) findViewById(R.id.responseL);
            response.setText(responseL, TextView.BufferType.EDITABLE);
        }
    }
    public void submitText(){
        EditText response = (EditText) findViewById(R.id.responseL);
        String mine = response.getText().toString();
        savefile(filename, mine);
    }
}
