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

public class chapter3 extends AppCompatActivity {
    TextView bottom3,p3h1,p3h2,p3h3,p3h4,p3h5,p3h6,p3h7;
    ImageButton backbuttonp3;
    AdView mAdviewp3a1,mAdviewp3a2,mAdviewp3a3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter3);
        MobileAds.initialize(this,"ca-app-pub-6803124371320620~2136095051");
        mAdviewp3a1= findViewById(R.id.adViewp3a1);
        mAdviewp3a2=(AdView)findViewById(R.id.adViewp3a2);
        mAdviewp3a3=(AdView)findViewById(R.id.adViewp3a3);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdviewp3a1.loadAd(adRequest);
        mAdviewp3a2.loadAd(adRequest);
        mAdviewp3a3.loadAd(adRequest);
        backbuttonp3=(ImageButton) findViewById(R.id.backbuttonp3);
        backbuttonp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        p3h1=(TextView) findViewById(R.id.p3h1);
        p3h2=(TextView) findViewById(R.id.p3h2);
        p3h3=(TextView) findViewById(R.id.p3h3);
        p3h4=(TextView) findViewById(R.id.p3h4);
        p3h5=(TextView) findViewById(R.id.p3h5);
        p3h6=(TextView) findViewById(R.id.p3h6);
        p3h7=(TextView) findViewById(R.id.p3h7);
        bottom3=(TextView) findViewById(R.id.bottom3);
        Typeface face=Typeface.createFromAsset(getAssets(),"K50.TTF");
        Typeface face2=Typeface.createFromAsset(getAssets(),"K95.TTF");
        bottom3.setTypeface(face2);
        p3h1.setTypeface(face);
        p3h2.setTypeface(face);
        p3h3.setTypeface(face);
        p3h4.setTypeface(face);
        p3h5.setTypeface(face);
        p3h6.setTypeface(face);
        p3h7.setTypeface(face);
    }
}
