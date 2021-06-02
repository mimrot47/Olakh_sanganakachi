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

public class chapter1 extends AppCompatActivity {
    TextView bottom1,p1h1,p1h2,p1h3,p1h4,p1h5,p1h6,p1h7,p1h8,p1h9,p1h10,p1h11,p1h12,p1h13,p1h14,p1h15,p1h16,p1h17,p1h18,p1h19,p1h20,p1h21,
            p1h22;
    ImageButton backbuttonp1;
    AdView mAdview,mAdviewp1a1,mAdviewp1a2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter1);
        MobileAds.initialize(this,"ca-app-pub-6803124371320620~2136095051");
        mAdview= findViewById(R.id.adView);
        mAdviewp1a1=(AdView)findViewById(R.id.adViewp1a1);
        mAdviewp1a2=(AdView)findViewById(R.id.adViewp1a2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);
        mAdviewp1a1.loadAd(adRequest);
        mAdviewp1a2.loadAd(adRequest);




        backbuttonp1=(ImageButton) findViewById(R.id.backbuttonp1);
        backbuttonp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        p1h1=(TextView) findViewById(R.id.p1h1);
        p1h2=(TextView) findViewById(R.id.p1h2);
        p1h3=(TextView) findViewById(R.id.p1h3);
        p1h4=(TextView) findViewById(R.id.p1h4);
        p1h5=(TextView) findViewById(R.id.p1h5);
        p1h6=(TextView) findViewById(R.id.p1h6);
        p1h7=(TextView) findViewById(R.id.p1h7);
        p1h8=(TextView) findViewById(R.id.p1h8);
        p1h9=(TextView) findViewById(R.id.p1h9);
        p1h10=(TextView) findViewById(R.id.p1h10);
        p1h11=(TextView) findViewById(R.id.p1h11);
        p1h12=(TextView) findViewById(R.id.p1h12);
        p1h13=(TextView) findViewById(R.id.p1h13);
        p1h14=(TextView) findViewById(R.id.p1h14);
        p1h15=(TextView) findViewById(R.id.p1h15);
        p1h16=(TextView) findViewById(R.id.p1h16);
        p1h17=(TextView) findViewById(R.id.p1h17);
        p1h18=(TextView) findViewById(R.id.p1h18);
        p1h19=(TextView) findViewById(R.id.p1h19);
        p1h20=(TextView) findViewById(R.id.p1h20);
        p1h21=(TextView) findViewById(R.id.p1h21);
        p1h22=(TextView) findViewById(R.id.p1h22);
        bottom1=(TextView) findViewById(R.id.bottom1);
        Typeface face=Typeface.createFromAsset(getAssets(),"K50.TTF");
        Typeface face2= Typeface.createFromAsset(getAssets(),"K95.TTF");
        bottom1.setTypeface(face2);
        p1h1.setTypeface(face);
        p1h2.setTypeface(face);
        p1h3.setTypeface(face);
        p1h4.setTypeface(face);
        p1h5.setTypeface(face);
        p1h6.setTypeface(face);
        p1h7.setTypeface(face);
        p1h8.setTypeface(face);
        p1h9.setTypeface(face);
        p1h10.setTypeface(face);
        p1h11.setTypeface(face);
        p1h12.setTypeface(face);
        p1h13.setTypeface(face);
        p1h14.setTypeface(face);
        p1h15.setTypeface(face);
        p1h16.setTypeface(face);
        p1h17.setTypeface(face);
        p1h18.setTypeface(face);
        p1h19.setTypeface(face);
        p1h20.setTypeface(face);
        p1h21.setTypeface(face);
        p1h22.setTypeface(face);



    }
}
