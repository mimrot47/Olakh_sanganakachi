package com.rkdigitalkedarkheda.gokulmimrot.Olakhsanganakachi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class chapter12 extends AppCompatActivity {
ImageButton backbtn12;
    AdView mAdviewp12a1,mAdviewp12a2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter12);
        MobileAds.initialize(this,"ca-app-pub-6803124371320620~2136095051");
        mAdviewp12a1= findViewById(R.id.adViewp12a1);
        mAdviewp12a2=(AdView)findViewById(R.id.adViewp12a2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdviewp12a1.loadAd(adRequest);
        mAdviewp12a2.loadAd(adRequest);
        backbtn12=(ImageButton)findViewById(R.id.backbuttonp12);
        backbtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
