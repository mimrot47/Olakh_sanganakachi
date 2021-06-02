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

public class chapter5 extends AppCompatActivity {
    TextView bottom5,p5h1,p5h2,p5h3,p5h4,p5h5,p5h6,p5h7,p5h8,p5h9,p5h10,p5h11,p5h12,p5h13,p5h14,p5h15,p5h16,p5h17,p5h18,p5h19,p5h20,p5h21,
            p5h22,p5h23,p5h24,p5h25,p5h26,p5h27;
    ImageButton backbuttonp5;
    AdView mAdviewp5a1,mAdviewp5a2,mAdviewp5a3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter5);
        MobileAds.initialize(this,"ca-app-pub-6803124371320620~2136095051");
        mAdviewp5a1= findViewById(R.id.adViewp5a1);
        mAdviewp5a2=(AdView)findViewById(R.id.adViewp5a2);
        mAdviewp5a3=(AdView)findViewById(R.id.adViewp5a3);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdviewp5a1.loadAd(adRequest);
        mAdviewp5a2.loadAd(adRequest);
        mAdviewp5a3.loadAd(adRequest);
        backbuttonp5=(ImageButton) findViewById(R.id.backbuttonp5);
        backbuttonp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        p5h1=(TextView) findViewById(R.id.p5h1);
        p5h2=(TextView) findViewById(R.id.p5h2);
        p5h3=(TextView) findViewById(R.id.p5h3);
        p5h4=(TextView) findViewById(R.id.p5h4);
        p5h5=(TextView) findViewById(R.id.p5h5);
        p5h6=(TextView) findViewById(R.id.p5h6);
        p5h7=(TextView) findViewById(R.id.p5h7);
        p5h8=(TextView) findViewById(R.id.p5h8);
        p5h9=(TextView) findViewById(R.id.p5h9);
        p5h10=(TextView) findViewById(R.id.p5h10);
        p5h11=(TextView) findViewById(R.id.p5h11);
        p5h12=(TextView) findViewById(R.id.p5h12);
        p5h13=(TextView) findViewById(R.id.p5h13);
        p5h14=(TextView) findViewById(R.id.p5h14);
        p5h15=(TextView) findViewById(R.id.p5h15);
        p5h16=(TextView) findViewById(R.id.p5h16);
        p5h17=(TextView) findViewById(R.id.p5h17);
        p5h18=(TextView) findViewById(R.id.p5h18);
        p5h19=(TextView) findViewById(R.id.p5h19);
        p5h20=(TextView) findViewById(R.id.p5h20);
        p5h21=(TextView) findViewById(R.id.p5h21);
        p5h22=(TextView) findViewById(R.id.p5h22);
        p5h23=(TextView) findViewById(R.id.p5h23);
        p5h24=(TextView) findViewById(R.id.p5h24);
        p5h25=(TextView) findViewById(R.id.p5h25);
        p5h26=(TextView) findViewById(R.id.p5h26);
        p5h27=(TextView) findViewById(R.id.p5h27);
        bottom5=(TextView) findViewById(R.id.bottom5);

        Typeface face=Typeface.createFromAsset(getAssets(),"K50.TTF");
        Typeface face2=Typeface.createFromAsset(getAssets(),"K95.TTF");
        bottom5.setTypeface(face2);
        p5h1.setTypeface(face);
        p5h2.setTypeface(face);
        p5h3.setTypeface(face);
        p5h4.setTypeface(face);
        p5h5.setTypeface(face);
        p5h6.setTypeface(face);
        p5h7.setTypeface(face);
        p5h8.setTypeface(face);
        p5h9.setTypeface(face);
        p5h10.setTypeface(face);
        p5h11.setTypeface(face);
        p5h12.setTypeface(face);
        p5h13.setTypeface(face);
        p5h14.setTypeface(face);
        p5h15.setTypeface(face);
        p5h16.setTypeface(face);
        p5h17.setTypeface(face);
        p5h18.setTypeface(face);
        p5h19.setTypeface(face);
        p5h20.setTypeface(face);
        p5h21.setTypeface(face);
        p5h22.setTypeface(face);
        p5h23.setTypeface(face);
        p5h24.setTypeface(face);
        p5h25.setTypeface(face);
        p5h26.setTypeface(face);
        p5h27.setTypeface(face);

    }
}
