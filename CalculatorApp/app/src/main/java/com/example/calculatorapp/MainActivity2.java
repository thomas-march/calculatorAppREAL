package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //add code here that we get from an intent that is needed
        // to help set up the page


        //getting the letter from the mail - receiving the sent info
        Intent intent = getIntent();
        // retrieving the data that was sent and labeled as NAME
        //there are many methods for getting different data types
        // changing the text for the textView on this screen
    }
    public void switchScreensBack(View view){

        /*
        to send the app to another screen, you need to create an Intent.
        this is equivalent to getting out a new envelope to mail a letter.
        In the constructor, the first param is telling you where you're coming from,
        and we usually use "this" because we are coming from this screen.

        The second param tells you which activity you're going to, and you need to use
        the ActivityName.class

        After you create the intent, if you want to send data with it, you need to use
        putExtra and the first param is a label, usually all caps, and the second param
        is the value you are sending.

        Lastly, you call startActivity to launch the new intent and switch screens
         */
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}