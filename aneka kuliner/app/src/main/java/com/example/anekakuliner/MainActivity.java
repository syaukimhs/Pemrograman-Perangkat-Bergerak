package com.example.anekakuliner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String nama_makanan[]={"Rendang","Ayam Penyet","Ayam Katsu","Ayam Geprek Keju","Soto Lamongan","Sate Ayam","Sate Sapi","Mie Ayam"};

        String harga_makanan[]={"Rp.10.000","Rp.10.000","Rp.13.000","Rp.15.000","Rp.10.000","Rp.15.000","Rp.20.000","Rp.10.000"};

        int gambar_makanan[]={R.drawable.lapis, R.drawable.ayampenyet, R.drawable.ayamkatsu, R.drawable.ayamgeprekkeju, R.drawable.sotolamongan, R.drawable.sateayam,
                            R.drawable.satesapi, R.drawable.mieayam};

        String keterangan[]={"Rendang masakan khas padang yang tiada tandingannya",
                "Ayam Penyet yang terdiri dari ayam yang dipenyet dengan sambal + lalapan sayur mentah",
                "Ayam katsu makanan yang identik dengan negara jepang dengan kenikmatan tiada tandingannya",
                "Ayam geprek yang di kasih topping keju di atasnya",
                "Soto Lamongan makanan asli lamongan jawa timur yang memiliki cita rasa yang segar ketika dimakan",
                "Sate Ayam selalu nikmat ketika di santap dengan nasi",
                "Sate Sapi selalu nikmat ketika di santap dengan nasi",
                "Mie Ayam dengan topping ayam dan pangsit yang melimpah"};

        String harga[]={"Rp.15.000","Rp.10.000", "Rp.13.000","Rp15.000","Rp.10.000","Rp.15.000","Rp.20.000","Rp.10.000"};


    listView=findViewById(R.id.listkuliner);
    AdapterKuliner adapterKuliner=new AdapterKuliner(this, nama_makanan, gambar_makanan, keterangan, harga_makanan, harga);
    listView.setAdapter(adapterKuliner);
    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            String nm_makanan=nama_makanan[position].toString();
            String hrg_makanan=harga_makanan[position].toString();
            int gbr_makanan=gambar_makanan[position];
            String ket=keterangan[position].toString();
            String hrg=harga[position].toString();

            Intent intent=new Intent(MainActivity.this, DetilKuliner.class);
            intent.putExtra("namamakanan", nm_makanan);
            intent.putExtra("gambarmakanan", gbr_makanan);
            intent.putExtra("keter", ket);
            intent.putExtra("hargamakanan", hrg_makanan);
            intent.putExtra("ketera", hrg);
            startActivity(intent);
        }
    });

    }
}