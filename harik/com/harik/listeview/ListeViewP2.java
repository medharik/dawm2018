package com.harik.com.harik.listeview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.harik.lenovo2017.dawmrappel.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListeViewP2 extends Activity {
ListView lv;
    List<Map<String,String>> datalist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_view_p2);
        lv= (ListView) findViewById(R.id.lvp2);

        datalist=new ArrayList<>();
       Map<String,String> one=new HashMap<>();
        one.put("nom","alami");
        one.put("prenom","ali");
        Map<String,String> two=new HashMap<>();
        one.put("nom","samiri");
        one.put("prenom","samir");
        datalist.add(one);
        datalist.add(two);
        MonAdapter ad=new MonAdapter();
lv.setAdapter(ad);
    }
    class MonAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return datalist.size();
        }
        @Override
        public Object getItem(int position) {
            return datalist.get(position);
        }
        @Override
        public long getItemId(int position) {
            return position;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
         if (convertView==null)
             convertView=getLayoutInflater().inflate(R.layout.element2,null);
          TextView tvnom= (TextView) convertView.findViewById(R.id.tvnom2);
            TextView tvprenom= (TextView) convertView.findViewById(R.id.tvprenom2);
            Map<String, String> e = datalist.get(position);
            tvnom.setText(e.get("nom"));
            tvprenom.setText(e.get("prenom"));

            return convertView;
        }
    }

}
