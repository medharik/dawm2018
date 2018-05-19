package com.harik.tplistwebfiltre;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.harik.lenovo2017.dawmrappel.R;

import java.util.ArrayList;
import java.util.List;

public class SitesFavoris extends Activity implements AdapterView.OnItemClickListener {
List<String> data;
ArrayAdapter adapter;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sites_favoris);
        lv= (ListView) findViewById(R.id.lvwebmenu);
        data=new ArrayList<>();
        data.add("Sport");
        data.add("Politique");
        data.add("Divertisement");
        adapter=new ArrayAdapter(SitesFavoris.this,android.R.layout.simple_list_item_1,data);
        lv.setAdapter(adapter);

lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i=new Intent(SitesFavoris.this,ListesSite.class);
        i.putExtra("categorie",data.get(position));
        startActivity(i);
    }
}
