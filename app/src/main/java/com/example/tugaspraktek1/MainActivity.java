package com.example.tugaspraktek1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tugaspraktek1.PermainanMulai;
import com.example.tugaspraktek1.R;

public class MainActivity extends AppCompatActivity {
    TextView tv_name;
    Button btn_masuk, btn_keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_masuk = findViewById(R.id.btn_masuk);
        btn_keluar = findViewById(R.id.btn_keluar);

        btn_masuk.setOnClickListener(this::mulaiPermainan);
        btn_keluar.setOnClickListener(this::keluarPermainan);
    }
    private boolean mulaiPermainan(View view){
        startActivity(new Intent(this, PermainanMulai.class));
        return true;
    }
    private  void keluarPermainan(View view){
        new AlertDialog.Builder(this)
                .setTitle("Konfirmasi Pilihan")
                .setTitle("Apakah Anda Yakin Ingin Keluar")
                .setNegativeButton("Tidak", null)
                .setPositiveButton("Ya", (dialogInterface, i) -> finish()).show();

    }
}