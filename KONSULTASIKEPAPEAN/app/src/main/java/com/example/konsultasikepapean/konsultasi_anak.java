package com.example.konsultasikepapean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class konsultasi_anak extends AppCompatActivity {
    CheckBox tidakpeduli,penghinaan,mengisolasi,penolakan,teror,
            pelempararan,pemukulan,mencekik,alatkelamin,pemerkosaan,videoporno,
            makanan,kesehatan,pakaian,rokok;
    Button btndiagnosa;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konsultasi_anak);
        tidakpeduli = findViewById(R.id.cx_tidak_peduli);
        penghinaan = findViewById(R.id.cx_penghinaan);
        mengisolasi = findViewById(R.id.cx_isolasi);
        penolakan = findViewById(R.id.cx_penolakan);
        teror = findViewById(R.id.cx_teror);
        rokok = findViewById(R.id.rokok);
        pelempararan = findViewById(R.id.pelemparan);
        pemukulan = findViewById(R.id.pemukulan);
        mencekik = findViewById(R.id.mencekik);
        alatkelamin = findViewById(R.id.alat_kelamin);
        pemerkosaan = findViewById(R.id.pemerkosaan);
        videoporno = findViewById(R.id.video_pornografi);
        makanan = findViewById(R.id.makanan);
        kesehatan = findViewById(R.id.kesehatan);
        pakaian = findViewById(R.id.pakaian);
        tvResult = findViewById(R.id.tv_result);
        btndiagnosa = findViewById(R.id.btn_diagnosa);
        btndiagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String petunjuk = "";
                if (kesehatan.isChecked() && makanan.isChecked() &&
                    pakaian.isChecked()){
                petunjuk += "-- PENELANTARAN  --\n\n" +
                        "Tindakan penelantaran anak bagaimanapun alasannya, UU No. 35 tahun 2014 tentang perlindungan anak, " +
                        "para pelaku penelantaran anak baik yang disengaja atau tidak disengaja sama-sama telah " +
                        "menafikan hak-hak yang dimiliki oleh anak tersebut.\n\nSanksi pidana atau hukuman bagi pelaku penelantaran " +
                        "anak menurut UU No. 35 tahun 2014 tentang perlindungan anak telah ditentukan pada pasal 77 ayat 2 yang diancam " +
                        "dengan ancaman 5 (lima) tahun penjara dan/atau denda paling banyak Rp. 100.000.000,00 (seratus juta rupiah), " +
                        "sebagai mana bunyi pasal tersebut: \n\n“Penelantaran terhadap anak yang mengakibatkan anak mengalami sakit atau penderitaan, " +
                        "baik fisik, mental maupun sosial, dipidana dengan pidana penjara paling lama 5 (lima) tahun atau/atau denda paling banyak Rp.100.000.000,00 " +
                        "(seratus juta rupiah)”.\n\n\n" +
                        "Nomor Pengaduan : +62 812-4060-2849";
                }
                if (videoporno.isChecked() && pemerkosaan.isChecked() &&
                    alatkelamin.isChecked()){
                petunjuk += "-- KEKERASAN SEKSUAL --\n\n" +
                        "Larangan kejahatan seksual berupa perbuatan cabul terhadap anak diatur dalam Pasal 76E " +
                        "Undang-Undang Nomor 35 tahun 2014 tentang Perubahan Atas Undang-Undang Nomor 23 tahun 2002 tentang Perlindungan Anak." +
                        "Dalam Pasal 76E tersebut dikatakan : \n\nSetiap Orang dilarang melakukan Kekerasan atau ancaman Kekerasan, memaksa, " +
                        "melakukan tipu muslihat, melakukan serangkaian kebohongan, atau membujuk Anak untuk melakukan atau membiarkan dilakukan perbuatan cabul " +
                        "Sanksi bagi pelaku kejahatan seksual berupa perbuatan cabul terhadap anak yang dilakukan di dalam sebuah Masjid, " +
                        "pelaku pencabulan terhadap anak dapat dikenakan sanksi berdasarkan Pasal 82 ayat (1) junto Pasal 76E Undang-Undang " +
                        "Nomor 35 tahun 2014 tentang Perubahan Atas Undang-Undang Nomor 23 tahun 2002 tentang Perlindungan Anak. \n\nDengan sanksi " +
                        "pidana berupa pidana penjara paling singkat 5 (lima) tahun dan paling lama 15 (lima belas) tahun, dan denda paling " +
                        "banyak Rp. 5.000.000.000,- (lima miliar rupiah).\n\n\n" +
                        "Nomor Pengaduan : +62 812-4060-2849";
                }
                if (tidakpeduli.isChecked() && penghinaan.isChecked() &&
                        mengisolasi.isChecked() && penolakan.isChecked() &&
                        teror.isChecked()){
                petunjuk += "-- KEKERASAN PSIKIS --\n\n" +
                        "Larangan kekerasan psikis terhadap anak terdapat dalam UU 23 tahun 2004 tentang penghapusan KDRT terdapat dalam BAB III pasal 7 yang berbunyi : \n\n" +
                        "Kekerasan psikis sebagaimana dimaksud dalam Pasal 5 huruf b adalah perbuatan yang mengakibatkan ketakutan, hilangnya rasa percaya diri, hilangnya kemampuan untuk bertindak, rasa tidak berdaya, dan/atau penderitaan psikis berat pada seseorang.\n\n" +
                        "Korban mempunyai hak untuk mendapatkan : \n\n" +
                        "1. Perlindungan dari pihak keluarga, kepolisian, kejaksaan, pengadilan, advokat, lembaga sosial, atau pihak lainnya baik sementara maupun berdasarkan penetapan perintah perlindungan dari pengadilan;\n" +
                        "2. Pelayanan kesehatan sesuai dengan kebutuhan medis;\n" +
                        "3. Penanganan secara khusus berkaitan dengan kerahasiaan korban;\n" +
                        "4. Pendampingan oleh pekerja sosial dan bantuan hukum pada setiap tingkat proses pemeriksaan sesuai dengan ketentuan peraturan perundang-undangan; dan\n" +
                        "5. Pelayanan bimbingan rohani.\n\n" +
                        "Nomor Pengaduan : +62 812-4060-2849";
                }
                if (pelempararan.isChecked() && pemukulan.isChecked() &&
                        mencekik.isChecked()){
                petunjuk += "-- KEKERASAN FISIK --\n\n" +
                        "Larangan Kekerasan fisik terhadap anak menjerat pelaku penganiayaan anak di atur khusus dalam pasal 76C UU 35 tahun 2014 yang berbunyi: \n" +
                        "'Setiap Orang dilarang menempatkan, membiarkan, melakukan, menyuruh melakukan, atau turut serta melakukan kekerasan terhadap anak.'\n\n" +
                        "Sementara, sanksi pidana bagi orang atau pelaku kekerasan/penganiayaan yang melanggar pasal di atas ditentukkan dalam Pasal 80 UU 35 tahun 2014 Sebagai berikut : \n\n" +
                        "(1) Setiap Orang yang melanggar ketentuan sebagaimana dimaksud dalam Pasal 76C, dipidana dengan pidana penjara paling lama 3 (tiga) tahun 6 (enam) bulan dan/atau denda paling banyak Rp72 juta\n\n" +
                        "(2) Dalam hal anak sebagaimana dimaksud pada ayat (1), luka berat, maka pelaku dipidana dengan pidana penjara paling lama 5 (lima) tahun dan/atau denda paling banyak Rp100 juta.\n\n" +
                        "(3) Dalam hal Anak sebagaimana dimaksud pada ayat (2) mati, maka pelaku dipidana dengan pidana penjara paling lama 15 (lima belas) tahun dan/atau denda paling banyak Rp3 miliar.\n\n" +
                        "(4) Pidana ditambah sepertiga dari ketentuan sebagaimana dimaksud pada ayat (1), ayat (2), dan ayat apabila yang melakukan penganiayaan tersebut orang tuanya.\n\n" +
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
            case R.id.cx_tidak_peduli:
            str = checked ? "Tidak Peduli Diseleksi" :
                    "Tidak Peduli Tidak Diseleksi";
            break;
        }
        switch (view.getId()){
            case R.id.cx_penghinaan:
                str = checked ? "Penghinaan Diseleksi" :
                        "Penghinaan Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.cx_isolasi:
                str = checked ? "Isolasi Diseleksi" :
                        "Isolasi Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.cx_penolakan:
                str = checked ? "Penolakan Diseleksi" :
                        "Penolakan Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.cx_teror:
                str = checked ? "Teror Diseleksi" :
                        "Teror Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.pelemparan:
                str = checked ? "Pelemparan Diseleksi" :
                        "Pelemparan Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.pemukulan:
                str = checked ? "Pemukulan Diseleksi" :
                        "Pemukulan Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.mencekik:
                str = checked ? "Mencekik Diseleksi" :
                        "Mencekik Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.alat_kelamin:
                str = checked ? "Perlihatkan Alat Kelamin Diseleksi" :
                        "Perlihatkan Alat Kelamin Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.pemerkosaan:
                str = checked ? "Pemerkosaan Diseleksi" :
                        "Pemerkosaan Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.video_pornografi:
                str = checked ? "Dipertontonkan Video Pornografi Diseleksi" :
                        "Dipertontonkan Video Pornografi Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.makanan:
                str = checked ? "Tidak Menyediakan Makanan Diseleksi" :
                        "Tidak Menyediakan Makanan Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.kesehatan:
                str = checked ? "Kesehatan Tidak Di Perhatikan Diseleksi" :
                        "Kesehatan Tidak Di PerhatikanTidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.pakaian:
                str = checked ? "Tidak Menyediakan Pakaian Diseleksi" :
                        "Tidak Menyediakan Pakaian Tidak Diseleksi";
                break;
        }
        switch (view.getId()){
            case R.id.rokok:
                str = checked ? "Menyudut Rokok Diseleksi" :
                        "Menyudut Rokok Tidak Diseleksi";
                break;
        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();

    }
}