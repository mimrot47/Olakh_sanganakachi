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

public class chapter9 extends AppCompatActivity {
    TextView bottom9,p9h1,p9h2,p9h3,p9h4,p9h5,p9h6,p9h7,p9h8,p9h9,p9h10,p9h11,p9h12,p9h13,p9h14,p9h15,p9h16,p9h17,p9h18,p9h19,p9h20;
    ImageButton backbuttonp9;
    AdView mAdviewp9a1,mAdviewp9a2,mAdviewp9a3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter9);
        MobileAds.initialize(this,"ca-app-pub-6803124371320620~2136095051");
        mAdviewp9a1= findViewById(R.id.adViewp9a1);
        mAdviewp9a2=(AdView)findViewById(R.id.adViewp9a2);
        mAdviewp9a3=(AdView)findViewById(R.id.adViewp9a3);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdviewp9a1.loadAd(adRequest);
        mAdviewp9a2.loadAd(adRequest);
        mAdviewp9a3.loadAd(adRequest);
        backbuttonp9=(ImageButton) findViewById(R.id.backbuttonp9);
        backbuttonp9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        p9h1=(TextView) findViewById(R.id.p9h1);
        p9h2=(TextView) findViewById(R.id.p9h2);
        p9h3=(TextView) findViewById(R.id.p9h3);
        p9h4=(TextView) findViewById(R.id.p9h4);
        p9h5=(TextView) findViewById(R.id.p9h5);
        p9h6=(TextView) findViewById(R.id.p9h6);
        p9h7=(TextView) findViewById(R.id.p9h7);
        p9h8=(TextView) findViewById(R.id.p9h8);
        p9h9=(TextView) findViewById(R.id.p9h9);
        p9h10=(TextView) findViewById(R.id.p9h10);
        p9h11=(TextView) findViewById(R.id.p9h11);
        p9h12=(TextView) findViewById(R.id.p9h12);
        p9h13=(TextView) findViewById(R.id.p9h13);
        p9h14=(TextView) findViewById(R.id.p9h14);
        p9h15=(TextView) findViewById(R.id.p9h15);
        p9h16=(TextView) findViewById(R.id.p9h16);
        p9h17=(TextView) findViewById(R.id.p9h17);
        p9h18=(TextView) findViewById(R.id.p9h18);
        p9h19=(TextView) findViewById(R.id.p9h19);
        p9h20=(TextView) findViewById(R.id.p9h20);
        bottom9=(TextView) findViewById(R.id.bottom9);
        

        Typeface face=Typeface.createFromAsset(getAssets(),"K50.TTF");
        Typeface face2=Typeface.createFromAsset(getAssets(),"K95.TTF");
        bottom9.setTypeface(face2);
        p9h1.setTypeface(face);
        p9h2.setTypeface(face);
        p9h3.setTypeface(face);
        p9h4.setTypeface(face);
        p9h5.setTypeface(face);
        p9h6.setTypeface(face);
        p9h7.setTypeface(face);
        p9h8.setTypeface(face);
        p9h9.setTypeface(face);
        p9h10.setTypeface(face);
        p9h11.setTypeface(face);
        p9h12.setTypeface(face);
        p9h13.setTypeface(face);
        p9h14.setTypeface(face);
        p9h15.setTypeface(face);
        p9h16.setTypeface(face);
        p9h17.setTypeface(face);
        p9h18.setTypeface(face);
        p9h19.setTypeface(face);
        p9h20.setTypeface(face);
    }
}
