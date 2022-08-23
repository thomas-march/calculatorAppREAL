package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
}