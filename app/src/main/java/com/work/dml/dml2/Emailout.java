package com.work.dml.dml2;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Emailout extends Baseact {
    public Button send;
    String wholeMessage;
    String recipient;

    public void initb() {
        send = (Button) findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //EditText response = (EditText) findViewById(R.id.receiver);
                //recipient = response.getText().toString();
                sendEmail();

                //Toast.makeText(Emailout.this, "Thank you!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Emailout.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emailout);
        initb();
    }

    public void sendEmail() {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"dreifuerstrm@msoe.edu"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Yes hello sir");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
        else{
            Toast.makeText(Emailout.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }

        /*
        Log.i("Send email", "");
        String[] TO = {"dreifuerstrm@msoe.edu"};
        String[] CC = {"ryandry1st@gmail.com"};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message goes here");

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
            Toast.makeText(Emailout.this, "Finished sending emai.", Toast.LENGTH_LONG).show();
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(Emailout.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }


        String[] files = {"Name: ", "Name1.txt", "What is the first thing that comes to mind about the clinical Experience: ",
                " Response1.txt"};
        for(int i = 0; i< 4; i+=2){
            wholeMessage += files[i] + files[i+1];
            wholeMessage += " \n";
        }
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        //i.putExtra(Intent.EXTRA_EMAIL  , recipient);
        i.putExtra(Intent.EXTRA_SUBJECT, "Results from DML worksheet");
        i.putExtra(Intent.EXTRA_TEXT   , wholeMessage);
        i.setData(Uri.parse("mailto:ryandry1st@gmail.com")); // or just "mailto:" for blank
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // this will make such that when user returns to your app, your app is displayed, instead of the email app
        try {
            startActivity(Intent.createChooser(i, "Send mail..."));
            finish();
            Toast.makeText(Emailout.this, "Done!", Toast.LENGTH_LONG).show();
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(Emailout.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }*/
    }
}