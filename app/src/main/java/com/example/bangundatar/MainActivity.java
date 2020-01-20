package com.example.bangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnPersegiPanjang, btnJajaranGenjang, btnTrapesium, btnPersegi,
            btnBelahKetupat, btnLingkaran, btnLayangLayang, btnSegitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPersegiPanjang = findViewById(R.id.btnPersegiPanjang);
        btnJajaranGenjang = findViewById(R.id.btnJajaranGenjang);
        btnTrapesium = findViewById(R.id.btnTrapesium);
        btnPersegi = findViewById(R.id.btnPersegi);
        btnBelahKetupat = findViewById(R.id.btnBelahKetupat);
        btnLingkaran = findViewById(R.id.btnLayangLayang);
        btnLayangLayang = findViewById(R.id.btnLayangLayang);
        btnSegitiga = findViewById(R.id.btnSegitiga);

        btnPersegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, JajaranGenjangActivity.class);
//                startActivity(intent);
            }
        });

        btnJajaranGenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JajaranGenjangActivity.class);
                startActivity(intent);
            }
        });

        btnTrapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Trapesium.class);
                startActivity(intent);
            }
        });

        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, JajaranGenjangActivity.class);
//                startActivity(intent);
            }
        });

        btnBelahKetupat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BelahKetupatActivity.class);
                startActivity(intent);
            }
        });

        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, JajaranGenjangActivity.class);
//                startActivity(intent);
            }
        });

        btnLayangLayang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, JajaranGenjangActivity.class);
//                startActivity(intent);
            }
        });

        btnJajaranGenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, JajaranGenjangActivity.class);
//                startActivity(intent);
            }
        });


        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Segitiga.class);
                startActivity(intent);
            }
        });

    }
}
