package com.example.anekakuliner;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetilKuliner extends AppCompatActivity {
    ImageView gambarmakanan_masuk;
    TextView nama_makanan_masuk,ket_makanan_masuk;//,harga_makanan_masuk;
    TextView hrg_makanan_masuk;

    String nm_kunci="namamakanan";
    String ket_kunci="keter";
    String hrg_kunci="harga";
    //String hr_kunci="harga";
    int gambarmakanan;

    String namamakanane;
    String ketmakanane;
    //String hargamakanane;
    String hrgmakanane;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_detail_kuliner);
        gambarmakanan_masuk=findViewById(R.id.gambarterima);
        nama_makanan_masuk=findViewById(R.id.nmmakanan);
        ket_makanan_masuk=findViewById(R.id.ketmakanan);
        //harga_makanan_masuk=findViewById(R.id.nmharga);
        hrg_makanan_masuk = findViewById(R.id.hrgmakanan);

        Bundle bundle=getIntent().getExtras();
        gambarmakanan=bundle.getInt(String.valueOf("gambarmakanan"));
        gambarmakanan_masuk.setImageResource(gambarmakanan);

        namamakanane=bundle.getString("namamakanan");
        ketmakanane=bundle.getString("keter");
        //hargamakanane=bundle.getString("harga");
        hrgmakanane= bundle.getString("ketera");

        nama_makanan_masuk.setText(namamakanane);
        ket_makanan_masuk.setText(ketmakanane);
        //harga_makanan_masuk.setText(hargamakanane);
        hrg_makanan_masuk.setText(hrgmakanane);
    }
}
