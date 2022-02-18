package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int numA=0;
    int numB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment3(View view){
        numA=numA+3;
        display(numA);
    }
    public void increment2(View view){
        numA=numA+2;
        display(numA);
    }
    public void increment1(View view){
        numA++;
        display(numA);
    }

    private void display(int numberA) {
        TextView quantityTextView = findViewById(R.id.textA1);
        quantityTextView.setText(""+numberA);
    }

    public void incrementB3(View view){
        numB=numB+3;
        displayB(numB);
    }
    public void incrementB2(View view){
        numB=numB+2;
        displayB(numB);
    }
    public void incrementB1(View view){
        numB++;
        displayB(numB);
    }

    private void displayB(int numberB) {
        TextView quantityTextView = findViewById(R.id.textB1);
        quantityTextView.setText(""+numberB);
    }

    public void resetAll(View view){
        numA= numB=0;
        display(numA);
        displayB(numB);
    }

}