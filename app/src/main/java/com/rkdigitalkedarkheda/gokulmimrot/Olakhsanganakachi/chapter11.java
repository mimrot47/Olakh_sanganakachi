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

public class chapter11 extends AppCompatActivity {
    TextView bottom11,p11h1,p11h2,p11h3,p11h4,p11h5,p11h6,p11h7,p11h8,p11h9,p11h10,p11h11,p11h12,p11h13,p11h14,p11h15,p11h16,p11h17;
    ImageButton backbuttonp11;
    AdView mAdviewp11a1,mAdviewp11a2,mAdviewp11a3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter11);
        MobileAds.initialize(this,"ca-app-pub-6803124371320620~2136095051");
        mAdviewp11a1= findViewById(R.id.adViewp11a1);
        mAdviewp11a2=(AdView)findViewById(R.id.adViewp11a2);
        mAdviewp11a3=(AdView)findViewById(R.id.adViewp11a3);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdviewp11a1.loadAd(adRequest);
        mAdviewp11a2.loadAd(adRequest);
        mAdviewp11a3.loadAd(adRequest);

        backbuttonp11=(ImageButton) findViewById(R.id.backbuttonp11);
        backbuttonp11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        p11h1=(TextView) findViewById(R.id.p11h1);
        p11h2=(TextView) findViewById(R.id.p11h2);
        p11h3=(TextView) findViewById(R.id.p11h3);
        p11h4=(TextView) findViewById(R.id.p11h4);
        p11h5=(TextView) findViewById(R.id.p11h5);
        p11h6=(TextView) findViewById(R.id.p11h6);
        p11h7=(TextView) findViewById(R.id.p11h7);
        p11h8=(TextView) findViewById(R.id.p11h8);
        p11h9=(TextView) findViewById(R.id.p11h9);
        p11h10=(TextView) findViewById(R.id.p11h10);
        p11h11=(TextView) findViewById(R.id.p11h11);
        p11h12=(TextView) findViewById(R.id.p11h12);
        p11h13=(TextView) findViewById(R.id.p11h13);
        p11h14=(TextView) findViewById(R.id.p11h14);
        p11h15=(TextView) findViewById(R.id.p11h15);
        p11h16=(TextView) findViewById(R.id.p11h16);
        p11h17=(TextView) findViewById(R.id.p11h17);


        bottom11=(TextView) findViewById(R.id.bottom11);
        Typeface face=Typeface.createFromAsset(getAssets(),"K50.TTF");
        Typeface face2=Typeface.createFromAsset(getAssets(),"K95.TTF");
        bottom11.setTypeface(face2);
        p11h1.setTypeface(face);
        p11h2.setTypeface(face);
        p11h3.setTypeface(face);
        p11h4.setTypeface(face);
        p11h5.setTypeface(face);
        p11h6.setTypeface(face);
        p11h7.setTypeface(face);
        p11h8.setTypeface(face);
        p11h9.setTypeface(face);
        p11h10.setTypeface(face);
        p11h11.setTypeface(face);
        p11h12.setTypeface(face);
        p11h13.setTypeface(face);
        p11h14.setTypeface(face);
        p11h15.setTypeface(face);
        p11h16.setTypeface(face);
        p11h17.setTypeface(face);
    }
}
