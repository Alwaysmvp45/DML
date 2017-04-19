package com.work.dml.dml2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DoDifferently extends Baseact {
    String filename = "Response3.txt";
    String response3 = "";
    public Button done;

    public void initb(){
        done = (Button) findViewById(R.id.Done3);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitText();
                Intent intent = new Intent(DoDifferently.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_differently);
        initb();
        response3 = readfile(filename);
        if(response3 != ""){
            EditText response = (EditText) findViewById(R.id.response3);
            response.setText(response3, TextView.BufferType.EDITABLE);
        }

    }

    public void submitText(){
        EditText response = (EditText) findViewById(R.id.response3);
        String mine = response.getText().toString();
        savefile(filename, mine);
    }
}
