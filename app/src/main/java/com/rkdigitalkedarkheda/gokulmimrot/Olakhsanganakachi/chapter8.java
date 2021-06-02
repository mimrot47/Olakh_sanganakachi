package com.rkdigitalkedarkheda.gokulmimrot.Olakhsanganakachi;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class chapter8 extends AppCompatActivity {
    TextView bottom8,p8h1,p8h2,p8h3,p8h4,p8h5,p8h6,p8h7,p8h8,p8h9,p8h10,p8h11,p8h12,p8h13,p8h14,p8h15,p8h16,p8h17,p8h18,p8h19,p8h20,p8h21,
            p8h22,p8h23,p8h24,p8h25;
    ImageButton backbuttonp8;
    AdView mAdviewp8a1,mAdviewp8a2,mAdviewp8a3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter8);
        MobileAds.initialize(this,"ca-app-pub-6803124371320620~2136095051");
        mAdviewp8a1= findViewById(R.id.adViewp8a1);
        mAdviewp8a2=(AdView)findViewById(R.id.adViewp8a2);
        mAdviewp8a3=(AdView)findViewById(R.id.adViewp8a3);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdviewp8a1.loadAd(adRequest);
        mAdviewp8a2.loadAd(adRequest);
        mAdviewp8a3.loadAd(adRequest);
        backbuttonp8=(ImageButton) findViewById(R.id.backbuttonp8);
        backbuttonp8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        p8h1=(TextView) findViewById(R.id.p8h1);
        p8h2=(TextView) findViewById(R.id.p8h2);
        p8h3=(TextView) findViewById(R.id.p8h3);
        p8h4=(TextView) findViewById(R.id.p8h4);
        p8h5=(TextView) findViewById(R.id.p8h5);
        p8h6=(TextView) findViewById(R.id.p8h6);
        p8h7=(TextView) findViewById(R.id.p8h7);
        p8h8=(TextView) findViewById(R.id.p8h8);
        p8h9=(TextView) findViewById(R.id.p8h9);
        p8h10=(TextView) findViewById(R.id.p8h10);
        p8h11=(TextView) findViewById(R.id.p8h11);
        p8h12=(TextView) findViewById(R.id.p8h12);
        p8h13=(TextView) findViewById(R.id.p8h13);
        p8h14=(TextView) findViewById(R.id.p8h14);
        p8h15=(TextView) findViewById(R.id.p8h15);
        p8h16=(TextView) findViewById(R.id.p8h16);
        p8h17=(TextView) findViewById(R.id.p8h17);
        p8h18=(TextView) findViewById(R.id.p8h18);
        p8h19=(TextView) findViewById(R.id.p8h19);
        p8h20=(TextView) findViewById(R.id.p8h20);
        p8h21=(TextView) findViewById(R.id.p8h21);
        p8h22=(TextView) findViewById(R.id.p8h22);
        p8h23=(TextView) findViewById(R.id.p8h23);
        p8h24=(TextView) findViewById(R.id.p8h24);
        p8h25=(TextView) findViewById(R.id.p8h25);

        bottom8=(TextView) findViewById(R.id.bottom8);
        Typeface face=Typeface.createFromAsset(getAssets(),"K50.TTF");
        Typeface face2=Typeface.createFromAsset(getAssets(),"K95.TTF");
        bottom8.setTypeface(face2);
        p8h1.setTypeface(face);
        p8h2.setTypeface(face);
        p8h3.setTypeface(face);
        p8h4.setTypeface(face);
        p8h5.setTypeface(face);
        p8h6.setTypeface(face);
        p8h7.setTypeface(face);
        p8h8.setTypeface(face);
        p8h9.setTypeface(face);
        p8h10.setTypeface(face);
        p8h11.setTypeface(face);
        p8h12.setTypeface(face);
        p8h13.setTypeface(face);
        p8h14.setTypeface(face);
        p8h15.setTypeface(face);
        p8h16.setTypeface(face);
        p8h17.setTypeface(face);
        p8h18.setTypeface(face);
        p8h19.setTypeface(face);
        p8h20.setTypeface(face);
        p8h21.setTypeface(face);
        p8h22.setTypeface(face);
        p8h23.setTypeface(face);
        p8h24.setTypeface(face);
        p8h25.setTypeface(face);
    }
}
