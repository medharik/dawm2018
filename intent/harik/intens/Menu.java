package com.harik.intens;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.harik.lenovo2017.dawmrappel.R;

public class Menu extends Activity implements AdapterView.OnItemClickListener {
ListView lvmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    lvmenu= (ListView) findViewById(R.id.lvmenu);
        lvmenu.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i=null;
        switch (position){
            case 0: //web
                i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://eurosport.fr"));
                break;
            case 1: //tel
                i=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0656453423"));
                break;
            case 2: //sms
                i=new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:0656453423"));
                break;
            case 3: //sms
                i=new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
                break;

            case 4: //GEo
                i=new Intent(Intent.ACTION_VIEW,   Uri.parse("geo:33.5740,-7.6813"));
                break;
            case 5: //GEo
                i = new Intent("android.media.action.IMAGE_CAPTURE");
                break;
            default:
                Toast.makeText(this, "Choix invalide", Toast.LENGTH_SHORT).show();

        }
        startActivity(i);

    }
}
