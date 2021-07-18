package com.example.seleraku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Hoodie_3 extends AppCompatActivity {

    LinearLayout pindahHal2;
    LinearLayout pindahHal3;
    LinearLayout pindahHal4;
    LinearLayout pindahHal5;
    LinearLayout pindahHal6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoodie_3);

        pindahHal2 = findViewById(R.id.nasi);
        pindahHal3 = findViewById(R.id.tem);
        pindahHal4 = findViewById(R.id.tahu);
        pindahHal5 = findViewById(R.id.lor);
        pindahHal6 = findViewById(R.id.kru);

        pindahHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hoodie_3.this, nasi.class);
                startActivity(i);
            }
        });
        pindahHal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hoodie_3.this, tempe.class);
                startActivity(i);
            }
        });
        pindahHal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hoodie_3.this, tahu.class);
                startActivity(i);
            }
        });
        pindahHal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hoodie_3.this, telur.class);
                startActivity(i);
            }
        });
        pindahHal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hoodie_3.this, krupuk.class);
                startActivity(i);
            }
        });
    }
    public void openActivity5(View view) {
        Intent intent = new Intent(this, Hoodie_3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

}
