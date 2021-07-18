package com.example.seleraku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class pecel extends AppCompatActivity {

    LinearLayout pindahHal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pecel);

        pindahHal2 = findViewById(R.id.pecel1);

        pindahHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(pecel.this, Shop.class);
                startActivity(i);
            }
        });
    }
    public void openActivity1(View view) {
        Intent intent = new Intent(this, pecel.class);
        startActivity(intent);
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}