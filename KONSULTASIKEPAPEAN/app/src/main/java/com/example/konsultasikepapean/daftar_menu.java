package com.example.konsultasikepapean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class daftar_menu extends AppCompatActivity {
private Button konsultasi,petujuk,tentang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        konsultasi = (Button) findViewById(R.id.konsultasi);
        konsultasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (daftar_menu.this,konsultasi.class);
                startActivity(i);
            }
        });
        petujuk = (Button) findViewById(R.id.petunjuk);
        petujuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent y = new Intent(daftar_menu.this,petunjuk.class);
                startActivity(y);
            }
        });
        tentang = (Button) findViewById(R.id.tentang);
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z = new Intent (daftar_menu.this,tentang.class);
                startActivity(z);
            }
        });
    }
}
