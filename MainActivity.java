// Student Name: Diego Santosuosso
// This lab was done individually

package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.os.Bundle;
import android.widget.*;


public class MainActivity extends AppCompatActivity {

    public static BMIModel BMIModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClicked(View v)
    {
        EditText weightView = (EditText) findViewById(R.id.weightBox);  // finds weightBox
        String wS = weightView.getText().toString();    // stores weight input String in wS
        EditText heightView = (EditText) findViewById(R.id.heightBox);  // finds heightBox
        String hS = heightView.getText().toString();    // stores height input String in hS

        double wD = BMIModel.toDouble(wS);  // converts wS to double and stores it in wD
        double hD = BMIModel.toDouble(hS);  // converts hS to double and stores it in hD
        double bmiD = BMIModel.getBMI(wD, hD);  // calls getBMI with wD and hD - stores it in bmiD
        String bmiS = BMIModel.formatBMI(bmiD); // calls formatBMI with bmiD - stores it in bmiS
        ((TextView) findViewById(R.id.answer)).setText(bmiS);   // sets bmiS as answer in TextView
    }
}