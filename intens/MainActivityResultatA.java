package com.harik.intens;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.harik.lenovo2017.dawmrappel.R;

public class MainActivityResultatA extends Activity implements View.OnClickListener {
    EditText edprix;
    Button btnconvertir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_resultat);
    edprix= (EditText) findViewById(R.id.edPrixresultat);
    btnconvertir= (Button) findViewById(R.id.btnresultat);
        btnconvertir.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
Intent i=new Intent(MainActivityResultatA.this, Devise.class);
        startActivityForResult(i,1);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        int taux=0;
        double prix=0;
        if(requestCode==1 && resultCode==2 ){
            taux=Integer.parseInt(data.getStringExtra("taux"));
            prix = Double.parseDouble(    edprix.getText().toString());
            prix=prix*taux;
            edprix.setText(""+prix);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
