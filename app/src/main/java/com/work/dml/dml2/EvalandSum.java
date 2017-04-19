package com.work.dml.dml2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EvalandSum extends Baseact {

    String filename = "Response9.txt";
    String response9 = "";
    public Button done;

    public void initb(){
        done = (Button) findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitText();
                Intent intent = new Intent(EvalandSum.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaland_sum);

        initb();
        response9 = readfile(filename);
        if(response9 != ""){
            EditText response = (EditText) findViewById(R.id.response9);
            response.setText(response9, TextView.BufferType.EDITABLE);
        }
    }
    public void submitText(){
        EditText response = (EditText) findViewById(R.id.response9);
        String mine = response.getText().toString();
        savefile(filename, mine);
    }
}
