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

public class chapter6 extends AppCompatActivity {
    TextView bottom6,p6h1,p6h2,p6h3,p6h4,p6h5,p6h6,p6h7,p6h8,p6h9,p6h10,p6h11,p6h12;
    ImageButton backbuttonp6;
    AdView mAdviewp6a1,mAdviewp6a2,mAdviewp6a3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter6);
        MobileAds.initialize(this,"ca-app-pub-6803124371320620~2136095051");
        mAdviewp6a1= findViewById(R.id.adViewp6a1);
        mAdviewp6a2=(AdView)findViewById(R.id.adViewp6a2);
        mAdviewp6a3=(AdView)findViewById(R.id.adViewp6a3);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdviewp6a1.loadAd(adRequest);
        mAdviewp6a2.loadAd(adRequest);
        mAdviewp6a3.loadAd(adRequest);
        
        
        backbuttonp6=(ImageButton) findViewById(R.id.backbuttonp6);
        backbuttonp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        p6h1=(TextView) findViewById(R.id.d6h1);
        p6h2=(TextView) findViewById(R.id.p6h2);
        p6h3=(TextView) findViewById(R.id.p6h3);
        p6h4=(TextView) findViewById(R.id.p6h4);
        p6h5=(TextView) findViewById(R.id.p6h5);
        p6h6=(TextView) findViewById(R.id.p6h6);
        p6h7=(TextView) findViewById(R.id.p6h7);
        p6h8=(TextView) findViewById(R.id.p6h8);
        p6h9=(TextView) findViewById(R.id.p6h9);
        p6h10=(TextView) findViewById(R.id.p6h10);
        p6h11=(TextView) findViewById(R.id.p6h11);
        p6h12=(TextView) findViewById(R.id.p6h12);
        bottom6=(TextView) findViewById(R.id.bottom6);

        Typeface face=Typeface.createFromAsset(getAssets(),"K50.TTF");
        Typeface face2=Typeface.createFromAsset(getAssets(),"K95.TTF");
        bottom6.setTypeface(face2);
        p6h1.setTypeface(face);
        p6h2.setTypeface(face);
        p6h3.setTypeface(face);
        p6h4.setTypeface(face);
        p6h5.setTypeface(face);
        p6h6.setTypeface(face);
        p6h7.setTypeface(face);
        p6h8.setTypeface(face);
        p6h9.setTypeface(face);
        p6h10.setTypeface(face);
        p6h11.setTypeface(face);
        p6h12.setTypeface(face);
    }
}
