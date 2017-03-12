package com.onur.se2einzelphase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtDividend;
    EditText txtDivisor;
    EditText txtOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDividend=(EditText)findViewById(R.id.txtDividend);
        txtDivisor=(EditText)findViewById(R.id.txtDivisor);
        txtOutput=(EditText)findViewById(R.id.txtOutput);
    }

    public void calculate (View v){
        txtOutput.setText("");
        if(txtDividend.getText().length()==0 || txtDivisor.getText().length()==0){
            txtOutput.setText("Beide Felder ausfüllen!");
        }
        else{

        }
    }
}
