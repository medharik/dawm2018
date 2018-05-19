package com.harik.com.harik.listeview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.harik.lenovo2017.dawmrappel.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ListPersponnalisee extends Activity implements AdapterView.OnItemClickListener {
    List<Map<String, String>> data;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_persponnalisee);
        lv = (ListView) findViewById(R.id.lvpersonnalise);
        data = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Random r = new Random();
            Map<String, String> e = new HashMap<>();
            e.put("nom", "nom " + r.nextInt(999));
            e.put("tel", "" + r.nextLong());
            data.add(e);
        }
        lv.setAdapter(new MonAdapter());
    }
        class MonAdapter extends BaseAdapter {

            @Override
            public int getCount() {
                return data.size();
            }

            @Override
            public Object getItem(int position) {
                return data.get(position);
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                if (convertView == null)
                    convertView = getLayoutInflater().inflate(R.layout.item_list, null);
                TextView tvnom = (TextView) convertView.findViewById(R.id.tvnomitem);
                TextView tvtel = (TextView) convertView.findViewById(R.id.tvtelitem);
                Map<String, String> e = data.get(position);

                tvnom.setText(e.get("nom"));
                tvtel.setText(e.get("tel"));

                return convertView;
            }
        }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
