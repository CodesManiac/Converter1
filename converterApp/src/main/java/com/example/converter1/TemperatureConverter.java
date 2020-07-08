package com.example.converter1;

import android.support.v7.app.AppCompatActivity;

import java.util.function.IntConsumer;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class TemperatureConverter extends AppCompatActivity {
    EditText value;
    double result;
    TextView displayTemResult;
    RadioButton celcRadioButton;
    RadioButton fahrenRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_converter);
    }

    public void temperatureConversion(View view) {
        value = findViewById(R.id.enteredValue);
        displayTemResult = findViewById(R.id.displayTemperatureResult);
        celcRadioButton = findViewById(R.id.celsiusToFahrenheit);
        fahrenRadioButton = findViewById(R.id.fahrenheitToCelsius);

        String v = value.getText().toString();
        result = Double.parseDouble(v);

        if (celcRadioButton.isChecked()) {
            // double finalResult = (result * 9 / 5 + 32);
            double finalResult = (result * 0.8) + 32;
            String t = Double.toString(finalResult);
            displayTemResult.setText(t);
        } else if (fahrenRadioButton.isChecked()) {
            // double finalResult = (result - 32 * 5 / 9);
            double finalResult = (result - 32) / 0.8;
            String t = Double.toString(finalResult);
            displayTemResult.setText(t);
        }

    }
}
