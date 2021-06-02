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

public class chapter4 extends AppCompatActivity {
    TextView bottom4,p4h1,p4h2,p4h3,p4h4,p4h5,p4h6,p4h7,p4h8,p4h9,p4h10;
    ImageButton backbuttonp4;
    AdView mAdviewp4a1,mAdviewp4a2,mAdviewp4a3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter4);
        MobileAds.initialize(this,"ca-app-pub-6803124371320620~2136095051");
        mAdviewp4a1= findViewById(R.id.adViewp4a1);
        mAdviewp4a2=(AdView)findViewById(R.id.adViewp4a2);
        mAdviewp4a3=(AdView)findViewById(R.id.adViewp4a3);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdviewp4a1.loadAd(adRequest);
        mAdviewp4a2.loadAd(adRequest);
        mAdviewp4a3.loadAd(adRequest);
        backbuttonp4=(ImageButton) findViewById(R.id.backbuttonp4);
        backbuttonp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        p4h1=(TextView) findViewById(R.id.p4h1);
        p4h2=(TextView) findViewById(R.id.p4h2);
        p4h3=(TextView) findViewById(R.id.p4h3);
        p4h4=(TextView) findViewById(R.id.p4h4);
        p4h5=(TextView) findViewById(R.id.p4h5);
        p4h6=(TextView) findViewById(R.id.p4h6);
        p4h7=(TextView) findViewById(R.id.p4h7);
        p4h8=(TextView) findViewById(R.id.p4h8);
        p4h9=(TextView) findViewById(R.id.p4h9);
        p4h10=(TextView) findViewById(R.id.p4h10);
        bottom4=(TextView) findViewById(R.id.bottom4);
        Typeface face=Typeface.createFromAsset(getAssets(),"K50.TTF");
        Typeface face2=Typeface.createFromAsset(getAssets(),"K95.TTF");
        bottom4.setTypeface(face2);
        p4h1.setTypeface(face);
        p4h2.setTypeface(face);
        p4h3.setTypeface(face);
        p4h4.setTypeface(face);
        p4h5.setTypeface(face);
        p4h6.setTypeface(face);
        p4h7.setTypeface(face);
        p4h8.setTypeface(face);
        p4h9.setTypeface(face);
        p4h10.setTypeface(face);
    }
}
