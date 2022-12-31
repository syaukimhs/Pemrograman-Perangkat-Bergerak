package com.example.fooddeliv;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AdapaterItem extends ArrayAdapter {

    String namaMakanan[];
    String keteranganMkn[];
    String hargaMakanan[];
    int gambarMakanan[];

    Activity activity;

    public AdapaterItem(Dashboard_Activity activity, String[] nama_mkn, int[] gambar_mkn, String[] keterangan_mkn, String[] harga_mkn){
        super(activity, R.layout.activity_item, nama_mkn);
        this.namaMakanan = nama_mkn;
        this.keteranganMkn = keterangan_mkn;
        this.hargaMakanan = harga_mkn;
        this.gambarMakanan = gambar_mkn;
        this.activity = activity;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View v = inflater.inflate(R.layout.activity_item, null);

        ImageView gambar;
        TextView nama_makanan;
        //TextView harga_makanan;

        gambar = v.findViewById(R.id.gbr_makan);
        nama_makanan =v.findViewById(R.id.nm_makan);

        gambar.setImageResource(gambarMakanan[position]);
        nama_makanan.setText(namaMakanan[position]);

        return v;
    }
}
