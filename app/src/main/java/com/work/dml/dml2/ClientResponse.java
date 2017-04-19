package com.work.dml.dml2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ClientResponse extends Baseact {

    String filename = "Response8.txt";
    String response8 = "";
    public Button done;

    public void initb(){
        done = (Button) findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitText();
                Intent intent = new Intent(ClientResponse.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_response);

        initb();
        response8 = readfile(filename);
        if(response8 != ""){
            EditText response = (EditText) findViewById(R.id.response8);
            response.setText(response8, TextView.BufferType.EDITABLE);
        }
    }
    public void submitText(){
        EditText response = (EditText) findViewById(R.id.response8);
        String mine = response.getText().toString();
        savefile(filename, mine);
    }
}
