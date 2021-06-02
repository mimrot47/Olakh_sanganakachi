package com.rkdigitalkedarkheda.gokulmimrot.Olakhsanganakachi;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class data extends AppCompatActivity {
    ImageButton backbtn;
    Button Lbtn1,Lbtn2,Lbtn3,Lbtn4,Lbtn5,Lbtn6,Lbtn7,Lbtn8,Lbtn9,Lbtn10,Lbtn11,Lbtn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        backbtn=(ImageButton)findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Lbtn1=(Button)findViewById(R.id.lbtn1) ;
        Lbtn2=(Button)findViewById(R.id.lbtn2) ;
        Lbtn3=(Button)findViewById(R.id.lbtn3) ;
        Lbtn4=(Button)findViewById(R.id.lbtn4) ;
        Lbtn5=(Button)findViewById(R.id.lbtn5) ;
        Lbtn6=(Button)findViewById(R.id.lbtn6) ;
        Lbtn7=(Button)findViewById(R.id.lbtn7) ;
        Lbtn8=(Button)findViewById(R.id.lbtn8) ;
        Lbtn9=(Button)findViewById(R.id.lbtn9) ;
        Lbtn10=(Button)findViewById(R.id.lbtn10) ;
        Lbtn11=(Button)findViewById(R.id.lbtn11) ;
        Lbtn12=(Button)findViewById(R.id.lbtn12);

        Lbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chapter1.class);
                startActivity(intent);
            }
        });
        Lbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),chapter2.class);
                startActivity(intent);

            }
        });
        Lbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),chapter3.class);
                startActivity(intent);
            }
        });
        Lbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chapter4.class);
                startActivity(intent);
            }
        });
        Lbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),chapter5.class);
                startActivity(intent);
            }
        });
        Lbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),chapter6.class);
                startActivity(intent);
            }
        });
        Lbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chapter7.class);
                startActivity(intent);
            }
        });
        Lbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),chapter8.class);
                startActivity(intent);
            }
        });
        Lbtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),chapter9.class);
                startActivity(intent);
            }
        });
       Lbtn10.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(getApplicationContext(),chapter10.class);
               startActivity(intent);
           }
       });
       Lbtn11.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(getApplicationContext(),chapter11.class);
               startActivity(intent);
           }
       });
        Lbtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chapter12.class);
                startActivity(intent);
            }
        });


        Typeface
        face = Typeface.createFromAsset(getAssets(),"K95.TTF");
        Lbtn1.setTypeface(face);
        Lbtn2.setTypeface(face);
        Lbtn3.setTypeface(face);
        Lbtn4.setTypeface(face);
        Lbtn5.setTypeface(face);
        Lbtn6.setTypeface(face);
        Lbtn7.setTypeface(face);
        Lbtn8.setTypeface(face);
        Lbtn9.setTypeface(face);
        Lbtn10.setTypeface(face);
        Lbtn11.setTypeface(face);

    }
}
