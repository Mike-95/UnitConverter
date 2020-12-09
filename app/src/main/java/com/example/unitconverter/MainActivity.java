package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaring Widgets
    EditText et_input;
    TextView   tv_result;
    Button btn_converter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instantiating widgets
        et_input = findViewById(R.id.et_input);
        tv_result = findViewById(R.id.tv_result);
        btn_converter = findViewById(R.id.btn_converter);

        //Adding a click event for button (Excuting the covert method when clicked)
        btn_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Calling convert from kilo to pound method
                ConvertFromKiloToPound();
            }
        });
    }
    private void ConvertFromKiloToPound() {
        //This method will convert the values entered in editText
        //From kilo to pounds

        String valueEnteredKilo = et_input.getText().toString();

        //converting the string to number
        double Kilo = Double.parseDouble(valueEnteredKilo);

        //converting kilo to pounds formula
        double pounds = Kilo * 2.205;

        //Displaying the values resulted in textView
        tv_result.setText("" + pounds);
    }
}