package com.example.lesson311;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result_fielt;

    Double firstValues, twoValues, result;
    String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result_fielt=findViewById(R.id.result_fielt);

    }

    public void onNumberClik(View view) {
        switch (view.getId()){

            case R.id.seven:
                result_fielt.append("7");
            break;
            case R.id.eight:
                result_fielt.append("8");
                break;
            case R.id.nine:
                result_fielt.append("9");
                break;
            case R.id.six:
                result_fielt.append("6");
                break;
            case R.id.fife:
                result_fielt.append("5");
                break;
            case R.id.fore:
                result_fielt.append("4");
                break;
            case R.id.tree:
                result_fielt.append("3");
                break;
            case R.id.two:
                result_fielt.append("2");
                break;
            case R.id.theroo:
                result_fielt.append("0");
                break;
            case R.id.Clin:
                result_fielt.append("");
                break;
            case R.id.one:
                result_fielt.append("1");
                break;
        }

    }

    public void onInstruktorClik(View view) {
//        switch (view.getId()){
//            case R.id.plus:
//                operation = "+";
//                firstValues = Double.valueOf(result_fielt.getText().toString());
//                result_fielt.setText(firstValues + "+");
//                break;
//
//            case R.id.mines:
//                operation = "-";
//                firstValues = Double.valueOf(result_fielt.getText().toString());
//                result_fielt.setText(firstValues + "-");
//                break;
//            case R.id.delenie:
//                operation = ":";
//                firstValues = Double.valueOf(result_fielt.getText().toString());
//                result_fielt.setText(firstValues + ":");
//                break;
//            case R.id.multiply:
//                operation = "*";
//                firstValues = Double.valueOf(result_fielt.getText().toString());
//                result_fielt.setText(firstValues + "*");
//                break;
//
//
//        }
//
//    }
//    }
        switch (view.getId()) {
            case R.id.plus:
                operation = "+";
                firstValues = Double.valueOf(result_fielt.getText().toString());
                result_fielt.setText(firstValues + "+");
                break;
            case R.id.delenie:
                operation = "/";
                firstValues = Double.valueOf(result_fielt.getText().toString());
                result_fielt.setText(firstValues + "/");
                break;
                        case R.id.mines:
                operation = "-";
                firstValues = Double.valueOf(result_fielt.getText().toString());
                result_fielt.setText(firstValues + "-");
                break;
            case R.id.multiply:
                operation = "*";
                firstValues = Double.valueOf(result_fielt.getText().toString());
                result_fielt.setText(firstValues + "*");
                break;


            case R.id.ravno:
                if (operation != null) {
                    String two = result_fielt.getText().toString()
                            .replace(firstValues + operation+"", "");
                    twoValues = Double.valueOf(two);
                    switch (operation) {
                        case "+":
                            plusOp();
                            break;
                        case "/":
                            divisionOp();
                            break;
                    }
                }
        }
    }

    public void plusOp() {
        result = firstValues + twoValues;
        result_fielt.setText(result.toString());
    }
    public void divisionOp() {
        result = firstValues / twoValues;
        result_fielt.setText(result.toString());}}
