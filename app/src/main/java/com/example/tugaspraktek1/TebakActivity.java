package com.example.tugaspraktek1;

import static com.example.tugaspraktek1.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Objects;

public class TebakActivity extends AppCompatActivity {
    Button btn_back;
    Button btn_cek;
    EditText txt_jawab;
    ImageView iv_tebak;
    private String jawaban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_tebak);

        btn_back = findViewById(R.id.btn_back);
        btn_cek = findViewById(R.id.btn_cek);
        txt_jawab = findViewById(R.id.txt_jawab);
        iv_tebak = findViewById(R.id.iv_tebak);

        btn_back.setOnClickListener(this::kembaliMenu);
        cekIntentGambar();
        cek_jawaban();

    }

    private void kembaliMenu(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }


    private void cekIntentGambar() {
        Intent cek = getIntent();
        String iconName = cek.getStringExtra("iconName");
        int drawableResource = 0;
        switch (iconName.toLowerCase()) {
            case "semangka":
                drawableResource = drawable.semangka2;
                jawaban = "semangka";
                break;
            case "stroberi":
                drawableResource = drawable.stroberi2;
                jawaban = "stroberi";
                break;
            case "alpukat":
                drawableResource = drawable.alpukat4;
                jawaban = "alpukat";
                break;
            case "apel":
                drawableResource = drawable.apel3;
                jawaban = "apel";
                break;
            case "nanas":
                drawableResource = drawable.nanas2;
                jawaban = "nanas";
                break;
            default:
                drawableResource = drawable.buahnaga4;
                jawaban = "buah naga";
        }
        iv_tebak.setImageResource(drawableResource);
    }

    private void cek_jawaban() {
        btn_cek.setOnClickListener(View ->{
            String jawaban = txt_jawab.getText().toString();
            if (jawaban.equalsIgnoreCase(TebakActivity.this.jawaban)) {
                Toast.makeText(TebakActivity.this, "Jawaban Benar", Toast.LENGTH_LONG)
                        .show();
            } else {
                Toast.makeText(TebakActivity.this, "Jawaban Salah", Toast.LENGTH_LONG)
                        .show();
            }
            {

            }
        });
    }
}
