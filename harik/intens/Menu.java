package com.harik.intens;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.harik.com.harik.listeview.ListPersponnalisee;
import com.harik.com.harik.listeview.ListeViewSimple;
import com.harik.lenovo2017.dawmrappel.R;
import com.harik.webView.WebViewDawm;

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
                    i=new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people"));
                    break;

                case 4: //GEo
                    i=new Intent(Intent.ACTION_VIEW,   Uri.parse("geo:33.5740,-7.6813"));
                    break;
                case 5: //GEo
                    i = new Intent("android.media.action.IMAGE_CAPTURE");

                    break;
                case 6: //GEo
                    i = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:med.harik@gmail.com"));
                    break;
                case 7: //on activity for result
                    i = new Intent(Menu.this,MainActivityResultatA.class);
                    break;
                case 8: //on activity for result
                    i = new Intent(Menu.this,ListeViewSimple.class);
                    break;
                case 9: //on activity for result
                    i = new Intent(Menu.this,ListeViewSimple.class);
                    break;
                case 10: //map
                   // i = new Intent(Menu.this,MapsActivity.class);
                    break;
                case 11: //lv perso
                    i = new Intent(Menu.this,ListPersponnalisee.class);
                    break;
                case 12: //webview
                    i = new Intent(Menu.this,WebViewDawm.class);
                    break;
                default:
                    Toast.makeText(this, "Choix invalide", Toast.LENGTH_SHORT).show();

            }
            startActivity(i);

        }

}
