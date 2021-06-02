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

public class chapter10 extends AppCompatActivity {
    TextView bottom10,p10h1,p10h2,p10h3,p10h4,p10h5,p10h6,p10h7,p10h8,p10h9,p10h10;
    ImageButton backbuttonp10;
    AdView mAdviewp10a1,mAdviewp10a2,mAdviewp10a3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter10);
        MobileAds.initialize(this,"ca-app-pub-6803124371320620~2136095051");
        mAdviewp10a1= findViewById(R.id.adViewp10a1);
        mAdviewp10a2=(AdView)findViewById(R.id.adViewp10a2);
        mAdviewp10a3=(AdView)findViewById(R.id.adViewp10a3);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdviewp10a1.loadAd(adRequest);
        mAdviewp10a2.loadAd(adRequest);
        mAdviewp10a3.loadAd(adRequest);

        backbuttonp10=(ImageButton) findViewById(R.id.backbuttonp10);
        backbuttonp10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        p10h1=(TextView) findViewById(R.id.p10h1);
        p10h2=(TextView) findViewById(R.id.p10h2);
        p10h3=(TextView) findViewById(R.id.p10h3);
        p10h4=(TextView) findViewById(R.id.p10h4);
        p10h5=(TextView) findViewById(R.id.p10h5);
        p10h6=(TextView) findViewById(R.id.p10h6);
        p10h7=(TextView) findViewById(R.id.p10h7);
        p10h8=(TextView) findViewById(R.id.p10h8);
        p10h9=(TextView) findViewById(R.id.p10h9);
        p10h10=(TextView) findViewById(R.id.p10h10);
        bottom10=(TextView)findViewById(R.id.bottom10);


        Typeface face=Typeface.createFromAsset(getAssets(),"K50.TTF");
        Typeface face2=Typeface.createFromAsset(getAssets(),"K95.TTF");
        bottom10.setTypeface(face2);
        p10h1.setTypeface(face);
        p10h2.setTypeface(face);
        p10h3.setTypeface(face);
        p10h4.setTypeface(face);
        p10h5.setTypeface(face);
        p10h6.setTypeface(face);
        p10h7.setTypeface(face);
        p10h8.setTypeface(face);
        p10h9.setTypeface(face);
        p10h10.setTypeface(face);

    }
}
