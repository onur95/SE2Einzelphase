package com.onur.se2einzelphase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtDividend;
    EditText txtDivisor;
    EditText txtOutput;
    Calculator c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDividend = (EditText) findViewById(R.id.txtDividend);
        txtDivisor = (EditText) findViewById(R.id.txtDivisor);
        txtOutput = (EditText) findViewById(R.id.txtOutput);
        c = new Calculator();
    }

    public void calculate(View v) {
        txtOutput.setText("");
        String dividend = txtDividend.getText().toString();
        String divisor = txtDivisor.getText().toString();
        int result = 0;
        if (dividend.length() == 0 || divisor.length() == 0) {
            txtOutput.setText("Beide Felder ausfüllen!");
        } else {
            try {
                result = c.divide(Integer.parseInt(dividend), Integer.parseInt(divisor));
                txtOutput.setText(String.valueOf(result));
            } catch (Exception f) {
                txtOutput.setText(f.getMessage());
            }
        }
    }
}
