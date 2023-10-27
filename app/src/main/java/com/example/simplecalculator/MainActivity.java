package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText editNumber1;
    EditText editNumber2;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNumber1 = findViewById(R.id.editNumber1);
        editNumber2 = findViewById(R.id.editNumber2);
        resultText = findViewById(R.id.resultTextView);
    }

    public void sum(View view) {
        if (editNumber1.getText().toString().matches("") || editNumber2.getText().toString().matches("")) {
            resultText.setText("Enter a number!");
        } else {
            int number1 = Integer.parseInt(editNumber1.getText().toString());
            int number2 = Integer.parseInt(editNumber2.getText().toString());
            int result = number1 + number2;
            resultText.setText("Result: " + result);
        }
    }

    public void subs(View view) {
        if (editNumber1.getText().toString().matches("") || editNumber2.getText().toString().matches("")) {
            resultText.setText("Enter a number!");
        } else {
            int number1 = Integer.parseInt(editNumber1.getText().toString());
            int number2 = Integer.parseInt(editNumber2.getText().toString());
            int result = number1 - number2;
            resultText.setText("Result: " + result);
        }
    }

    public void multiply(View view) {
        if (editNumber1.getText().toString().matches("") || editNumber2.getText().toString().matches("")) {
            resultText.setText("Enter a number!");
        } else {
            int number1 = Integer.parseInt(editNumber1.getText().toString());
            int number2 = Integer.parseInt(editNumber2.getText().toString());
            int result = number1 * number2;
            resultText.setText("Result: " + result);
        }
    }

    public void divide(View view) {
        if (editNumber1.getText().toString().matches("") || editNumber2.getText().toString().matches("")) {
            resultText.setText("Enter a number!");
        } else {
            DecimalFormat df = new DecimalFormat("#.###");
            float number1 = Integer.parseInt(editNumber1.getText().toString());
            float number2 = Integer.parseInt(editNumber2.getText().toString());
            float result =  number1 / number2;
            resultText.setText("Result: " + df.format(result));
        }
    }
}