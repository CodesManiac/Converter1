package com.example.converter1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CurrencyConverter extends AppCompatActivity {
    private Spinner spinner;
    private Spinner spinner1;
    EditText userInput;
    TextView displayCurrResult;
    private String euroSymbol="£";
    private String dollarSymbol="$";
    private String yenSymbol="¥";
    private String swissSymbol="";
    private String poundSymbol="€";


    String[]currencies = new String[]{
           "US Dollars",
           "Pounds",
           "Swiss Franc",
           "Yen",
           "Rupees",
           "Euro"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);

        spinner=findViewById(R.id.convertFrom);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.conversionFrom,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        spinner1=findViewById(R.id.convertTo);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.conversionTo,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
    }


    public void currencyConverter(View view){
        String message="Invalid Conversion";
        String selected=spinner1.getSelectedItem().toString();
        if(selected.equals(currencies[0])){
            convertNairaToDollar();
        }else if (selected.equals(currencies[1])){
            convertNairaToPounds();
        }else if (selected.equals(currencies[2])){
            convertNairaToSwissFranc();
        }else if (selected.equals(currencies[3])){
            convertNairaToYen();
        }else if (selected.equals(currencies[4])){
            convertNairaToRupees();
        }else if (selected.equals(currencies[5])){
            convertNairaToEuro();
        }else{
            Toast.makeText(CurrencyConverter.this,message,Toast.LENGTH_LONG).show();
        }
    }


    public void convertNairaToPounds(){
       userInput=findViewById(R.id.enteredCurrencyValue);
        displayCurrResult=findViewById(R.id.displayCurrencyResult);
        double naira=Double.parseDouble(userInput.getText().toString());
       double pounds=0.0025;
       double result=naira*pounds;
        displayCurrResult.setText(poundSymbol+Double.toString(result));
    }
    public void convertNairaToEuro(){
        userInput=findViewById(R.id.enteredCurrencyValue);
        displayCurrResult=findViewById(R.id.displayCurrencyResult);
        double naira=Double.parseDouble(userInput.getText().toString());
        double euro=0.0028;
        double result=naira*euro;
        displayCurrResult.setText(euroSymbol+Double.toString(result));
    }
    public void convertNairaToYen(){
        userInput=findViewById(R.id.enteredCurrencyValue);
        displayCurrResult=findViewById(R.id.displayCurrencyResult);
        double naira=Double.parseDouble(userInput.getText().toString());
        double yen=0.3522;
        double result=naira*yen;
        displayCurrResult.setText(yenSymbol+Double.toString(result));
    }
    public void convertNairaToSwissFranc(){
        userInput=findViewById(R.id.enteredCurrencyValue);
        displayCurrResult=findViewById(R.id.displayCurrencyResult);
        double naira=Double.parseDouble(userInput.getText().toString());
        double swissFranc=0.0032;
        double result=naira*swissFranc;
        displayCurrResult.setText(Double.toString(result));
    }
    public void convertNairaToDollar(){
        userInput=findViewById(R.id.enteredCurrencyValue);
        displayCurrResult=findViewById(R.id.displayCurrencyResult);
        double naira=Double.parseDouble(userInput.getText().toString());
        double dollars=0.0032;
        double result=naira*dollars;
        displayCurrResult.setText(dollarSymbol+Double.toString(result));
    }
    public void convertNairaToRupees(){
        userInput=findViewById(R.id.enteredCurrencyValue);
        displayCurrResult=findViewById(R.id.displayCurrencyResult);
        double naira=Double.parseDouble(userInput.getText().toString());
        double rupees=0.1169;
        double result=naira*rupees;
        displayCurrResult.setText(Double.toString(result));
    }
}
