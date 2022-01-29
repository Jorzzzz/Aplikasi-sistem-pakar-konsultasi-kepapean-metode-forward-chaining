package com.example.konsultasikepapean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class konsultasi extends AppCompatActivity {
private Button anak,perempuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konsultasi);
        anak = findViewById(R.id.anak);
        anak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(konsultasi.this,konsultasi_anak.class);
                startActivity(i);
            }
        });
        perempuan = findViewById(R.id.perempuan);
        perempuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent y = new Intent(konsultasi.this,konsultasi_perempuan.class);
                startActivity(y);
            }
        });
    }
}