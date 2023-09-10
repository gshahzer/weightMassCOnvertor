package com.example.weightmassconvertor;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText inputValue;
    private RadioButton kilogramButton, gramButton, milligramButton, poundButton, ounceButton;
    private RadioButton kilogramToButton, gramToButton, milligramToButton, poundToButton, ounceToButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputValue = findViewById(R.id.inputValue);
        kilogramButton = findViewById(R.id.kilogramButton);
        gramButton = findViewById(R.id.gramButton);
        milligramButton = findViewById(R.id.milligramButton);
        poundButton = findViewById(R.id.poundButton);
        ounceButton = findViewById(R.id.ounceButton);
        kilogramToButton = findViewById(R.id.kilogramToButton);
        gramToButton = findViewById(R.id.gramToButton);
        milligramToButton = findViewById(R.id.miligramToButton);
        poundToButton = findViewById(R.id.poundToButton);
        ounceToButton = findViewById(R.id.ounceToButton);
    }

    public void convertWeight(View v) {
        if (inputValue.getText().toString().trim().length() == 0) {
            Toast.makeText(this, "Please enter a value", Toast.LENGTH_SHORT).show();
            return;
        }

        double input = Double.parseDouble(inputValue.getText().toString());
        double result = 0.0;

        if (kilogramButton.isChecked()) {
            if (kilogramToButton.isChecked()) {
                result = input;
            } else if (gramToButton.isChecked()) {
                result = input * 1000;
            } else if (milligramToButton.isChecked()) {
                result = input * 1000000;
            } else if (poundToButton.isChecked()) {
                result = input * 2.20462;
            } else if (ounceToButton.isChecked()) {
                result = input * 35.274;
            }
        } else if (gramButton.isChecked()) {
            if (kilogramToButton.isChecked()) {
                result = input / 1000;
            } else if (gramToButton.isChecked()) {
                result = input;
            } else if (milligramToButton.isChecked()) {
                result = input * 1000;
            } else if (poundToButton.isChecked()) {
                result = input / 453.592;
            } else if (ounceToButton.isChecked()) {
                result = input / 28.35;
       }
}}}