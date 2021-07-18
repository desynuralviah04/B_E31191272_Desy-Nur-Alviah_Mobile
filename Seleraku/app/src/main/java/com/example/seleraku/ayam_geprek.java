package com.example.seleraku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ayam_geprek extends AppCompatActivity {

    LinearLayout pindahHal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayam_geprek);

        pindahHal2 = findViewById(R.id.ayprek1);

        pindahHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ayam_geprek.this, Shop.class);
                startActivity(i);
            }
        });
    }
    public void openActivity1(View view) {
        Intent intent = new Intent(this, ayam_geprek.class);
        startActivity(intent);
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}