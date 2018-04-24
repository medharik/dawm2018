package com.harik.intens;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.harik.lenovo2017.dawmrappel.R;

public class ActivityB extends Activity {
EditText edtht;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        edtht= (EditText) findViewById(R.id.edtht);

        Intent i = getIntent();
        double prix = Double.parseDouble(i.getStringExtra("prix"));
        int qte = Integer.parseInt( i.getStringExtra("qte"));
        double tht =prix*qte;
        edtht.setText(""+tht);



    }


}
