package com.example.seleraku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Tshrsit_1 extends AppCompatActivity {

    LinearLayout pindahHal2;
    LinearLayout pindahHal3;
    LinearLayout pindahHal4;
    LinearLayout pindahHal5;
    LinearLayout pindahHal6;
    LinearLayout pindahHal7;
    LinearLayout pindahHal8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tshrsit_1);

        pindahHal2 = findViewById(R.id.aygor1);
        pindahHal3 = findViewById(R.id.aybak);
        pindahHal4 = findViewById(R.id.ayprek);
        pindahHal5 = findViewById(R.id.begor);
        pindahHal6 = findViewById(R.id.bekar);
        pindahHal7 = findViewById(R.id.pecel);
        pindahHal8 = findViewById(R.id.nasgor);

        pindahHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tshrsit_1.this, ayam_goreng.class);
                startActivity(i);
            }
        });
        pindahHal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tshrsit_1.this, Baju1.class);
                startActivity(i);
            }
        });
        pindahHal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tshrsit_1.this, ayam_geprek.class);
                startActivity(i);
            }
        });
        pindahHal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tshrsit_1.this, bebek_goreng.class);
                startActivity(i);
            }
        });
        pindahHal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tshrsit_1.this, Baju2.class);
                startActivity(i);
            }
        });
        pindahHal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tshrsit_1.this, pecel.class);
                startActivity(i);
            }
        });
        pindahHal8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tshrsit_1.this, nasi_goreng.class);
                startActivity(i);
            }
        });


    }
    public void openActivity4(View view) {
        Intent intent = new Intent(this, Tshrsit_1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
