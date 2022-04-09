package com.example.unitcoverter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            TextView result = (TextView) findViewById(R.id.textView);
            EditText et1 = (EditText) findViewById(R.id.editTextTextPersonName);

            double a = Double.parseDouble(String.valueOf(et1.getText()));
            RadioButton cb = (RadioButton) findViewById(R.id.cb);
            RadioButton fb = (RadioButton) findViewById(R.id.fb);

            if (cb.isChecked()) {
                //change background colour
                //ll.setBackgroundColor(Color.YELLOW);
                //display conversion
                result.setText(f2c(a) + " degree C");
                //cb.setChecked(false);
                fb.setChecked(true);
            } else {
                //ll.setBackgroundColor(Color.CYAN);
                result.setText(c2f(a) + " degree F");
                //fb.setChecked(false);
                cb.setChecked(true);
            }
        }
        //Celcius to Fahrenhiet method
        private double c2f ( double c)
        {
            return (c * 9) / 5 + 32;
        }
        //Fahrenhiet to Celcius method
        private double f2c ( double f)
        {
            return (f - 32) * 5 / 9;
        }

}
