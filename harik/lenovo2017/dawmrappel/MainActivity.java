package com.harik.lenovo2017.dawmrappel;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    EditText edcd;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.tresult);
        edcd = (EditText) findViewById(R.id.edcode);
    }


    public void affiche(View v)
    {
        if(edcd.getText().toString().length()==14)
        {
            result.setText("valide");
        }
        else{
            result.setText("no valide");
        }
    }
}
