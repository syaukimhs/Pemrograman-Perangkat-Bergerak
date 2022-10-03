package com.example.kalkulatirbdngdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class pertamaFragment extends Fragment {
    private Button btnHasil;
    private EditText txt_panjang, txt_lebar;
    private TextView hasil, kl;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_pertama, container, false);
        btnHasil = v.findViewById(R.id.btnHasil);
        txt_panjang = v.findViewById(R.id.txt_panjang);
        txt_lebar = v.findViewById(R.id.txt_lebar);
        hasil = v.findViewById(R.id.hasil);
        kl = v.findViewById(R.id.klng);


        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String nilai1 = txt_panjang.getText().toString();
                String nilai2 = txt_lebar.getText().toString();

                if(nilai1.isEmpty()){
                    txt_panjang.setError("Data tidak boleh kosong");
                    txt_panjang.requestFocus();
                }else if(nilai2.isEmpty()){
                    txt_lebar.setError("Data tidak boleh kosong");
                    txt_lebar.requestFocus();
                }else{
                    Integer panjang = Integer.parseInt(nilai1);
                    Integer lebar = Integer.parseInt(nilai2);

                    Integer luas = panjang * lebar;
                    Integer keliling = 2 * (panjang+lebar);
                    hasil.setText(String.valueOf(luas));
                    kl.setText(String.valueOf(keliling));

                }
            }
        });

        return v;
    }
}