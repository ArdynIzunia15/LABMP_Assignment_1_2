package com.example.nomor2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Input
        EditText inputValue1 = findViewById(R.id.inputValue1);
        EditText inputValue2 = findViewById(R.id.inputValue2);

        // Control
        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnSubstract = findViewById(R.id.btnSubstract);
        Button btnDivide = findViewById(R.id.btnDivide);
        Button btnMultiply = findViewById(R.id.btnMultiply);

        // Output
        TextView outputResult = findViewById(R.id.outputResult);

        // onClick btnAdd
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = Double.parseDouble(inputValue1.getText().toString()) + Double.parseDouble(inputValue2.getText().toString());
                outputResult.setText(String.format("%.2f", result));
            }
        });

        // onClick btnSubstract
        btnSubstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = Double.parseDouble(inputValue1.getText().toString()) - Double.parseDouble(inputValue2.getText().toString());
                outputResult.setText(String.format("%.2f", result));
            }
        });

        // onClick btnDivide
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = Double.parseDouble(inputValue1.getText().toString()) / Double.parseDouble(inputValue2.getText().toString());
                outputResult.setText(String.format("%.2f", result));
            }
        });

        // onClick btnMultiply
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = Double.parseDouble(inputValue1.getText().toString()) * Double.parseDouble(inputValue2.getText().toString());
                outputResult.setText(String.format("%.2f", result));
            }
        });
    }
}