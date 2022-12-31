package com.example.fooddeliv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Dashboard_Activity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        String namamkn[] = {"Mie Ayam", "Sate Ayam", "Sate Sapi", "Soto Ayam", "Mie Ayam"};
        String hargamkn[] = {"Rp.10.000", "Rp.15.000", "Rp.20.000", "Rp.12.000", "Rp.12.000"};
        int gambar_mkn[] = {R.drawable.mieayam, R.drawable.sateayam, R.drawable.satesapi, R.drawable.sotolamongan, R.drawable.mieayam};
        String keterangan[] = {"Mie Ayam dengan topping ayam asli",
                                "Sate Ayam dengan daging ayam di bakar",
                                "Sate Sapi dengan daging asli yang di bakar",
                                "Soto Ayam dengan kuah soto", "Mie Ayam"};

        listView = findViewById(R.id.listMakanan);
        AdapaterItem adapaterItem = new AdapaterItem(this, namamkn,  gambar_mkn,  keterangan, hargamkn);
        listView.setAdapter(adapaterItem);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String nama_makanan_minuman = namamkn[position].toString();
                int gambar_makanan_minuman = gambar_mkn[position];
                String keterangan_mkn_mnm = keterangan[position].toString();
                String harga_makanan_minuman = hargamkn[position].toString();

                Intent intent = new Intent(Dashboard_Activity.this, Detail_Activity.class);
                intent.putExtra("namamakanan", nama_makanan_minuman);
                intent.putExtra("gambarmakanan", gambar_makanan_minuman);
                intent.putExtra("keterangan", keterangan_mkn_mnm);
                intent.putExtra("hargamakanan", harga_makanan_minuman);
                startActivity(intent);
            }
        });

    }
}