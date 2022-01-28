package com.example.konsultasikepapean;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class konsultasi_perempuan extends AppCompatActivity {
    CheckBox    mengancam,menendang,menghina,meninggalkan,mencekik,
                mengisolasi,mendorong,mencengkramdengankeras,
                memaksamelakukanhubunganseksualdibawahancaman,
                memanggildengansebutanyangmempermalukan,
                menjelekjelekan,meraba,mencium,
                tidakmembiayaikebutuhandasar,
                pergiberhariharitanpakabar;
    Button btndiagnosa;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konsultasi_perempuan);
        mengancam = findViewById(R.id.mengancam);
        menendang = findViewById(R.id.menendang);
        menghina = findViewById(R.id.menghina);
        meninggalkan = findViewById(R.id.meninggalkan);
        mencekik = findViewById(R.id.mencekik);
        mengisolasi = findViewById(R.id.cx_isolasi);
        mendorong = findViewById(R.id.mendorong);
        mencengkramdengankeras = findViewById(R.id.mencengkram_dengan_keras);
        memaksamelakukanhubunganseksualdibawahancaman = findViewById(R.id.memaksa_melalukan_hubungan_seksual_dibawah_ancaman);
        memanggildengansebutanyangmempermalukan = findViewById(R.id.memanggil_dengan_sebutan_yang_mempermalukan);
        menjelekjelekan = findViewById(R.id.menjelek_jelekan);
        meraba = findViewById(R.id.meraba);
        mencium = findViewById(R.id.mencium);
        tidakmembiayaikebutuhandasar = findViewById(R.id.tidak_membiayai_kebutuhan_dasar);
        pergiberhariharitanpakabar = findViewById(R.id.pergi_berhari_hari_tanpa_kabar);
        tvResult = findViewById(R.id.tv_result);
        btndiagnosa = findViewById(R.id.btn_diagnosa);
        btndiagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String petunjuk = "";
                if (mengancam.isChecked() && menghina.isChecked() && mengisolasi.isChecked() &&
                menjelekjelekan.isChecked() && memanggildengansebutanyangmempermalukan.isChecked()){
                    petunjuk += "-- KEKERASAN PSIKIS --\n\n" +
                            "Larangan kekerasan psikis terhadap perempuan diatur dalam pasal 45 UU PKDRT Dalam Pasal 45 tersebut dikatakan :\n\n" +
                            "(1) Setiap orang yang melakukan perbuatan kekerasan psikis dalam lingkup rumah tangga sebagaimana dimaksud dalam Pasal 5 " +
                            "huruf b dipidana dengan pidana penjara paling lama 3 (tiga) tahun atau denda paling banyak Rp 9.000.000,00 (sembilan juta rupiah).\n\n" +
                            "(2) Dalam hal perbuatan sebagaimana dimaksud pada ayat (1) dilakukan oleh suami terhadap isteri atau sebaliknya yang " +
                            "tidak menimbulkan penyakit atau halangan untuk menjalankan pekerjaan jabatan atau mata pencaharian atau kegiatan sehari-hari, " +
                            "dipidana dengan pidana penjara paling lama 4 (empat) bulan atau denda paling banyak Rp 3.000.000,00 (tiga juta rupiah).\n\n" +
                            "Nomor Pengaduan : +62 812-4060-2849";
                }
                if (meraba.isChecked() && mencium.isChecked() && memaksamelakukanhubunganseksualdibawahancaman.isChecked()){
                    petunjuk +=  "-- KEKERASAN SEKSUAL --\n\n" +
                            "Larangan kekerasan seksual terhadap perempuan (pencabulan) diatur dalam pasal 289 KUHP sebagai berikut :\n\n" +
                            "Barang siapa dengan kekerasan atau ancaman kekerasan memaksa seorang untuk melakukan atau membiarkan dilakukan perbuatan cabul, diancam karena melakukan perbuatan yang menyerang kehormatan kesusilaan, dengan pidana penjara paling lama sembilan tahun.\n\n" +
                            "Larangan kekerasan seksual terhadap perempuan (perkosaan) diatur dalam pasal 285 KUHP sebagai berikut :\n\n" +
                            "Barang siapa dengan kekerasan atau ancaman kekerasan memaksa seorang wanita bersetubuh dengan dia di luar perkawinan, diancam karena melakukan perkosaan dengan pidana penjara paling lama dua belas tahun.\n\n" +
                            "Nomor Pengaduan : +62 812-4060-2849";
                }
                if (mencekik.isChecked() && mendorong.isChecked() && menendang.isChecked() &&
                     mencengkramdengankeras.isChecked()){
                    petunjuk += "-- KEKERASAN FISIK --\n\n" +
                            "Sanksi pidana untuk tindak pidana kekerasan fisik diatur dalam Pasal 44 UU PKDRT dikatakan :\n\n" +
                            "(1) Setiap orang yang melakukan perbuatan kekerasan fisik dalam lingkup rumah tangga sebagaimana dimaksud dalam Pasal 5 huruf " +
                            "a dipidana dengan pidana penjara paling lama 5 (lima) tahun atau denda paling banyak Rp 15.000.000,00 (lima belas juta rupiah)\n\n" +
                            "(2) Dalam hal perbuatan sebagaimana dimaksud pada ayat (1) mengakibatkan korban mendapat jatuh sakit atau luka berat, dipidana " +
                            "dengan pidana penjara paling lama 10 (sepuluh) tahun atau denda paling banyak Rp 30.000.000,00 (tiga puluh juta rupiah).\n\n" +
                            "(3) Dalam hal perbuatan sebagaimana dimaksud pada ayat (2) mengakibatkan matinya korban, dipidana dengan pidana penjara paling " +
                            "lama 15 (lima belas) tahun atau denda paling banyak Rp 45.000.000,00 (empat puluh lima juta rupiah).\n\n" +
                            "Nomor Pengaduan : +62 812-4060-2849" ;
                }
                if (tidakmembiayaikebutuhandasar.isChecked() && pergiberhariharitanpakabar.isChecked() &&
                    meninggalkan.isChecked()){
                    petunjuk += "-- PENELANTARAN --\n\n" +
                            "Larangan penelantaran terhadap Perempuan diatur dalam pasal 49 huruf a UU PKDRT (Penghapusan Kekerasan Dalam Rumah Tangga) dikatakan : \n\n, " +
                            "Setiap orang yang melakukkan penelantaran rumah tangga dapat dipidana penjara paling lama 3(tiga) tahun atau denda paling banyak" +
                            "Rp.15.000.000 (lima belas juta).\n\n" +
                                    "Nomor Pengaduan : +62 812-4060-2849";
                }
                tvResult.setText(""+petunjuk);
            }
        });
    }
    public void onClickChecked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        String str = "";

        switch (view.getId()){
            case R.id.mengancam:
                str = checked ? "Mengancam Diseleksi" :
                        "Mengancam Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.menendang:
                str = checked ? "Menendang Diseleksi" :
                        "Menendang Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.menghina:
                str = checked ? "Menghina Diseleksi" :
                        "Menghina Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.meninggalkan:
                str = checked ? "Meninggalkan Diseleksi" :
                        "Meninggalkan Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.mencekik:
                str = checked ? "Mencekik Diseleksi" :
                        "Mencekik Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.cx_isolasi:
                str = checked ? "Mengisolasi Diseleksi" :
                        "Mengisolasi Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.mendorong:
                str = checked ? "Mendorong Diseleksi" :
                        "Mendorong Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.mencengkram_dengan_keras:
                str = checked ? "Mencengkram Dengan Keras Diseleksi" :
                        "Mencengkram Dengan Keras Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.memaksa_melalukan_hubungan_seksual_dibawah_ancaman:
                str = checked ? "Memaksa Melakukan Hubungan Seksual Di Bawah Ancaman Diseleksi" :
                        "Memaksa Melakukan Hubungan Seksual Di Bawah Ancaman Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.memanggil_dengan_sebutan_yang_mempermalukan:
                str = checked ? "Memanggil Dengan Sebutan Yang Mempermalukan Diseleksi" :
                        "Memanggil Dengan Sebutan Yang Mempermalukan Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.menjelek_jelekan:
                str = checked ? "Menjelek-jelekan Diseleksi" :
                        "Menjelek-jelekan Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.meraba:
                str = checked ? "Meraba Diseleksi" :
                        "Meraba Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.tidak_membiayai_kebutuhan_dasar:
                str = checked ? "Tidak Membiayai Kebutuhan Dasar Diseleksi" :
                        "Tidak Membiayai Kebutuhan Dasar Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.pergi_berhari_hari_tanpa_kabar:
                str = checked ? "Pergi Berhari-hari Tanpa Kabar Diseleksi" :
                        "Pergi Berhari-hari Tanpa Kabar Tidak Diseleksi";
                break;
        }
    }
}