package com.example.anekakuliner;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterKuliner extends ArrayAdapter {
    String namamakanan[];
    String ket_makanan[];
    String hrg_makanan[];
    String hrgmakanan[];
    int gambar_makanan[];

    Activity activity;

    public AdapterKuliner(MainActivity activity, String[] nama_makanan, int[] gambar_makanan, String[] ket_makanan, String[] hrgmakanan, String[] hrg_makanan){
        super(activity,R.layout.activity_list_item,nama_makanan);
        this.namamakanan = nama_makanan;
        this.ket_makanan = ket_makanan;
        this.hrg_makanan = hrgmakanan;
        this.hrgmakanan = hrg_makanan;
        this.gambar_makanan = gambar_makanan;
        this.activity = activity;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=activity.getLayoutInflater();
        View v=inflater.inflate(R.layout.activity_list_item,null);

        ImageView gambare;
        TextView nama_makanan;
        TextView hrgmakanan;

        gambare=v.findViewById(R.id.gambar_makanan);
        nama_makanan=v.findViewById(R.id.nama_makanan);
        hrgmakanan=v.findViewById(R.id.harga_makanan);

        gambare.setImageResource(gambar_makanan[position]);
        nama_makanan.setText(namamakanan[position]);
        hrgmakanan.setText(hrg_makanan[position]);

        return v;
    }
}
