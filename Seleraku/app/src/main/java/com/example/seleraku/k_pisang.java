package com.example.seleraku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class k_pisang extends AppCompatActivity {
    LinearLayout pindahHal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_pisang);

        pindahHal2 = findViewById(R.id.pis1);

        pindahHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(k_pisang.this, Shop.class);
                startActivity(i);
            }
        });
    }
    public void openActivity1(View view) {
        Intent intent = new Intent(this, k_pisang.class);
        startActivity(intent);
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}