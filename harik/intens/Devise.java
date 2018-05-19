package com.harik.intens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.harik.lenovo2017.dawmrappel.R;

public class Devise extends Activity implements View.OnClickListener {
Button btnValider;
RadioButton rd$, rd€;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devise);
        btnValider= (Button) findViewById(R.id.btnquitter);
        rd$= (RadioButton) findViewById(R.id.rd$);
        rd€= (RadioButton) findViewById(R.id.rd€);
        btnValider.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
     int taux=0;
     if (rd$.isChecked()){
         taux=8;
     } else  if (rd€.isChecked()){
            taux=10;
        }else{
         taux=1;
     }
//intent pour stocker les données à retourner à l'activité de départ
        Intent i=new Intent();
        i.putExtra("taux",""+taux);
        //enregistrer la reponse (resultat) à reoutner  avec un code de reponse
        setResult(2,i);
        finish();
     }
}
