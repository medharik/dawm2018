package com.harik.tplistwebfiltre;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.harik.lenovo2017.dawmrappel.R;

import java.util.ArrayList;
import java.util.List;

public class ListesSite extends Activity implements AdapterView.OnItemClickListener {
ListView lv;
    List<String> data;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listes_site);
lv= (ListView) findViewById(R.id.listesites);
        data=new ArrayList<>();
        Intent i = getIntent();
        if(i!=null  && i.hasExtra("categorie")){

         String   categorie=i.getStringExtra("categorie");
            if (categorie.equalsIgnoreCase("sport")){
                data.add("http://eurosport.fr");
                data.add("http://kooora.com");

            }else if (categorie.equalsIgnoreCase("politique")){
data.add("http://france24.fr");
                data.add("http://hespress.ma");
                data.add("http://aljazeera.net");
            } else {
data.add("http://youtube.com");
            }


        }
        adapter=new ArrayAdapter(ListesSite.this,android.R.layout.simple_list_item_1,data);
        lv.setAdapter(adapter);
lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i=new Intent(ListesSite.this,Webview1.class);
        i.putExtra("lien",data.get(position));
        startActivity(i);


    }
}
