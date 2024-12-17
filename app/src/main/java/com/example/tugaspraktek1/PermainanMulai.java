package com.example.tugaspraktek1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PermainanMulai extends AppCompatActivity {
    ImageView iv_semangka;
    ImageView iv_stroberi;
    ImageView iv_alpukat;
    ImageView iv_apel;
    ImageView iv_nanas;
    ImageView iv_buahnaga;
    Button btn_kembali2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permainan_mulai);

        iv_semangka = findViewById(R.id.iv_semangka);
        iv_stroberi = findViewById(R.id.iv_stroberi);
        iv_alpukat = findViewById(R.id.iv_alpukat);
        iv_apel = findViewById(R.id.iv_apel);
        iv_nanas = findViewById(R.id.iv_nanas);
        iv_buahnaga = findViewById(R.id.iv_buahnaga);
        btn_kembali2 = findViewById(R.id.btn_kembali2);

        btn_kembali2.setOnClickListener(this::kembaliMenu);
        klikGambar();
    }
    private boolean kembaliMenu(View view){
        startActivity(new Intent(this, MainActivity.class));
        return true;
    }
    private void startTebakActivity(String iconName){
        Intent i = new Intent(this, TebakActivity.class);
        i.putExtra("iconName", iconName);
        startActivity(i);
    }
    private void klikGambar(){
        iv_semangka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startTebakActivity("semangka");
            }
        });
        iv_stroberi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startTebakActivity("stroberi");

            }
        });
        iv_alpukat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTebakActivity("alpukat");

            }
        });
        iv_apel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTebakActivity("apel");

            }
        });
        iv_nanas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTebakActivity("nanas");

            }
        });
        iv_buahnaga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTebakActivity("buahnaga");

            }
        });
    }
}