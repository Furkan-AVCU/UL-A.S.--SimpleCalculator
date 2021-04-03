package com.furkanavcu.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText getFirstNumber;
    EditText getSecondNumber;
    TextView textVResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         getFirstNumber= findViewById(R.id.getFirstNumber);
         getSecondNumber=findViewById(R.id.getSecondNumber);
         textVResult=findViewById(R.id.textVResult);
    }

    public void sum(View view){
        if (getFirstNumber.getText().toString().matches("")||getSecondNumber.getText().toString().matches("")){
            textVResult.setText("Please Enter Number !");

        }else {
            int number1=Integer.parseInt(getFirstNumber.getText().toString());
            int number2=Integer.parseInt(getSecondNumber.getText().toString());
            int result=number1+number2;
            textVResult.setText("Result : "+result);
        }

    }
    public void deduct(View view){
        if (getFirstNumber.getText().toString().matches("")||getSecondNumber.getText().toString().matches("")){
            textVResult.setText("Please Enter Number !");

        }else {
            int number1=Integer.parseInt(getFirstNumber.getText().toString());
            int number2=Integer.parseInt(getSecondNumber.getText().toString());
            int result=number1-number2;
            textVResult.setText("Result : "+result);
        }

    }
    public void multiply(View view){
        if (getFirstNumber.getText().toString().matches("")||getSecondNumber.getText().toString().matches("")){
            textVResult.setText("Please Enter Number !");

        }else {
            int number1=Integer.parseInt(getFirstNumber.getText().toString());
            int number2=Integer.parseInt(getSecondNumber.getText().toString());
            int result=number1*number2;
            textVResult.setText("Result : "+result);
        }

    }
    public void divide(View view){
        if (getFirstNumber.getText().toString().matches("")||getSecondNumber.getText().toString().matches("")){
            textVResult.setText("Please Enter Number !");

        }else {
            int number1=Integer.parseInt(getFirstNumber.getText().toString());
            int number2=Integer.parseInt(getSecondNumber.getText().toString());
            int result=number1/number2;
            textVResult.setText("Result : "+result);
        }

    }
}