package com.example.seleraku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Accessories_2 extends AppCompatActivity {

    LinearLayout pindahHal2;
    LinearLayout pindahHal3;
    LinearLayout pindahHal4;
    LinearLayout pindahHal5;
    LinearLayout pindahHal6;
    LinearLayout pindahHal7;
    LinearLayout pindahHal8;
    LinearLayout pindahHal9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories_2);

        pindahHal2 = findViewById(R.id.teh);
        pindahHal3 = findViewById(R.id.je);
        pindahHal4 = findViewById(R.id.jam);
        pindahHal5 = findViewById(R.id.al);
        pindahHal6 = findViewById(R.id.mang);
        pindahHal7 = findViewById(R.id.capp);
        pindahHal8 = findViewById(R.id.mel);
        pindahHal9 = findViewById(R.id.kop);

        pindahHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Accessories_2.this, teh.class);
                startActivity(i);
            }
        });
        pindahHal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Accessories_2.this, jeruk.class);
                startActivity(i);
            }
        });
        pindahHal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Accessories_2.this, jambu.class);
                startActivity(i);
            }
        });
        pindahHal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Accessories_2.this, baju3.class);
                startActivity(i);
            }
        });
        pindahHal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Accessories_2.this, mangga.class);
                startActivity(i);
            }
        });
        pindahHal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Accessories_2.this, cappucino.class);
                startActivity(i);
            }
        });
        pindahHal8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Accessories_2.this, melon.class);
                startActivity(i);
            }
        });
        pindahHal9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Accessories_2.this, kopi.class);
                startActivity(i);
            }
        });
    }

    public void openActivity5(View view) {
        Intent intent = new Intent(this, Accessories_2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

}
