package com.harik.com.harik.listeview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.harik.lenovo2017.dawmrappel.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListeViewSimple extends Activity implements AdapterView.OnItemClickListener, View.OnClickListener {
    ListView lv;
    ArrayAdapter adapter;
    List<String> data;
    EditText edlist;
    Button btnlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_view_simple);
         lv= (ListView) findViewById(R.id.listeviewsimple);
        edlist= (EditText) findViewById(R.id.edlist);
        btnlist= (Button) findViewById(R.id.btnlist);
        btnlist.setOnClickListener(this);

        data=new ArrayList<>();
        Random r=new Random();
        for (int i=0;i<100;i++){
            data.add("Contact numéro "+r.nextInt(100));
             }
        adapter=new ArrayAdapter(ListeViewSimple.this,android.R.layout.simple_list_item_1,data);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "vous avez choisit : "+data.get(position), Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onClick(View v) {
        String tel=edlist.getText().toString();
        if (!tel.matches("/^0[0-9]{9}$/")){
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        }else
        adapter.add(tel);


    }
}
