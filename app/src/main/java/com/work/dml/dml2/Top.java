package com.work.dml.dml2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Top extends Baseact {

    String filename = "ResponseT.txt";
    String responseT = "";
    public Button done;

    public void initb() {
        done = (Button) findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitText();
                Intent intent = new Intent(Top.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);
        initb();
        responseT = readfile(filename);
        if (responseT != "") {
            EditText response = (EditText) findViewById(R.id.responseT);
            response.setText(responseT, TextView.BufferType.EDITABLE);
        }
    }

    public void submitText() {
        EditText response = (EditText) findViewById(R.id.responseT);
        String mine = response.getText().toString();
        savefile(filename, mine);
    }
}
