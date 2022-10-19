package com.example.mybiodata;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class AdapterBiodata extends ArrayAdapter {
    String Nama[];
    String NIM[];
    String Hobi[];
    String Deskripsi[];
    int Gambar[];

    Activity activity;

    public AdapterBiodata(MainActivity activity, String[] NIM, String[] Nama, int[] Gambar,String[] Hobi, String[] Deskripsi){
        super(activity, R.layout.activity_main, NIM);
        this.NIM=NIM;
        this.Nama=Nama;
        this.Hobi=Hobi;
        this.Deskripsi=Deskripsi;
        this.Gambar=Gambar;
        this.activity=activity;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = activity.getLayoutInflater();
        View v=inflater.inflate(R.layout.activity_main,null);

        ImageView Gambare;
        TextView NIMe, Namae, Hobie, Deskripsie;

        Gambare=v.findViewById(R.id.nm_foto);
        NIMe=v.findViewById(R.id.nm_Nim);
        Namae=v.findViewById(R.id.nm_Nama);
        Hobie=v.findViewById(R.id.Hobi);
        Deskripsie=v.findViewById(R.id.txtDesc);

        Gambare.setImageResource(Gambar[position]);
        NIMe.setText(NIM[position]);
        Namae.setText(Nama[position]);
        Hobie.setText(Hobi[position]);
        Deskripsie.setText(Deskripsi[position]);

        return v;

    }
}
