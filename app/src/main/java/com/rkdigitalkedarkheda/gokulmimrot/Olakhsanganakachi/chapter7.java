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

public class chapter7 extends AppCompatActivity {
    TextView bottom7,p7h1,p7h2,p7h3,p7h4,p7h5,p7h6,p7h7,p7h8,p7h9,p7h10,p7h11,p7h12,p7h13,p7h14,p7h15,p7h16,p7h17;
    ImageButton backbuttonp7;
    AdView mAdviewp7a1,mAdviewp7a2,mAdviewp7a3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter7);
        MobileAds.initialize(this,"ca-app-pub-6803124371320620~2136095051");
        mAdviewp7a1= findViewById(R.id.adViewp7a1);
        mAdviewp7a2=(AdView)findViewById(R.id.adViewp7a2);
        mAdviewp7a3=(AdView)findViewById(R.id.adViewp7a3);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdviewp7a1.loadAd(adRequest);
        mAdviewp7a2.loadAd(adRequest);
        mAdviewp7a3.loadAd(adRequest);
        backbuttonp7=(ImageButton) findViewById(R.id.backbuttonp7);
        backbuttonp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        p7h1=(TextView) findViewById(R.id.p7h1);
        p7h2=(TextView) findViewById(R.id.p7h2);
        p7h3=(TextView) findViewById(R.id.p7h3);
        p7h4=(TextView) findViewById(R.id.p7h4);
        p7h5=(TextView) findViewById(R.id.p7h5);
        p7h6=(TextView) findViewById(R.id.p7h6);
        p7h7=(TextView) findViewById(R.id.p7h7);
        p7h8=(TextView) findViewById(R.id.p7h8);
        p7h9=(TextView) findViewById(R.id.p7h9);
        p7h10=(TextView) findViewById(R.id.p7h10);
        p7h11=(TextView) findViewById(R.id.p7h11);
        p7h12=(TextView) findViewById(R.id.p7h12);
        p7h13=(TextView) findViewById(R.id.p7h13);
        p7h14=(TextView) findViewById(R.id.p7h14);
        p7h15=(TextView) findViewById(R.id.p7h15);
        p7h16=(TextView) findViewById(R.id.p7h16);
        p7h17=(TextView) findViewById(R.id.p7h17);
        bottom7=(TextView) findViewById(R.id.bottom7);
        Typeface face=Typeface.createFromAsset(getAssets(),"K50.TTF");
        Typeface face2=Typeface.createFromAsset(getAssets(),"K95.TTF");
        bottom7.setTypeface(face2);
        p7h1.setTypeface(face);
        p7h2.setTypeface(face);
        p7h3.setTypeface(face);
        p7h4.setTypeface(face);
        p7h5.setTypeface(face);
        p7h6.setTypeface(face);
        p7h7.setTypeface(face);
        p7h8.setTypeface(face);
        p7h9.setTypeface(face);
        p7h10.setTypeface(face);
        p7h11.setTypeface(face);
        p7h12.setTypeface(face);
        p7h13.setTypeface(face);
        p7h14.setTypeface(face);
        p7h15.setTypeface(face);
        p7h16.setTypeface(face);
        p7h17.setTypeface(face);

    }
}
