package com.example.seleraku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Jacket_page4 extends AppCompatActivity {

    LinearLayout pindahHal2;
    LinearLayout pindahHal3;
    LinearLayout pindahHal4;
    LinearLayout pindahHal5;
    LinearLayout pindahHal6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jacket_page4);

        pindahHal2 = findViewById(R.id.sing);
        pindahHal3 = findViewById(R.id.tah);
        pindahHal4 = findViewById(R.id.jmr);
        pindahHal5 = findViewById(R.id.ote);
        pindahHal6 = findViewById(R.id.pis);

        pindahHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Jacket_page4.this, singkong.class);
                startActivity(i);
            }
        });
        pindahHal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Jacket_page4.this, k_tahu.class);
                startActivity(i);
            }
        });
        pindahHal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Jacket_page4.this, jamur.class);
                startActivity(i);
            }
        });
        pindahHal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Jacket_page4.this, ote_ote.class);
                startActivity(i);
            }
        });
        pindahHal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Jacket_page4.this, k_pisang.class);
                startActivity(i);
            }
        });
    }
    public void openActivity6(View view) {
        Intent intent = new Intent(this, Jacket_page4.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

}
