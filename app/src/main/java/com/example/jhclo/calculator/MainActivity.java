package com.example.jhclo.calculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView equation;
    TextView answer;
    String last_click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        equation = findViewById(R.id.equation);
        answer = findViewById(R.id.answer);
    }
    public void Append(View v){
        String clicked = "";
        switch(v.getId()) {
            case R.id.one:
                last_click = clicked ="1";
                break;
            case R.id.two:
                last_click = clicked ="2";
                break;
            case R.id.three:
                last_click = clicked ="3";
                break;
            case R.id.four:
                last_click = clicked ="4";
                break;
            case R.id.five:
                last_click = clicked ="5";
                break;
            case R.id.six:
                last_click = clicked ="6";
                break;
            case R.id.seven:
                last_click = clicked ="7";
                break;
            case R.id.eight:
                last_click = clicked ="8";
                break;
            case R.id.nine:
                last_click = clicked ="9";
                break;
            case R.id.zero:
                last_click = clicked ="0";
                break;
            case R.id.equal:
                last_click = clicked ="";
                break;
            case R.id.plus:
                if(last_click != " + " && equation.getText().toString()!="") {
                    last_click = clicked = " + ";
                }
                else if(last_click == " + "){
                    clear();
                }
                break;


        }
        String value = equation.getText().toString();
        equation.setText(value + clicked);
    }

    public void Accumulate(View v){
        if(equation.getText().toString()!="") {
            String[] numbers = equation.getText().toString().split("\\s\\+\\s");
            int cumsum = 0;
            for (String a : numbers) {
                //Toast.makeText(this, numbers[a]+"", Toast.LENGTH_SHORT).show();
                cumsum += Integer.parseInt(a);
            }
            answer.setText(cumsum + "");
            equation.setText(cumsum + "");
            last_click = "";
        }
    }

    public void clear(){
        equation.setText("");
        answer.setText("");
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }


}
