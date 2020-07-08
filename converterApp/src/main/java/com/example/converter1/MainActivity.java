package com.example.converter1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void callDeveloper(View view){
        Intent mImplicitIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:09077634617"));
        startActivity(mImplicitIntent);
    }
    public void goToCurrencyConverter(View view){
//        setContentView(R.layout.activity_currency_converter);
        Intent intent=new Intent(this,CurrencyConverter.class);
        startActivity(intent);
    }
    public void goToTemperatureConverter(View view){
//        setContentView(R.layout.activity_temperature_converter); SETTINGS 3888
        Intent intent=new Intent(this,TemperatureConverter.class);
        startActivity(intent);
    }
}
