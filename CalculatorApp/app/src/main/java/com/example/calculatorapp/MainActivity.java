package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    this method will be called when we click on the button.
    in order for a method to be allowed to be called via onClick,
    it MUST have a method header of the format
    public void methodName(View v)
    This method can only accept ONE parameter and the parameter is a reference to the View
    from which it was called.

    this method is called with the onClick attribute for the button in the activity_main.xml page
     */
    public void switchScreens(View view){

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
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double sum = num1 + num2;

        numberSumTV.setText("" + sum);
    }

    public void findProd(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double prod = num1 * num2;

        numberSumTV.setText("" + prod);
    }

    public void findQuot(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double quot = num1 / num2;

        numberSumTV.setText("" + quot);
    }

    public void findDiff(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double diff = num1 - num2;

        numberSumTV.setText("" + diff);
    }

    /*
    Math.pow(base, exponent) method
    Source: https://www.techwalla.com/articles/how-to-do-exponents-in-java
     */
    public void findExp(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double exp = (double) Math.pow(num1,num2);
        numberSumTV.setText("" + exp);
    }
    /*
    Math.log(number) method
    Source: https://stackoverflow.com/questions/25973731/how-to-calculate-logarithms-in-java
     */
    public void findLog(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double log = (double) ((double) Math.log(num2)/Math.log(num1));

        numberSumTV.setText("" + log);
    }

}