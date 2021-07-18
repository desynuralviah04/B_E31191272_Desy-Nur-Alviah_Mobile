package com.example.seleraku;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    LinearLayout pindahHal2;
    LinearLayout pindahHal4;
    LinearLayout pindahHal5;
    ViewFlipper  pindahHal6;
    LinearLayout pindahHal8;
    LinearLayout pindahHal9;
    LinearLayout pindahHal10;
    LinearLayout pindahHal11;
    LinearLayout pindahHal12;
    LinearLayout pindahHal13;
    LinearLayout pindahHal14;
    LinearLayout pindahHal15;
    LinearLayout pindahHal16;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int images[] ={R.drawable.gbr3, R.drawable.gbr2, R.drawable.gbr1};

        pindahHal6 = findViewById(R.id.tampilan);

        //for loop
        /*for (int i = 0; i < images.length; i++){
            pindahHal6(images[i]);
        }*/
        //but  i
        for (int image: images){
            setPindahHal6Images(image);
        }

        //for loop
        /*for (int i = 0; i < images.length; i++){
            pindahHal6(images[i]);
        }*/
        //but  i
        for (int image: images){
            setPindahHal6Images(image);
        }

        pindahHal2 = findViewById(R.id.katagori);
        pindahHal4 = findViewById(R.id.promo);
        pindahHal5 = findViewById(R.id.menaksir);
        pindahHal9 = findViewById(R.id.masuk1);
        pindahHal10 = findViewById(R.id.tap2);
        pindahHal11 = findViewById(R.id.tap3);
        pindahHal12 = findViewById(R.id.cap);
        pindahHal13 = findViewById(R.id.ceplok);
        pindahHal14 = findViewById(R.id.kripik);
        pindahHal15 = findViewById(R.id.bu);
        pindahHal16 = findViewById(R.id.gor);

        pindahHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, katagori_page2Activity.class);
                startActivity(i);
            }
        });

        pindahHal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, promo_page4Activity.class);
                startActivity(i);
            }
        });

        pindahHal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, menaksir_page5Activity.class);
                startActivity(i);
            }
        });

        pindahHal9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Baju1.class);
                startActivity(i);
            }
        });
        pindahHal10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Baju2.class);
                startActivity(i);
            }
        });
        pindahHal11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, baju3.class);
                startActivity(i);
            }
        });
        pindahHal12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, cappucino.class);
                startActivity(i);
            }
        });
        pindahHal13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, telur.class);
                startActivity(i);
            }
        });
        pindahHal14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, k_tahu.class);
                startActivity(i);
            }
        });
        pindahHal15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, jambu.class);
                startActivity(i);
            }
        });
        pindahHal16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ayam_geprek.class);
                startActivity(i);
            }
        });


        //initialize And Assign Variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.BottomNavigation);

        //set Home Selected
        bottomNavigationView.setSelectedItemId(R.id.home);

        //Perfrom itemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.shop:
                        startActivity(new Intent(getApplicationContext()
                                ,Shop.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:
                        return true;
                    case R.id.News:
                        startActivity(new Intent(getApplicationContext()
                                ,News.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.more:
                        startActivity(new Intent(getApplicationContext()
                                ,More.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
    public void setPindahHal6Images(int images){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(images);
        pindahHal6.addView(imageView);
        pindahHal6.setFlipInterval(4000); //4 sec
        pindahHal6.setAutoStart(true);
    }

    public void openActivity2(View view) {
        Intent intent = new Intent(this, katagori_page2Activity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
    public void openActivity4(View view) {
        Intent intent = new Intent(this, promo_page4Activity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
    public void openActivity5(View view) {
        Intent intent = new Intent(this, menaksir_page5Activity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

}