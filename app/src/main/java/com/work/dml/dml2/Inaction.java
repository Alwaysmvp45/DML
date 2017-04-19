package com.work.dml.dml2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Inaction extends Baseact {

    String filename = "ResponseIA.txt";
    String responseIA = "";
    public Button done;

    public void initb(){
        done = (Button) findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitText();
                Intent intent = new Intent(Inaction.this, MainActivity4.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inaction);
        initb();
        responseIA = readfile(filename);
        if(responseIA != ""){
            EditText response = (EditText) findViewById(R.id.responseIA);
            response.setText(responseIA, TextView.BufferType.EDITABLE);
        }
    }
    public void submitText(){
        EditText response = (EditText) findViewById(R.id.responseIA);
        String mine = response.getText().toString();
        savefile(filename, mine);
    }
}
