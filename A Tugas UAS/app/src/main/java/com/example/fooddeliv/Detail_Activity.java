package com.example.fooddeliv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Detail_Activity extends AppCompatActivity {

    Button btnPesan;

    ImageView gambarmkn_msk;
    TextView namamkn_masuk, ketmkn_masuk;
    TextView hargamkn_masuk;

    String nama_kunci = "namamkn";
    String keterangan_kunci = "keterangan";
    String harga_kunci = "harga";

    int gambarmkn;
    String namamakanan;
    String keteranganmkn;
    String hargamakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        gambarmkn_msk = findViewById(R.id.gambartrm);
        namamkn_masuk = findViewById(R.id.namamkn);
        ketmkn_masuk = findViewById(R.id.keteranganmkn);
        hargamkn_masuk =findViewById(R.id.hargamkn);

        Bundle bundle = getIntent().getExtras();
        gambarmkn = bundle.getInt(String.valueOf("gambarmakanan"));
        gambarmkn_msk.setImageResource(gambarmkn);

        namamakanan = bundle.getString("namamakanan");
        keteranganmkn = bundle.getString("keterangan");
        hargamakanan = bundle.getString("hargamakanan");

        namamkn_masuk.setText(namamakanan);
        ketmkn_masuk.setText(keteranganmkn);
        hargamkn_masuk.setText(hargamakanan);

        btnPesan = findViewById(R.id.btnpesan);

        btnPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Detail_Activity.this, "Item telah di pesan", Toast.LENGTH_LONG).show();
            }
        });

    }
}