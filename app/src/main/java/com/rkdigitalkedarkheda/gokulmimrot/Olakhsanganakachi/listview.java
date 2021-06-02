package com.rkdigitalkedarkheda.gokulmimrot.Olakhsanganakachi;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class listview extends AppCompatActivity {
    TextView logo_text,logo_text1;
    Button start,share,about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        about=(Button)findViewById(R.id.aboutus) ;
        share=(Button)findViewById(R.id.share);
        logo_text1=(TextView)findViewById(R.id.logo_text1);
        logo_text=(TextView)findViewById(R.id.logo_text);
        start=(Button)findViewById(R.id.startbutton);
        Typeface face=Typeface.createFromAsset(getAssets(),"K95.TTF");
        logo_text.setTypeface(face);
        logo_text1.setTypeface(face);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_SUBJECT,"Olakh Sanganakachi");
                i.putExtra(Intent.EXTRA_TEXT,"Download app and learn conputer fandamentals in marathi\n https://play.google.com/store/apps/details?id=com.rkdigitalkedarkheda.gokulmimrot.Olakhsanganachi");
                startActivity(Intent.createChooser(i,"share plase"));

            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),data.class);
                startActivity(intent);
            }
        });

     about.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent = new Intent(getApplicationContext(),about.class);
             startActivity(intent);
         }
     });
    }

}
