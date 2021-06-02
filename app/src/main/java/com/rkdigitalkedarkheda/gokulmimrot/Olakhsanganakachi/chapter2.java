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

public class chapter2 extends AppCompatActivity {
    TextView bottom1,p2h1,p2h2,p2h3,p2h4,p2h5,p2h6,p2h7,p2h8,p2h9,p2h10,p2h11,p2h12,p2h13,p2h14,p2h15,p2h16,p2h17,p2h18,p2h19,p2h20,p2h21,
            p2h22,p2h23;
    ImageButton backbuttonp2;
    AdView mAdviewp2a1,mAdviewp2a2,mAdviewp2a3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter2);
        MobileAds.initialize(this,"ca-app-pub-6803124371320620~2136095051");
        mAdviewp2a1= findViewById(R.id.adViewp2a1);
        mAdviewp2a2=(AdView)findViewById(R.id.adViewp2a2);
        mAdviewp2a3=(AdView)findViewById(R.id.adViewp2a3);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdviewp2a1.loadAd(adRequest);
        mAdviewp2a2.loadAd(adRequest);
        mAdviewp2a3.loadAd(adRequest);
        backbuttonp2=(ImageButton) findViewById(R.id.backbuttonp2);
        backbuttonp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        p2h1=(TextView) findViewById(R.id.p2h1);
        p2h2=(TextView) findViewById(R.id.p2h2);
        p2h3=(TextView) findViewById(R.id.p2h3);
        p2h4=(TextView) findViewById(R.id.p2h4);
        p2h5=(TextView) findViewById(R.id.p2h5);
        p2h6=(TextView) findViewById(R.id.p2h6);
        p2h7=(TextView) findViewById(R.id.p2h7);
        p2h8=(TextView) findViewById(R.id.p2h8);
        p2h9=(TextView) findViewById(R.id.p2h9);
        p2h10=(TextView) findViewById(R.id.p2h10);
        p2h11=(TextView) findViewById(R.id.p2h11);
        p2h12=(TextView) findViewById(R.id.p2h12);
        p2h13=(TextView) findViewById(R.id.p2h13);
        p2h14=(TextView) findViewById(R.id.p2h14);
        p2h15=(TextView) findViewById(R.id.p2h15);
        p2h16=(TextView) findViewById(R.id.p2h16);
        p2h17=(TextView) findViewById(R.id.p2h17);
        p2h18=(TextView) findViewById(R.id.p2h18);
        p2h19=(TextView) findViewById(R.id.p2h19);
        p2h20=(TextView) findViewById(R.id.p2h20);
        p2h21=(TextView) findViewById(R.id.p2h21);
        p2h22=(TextView) findViewById(R.id.p2h22);
        p2h23=(TextView) findViewById(R.id.p2h23);
        bottom1=(TextView) findViewById(R.id.bottom1);
        Typeface face=Typeface.createFromAsset(getAssets(),"K50.TTF");
        Typeface face2=Typeface.createFromAsset(getAssets(),"K95.TTF");
        bottom1.setTypeface(face2);
        p2h1.setTypeface(face);
        p2h2.setTypeface(face);
        p2h3.setTypeface(face);
        p2h4.setTypeface(face);
        p2h5.setTypeface(face);
        p2h6.setTypeface(face);
        p2h7.setTypeface(face);
        p2h8.setTypeface(face);
        p2h9.setTypeface(face);
        p2h10.setTypeface(face);
        p2h11.setTypeface(face);
        p2h12.setTypeface(face);
        p2h13.setTypeface(face);
        p2h14.setTypeface(face);
        p2h15.setTypeface(face);
        p2h16.setTypeface(face);
        p2h17.setTypeface(face);
        p2h18.setTypeface(face);
        p2h19.setTypeface(face);
        p2h20.setTypeface(face);
        p2h21.setTypeface(face);
        p2h22.setTypeface(face);
        p2h23.setTypeface(face);
    }
}
