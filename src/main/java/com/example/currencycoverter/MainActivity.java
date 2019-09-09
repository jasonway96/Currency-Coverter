package com.example.currencycoverter;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    float a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    void convertUsdToGbp()
    {  EditText usd= (EditText) findViewById(R.id.usd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText  bdt=(EditText) findViewById(R.id.gbp);
        bdt.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(usd.getText().toString());
        double result=a*0.82;
        bdt.setText(String.valueOf(result));

    }

    void convertGbpToUsd()
    {  EditText usd= (EditText) findViewById(R.id.usd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  bdt=(EditText) findViewById(R.id.gbp);
        bdt.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(bdt.getText().toString());
        double result=a/0.82;
        usd.setText(String.valueOf(result));
    }

    public void click(View view)
    {
        convertUsdToGbp();
        Button b2=(Button) findViewById(R.id.submit2);
        b2.setEnabled(false);
    }

    public void reset(View view)
    {
        Button b1=(Button) findViewById(R.id.submit);
        b1.setEnabled(true);
        Button b2=(Button) findViewById(R.id.submit2);
        b2.setEnabled(true);
        EditText usd= (EditText) findViewById(R.id.usd);
        EditText  bdt=(EditText) findViewById(R.id.gbp);
        usd.setText("");
        bdt.setText("");

    }

    public void click2(View view)
    {
        Button b1=(Button) findViewById(R.id.submit);
        b1.setEnabled(false);
        convertGbpToUsd();
    }



}