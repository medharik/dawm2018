package com.harik.intens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.harik.lenovo2017.dawmrappel.R;

public class AtivityA extends Activity {
EditText edprix, edqte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ativity);
        edprix= (EditText) findViewById(R.id.edprix);
        edqte= (EditText) findViewById(R.id.edqte);

    }
    
    public void calculer(View v){
        // recuprer les infos ds les editexts
        String prix=edprix.getText().toString();
        String qte = edqte.getText().toString();
        //on crée l'intent explicite permettant de démarrer de a à b
        Intent i=new Intent(AtivityA.this,ActivityB.class);
        //on enregistre des données dans l'intent i
        i.putExtra("prix",prix);
        i.putExtra("qte",qte);

// on lance l'activité on lui donnant l'intent i
        startActivity(i);
    }
}
