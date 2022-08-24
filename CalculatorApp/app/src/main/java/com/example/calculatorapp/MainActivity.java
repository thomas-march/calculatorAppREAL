package com.example.calculatorapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();

        setContentView(R.layout.activity_main);

        textViewResult
                = findViewById(
                R.id.num1ET);
        editTextInput
                = findViewById(
                R.id.num2ET);
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

    /* hide keyboard method
        source: https://www.geeksforgeeks.org/how-to-programmatically-hide-android-soft-keyboard/
     */

    private TextView textViewResult;
    private EditText editTextInput;

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void setText(View v)
    {
        String newText
                = editTextInput
                .getText()
                .toString();
        textViewResult.setText(newText);

        closeKeyboard();
        editTextInput.setText("");
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void closeKeyboard(View view)
    {
        // this will give us the view
        // which is currently focus
        // in this layout
        view = this.getCurrentFocus();

        // if nothing is currently
        // focus then this will protect
        // the app from crash
        if (view != null) {

            // now assign the system
            // service to InputMethodManager
            InputMethodManager manager
                    = (InputMethodManager)
                    getSystemService(
                            Context.INPUT_METHOD_SERVICE);
            manager
                    .hideSoftInputFromWindow(
                            view.getWindowToken(), 0);
        }
    }

    /*
        Truncating decimals to 3 decimal places method:
            import java.text.DecimalFormat;
            public class DecimalFormatting {
            public static void main(String args[]){
            double d = 9.4568982982989;
            String pattern = "#.###";
            DecimalFormat decimalFormat =  new DecimalFormat(pattern);
            String formattedDouble = decimalFormat.format(d);
            System.out.println("Formatted double d = "+formattedDouble);
        Source: https://www.delftstack.com/howto/java/java-truncate-double/

     */

    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double sum = num1 + num2;
        String pattern = "#.###";
        DecimalFormat decimalFormat =  new DecimalFormat(pattern);
        String sumFinal = decimalFormat.format(sum);
        numberSumTV.setText("" + sumFinal);
    }

    public void findProd(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double prod = num1 * num2;
        String pattern = "#.###";
        DecimalFormat decimalFormat =  new DecimalFormat(pattern);
        String prodFinal = decimalFormat.format(prod);
        numberSumTV.setText("" + prodFinal);
    }

    public void findQuot(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double quot = num1 / num2;
        String pattern = "#.###";
        DecimalFormat decimalFormat =  new DecimalFormat(pattern);
        String quotFinal = decimalFormat.format(quot);
        numberSumTV.setText("" + quotFinal);
    }

    public void findDiff(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double diff = num1 - num2;
        String pattern = "#.###";
        DecimalFormat decimalFormat =  new DecimalFormat(pattern);
        String diffFinal = decimalFormat.format(diff);
        numberSumTV.setText("" + diffFinal);
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
        String pattern = "#.###";
        DecimalFormat decimalFormat =  new DecimalFormat(pattern);
        String expFinal = decimalFormat.format(exp);
        numberSumTV.setText("" + expFinal);
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
        String pattern = "#.###";
        DecimalFormat decimalFormat =  new DecimalFormat(pattern);
        String logFinal = decimalFormat.format(log);
        numberSumTV.setText("" + logFinal);
    }

}