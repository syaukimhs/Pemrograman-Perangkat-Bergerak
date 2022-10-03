package com.example.kalkulatirbdngdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ketigaFragment extends Fragment {
    private Button btnHasil;
    private EditText txt_diameter;
    private TextView hasil,kl;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_ketiga, container, false);

        btnHasil = v.findViewById(R.id.btnHasil);
        txt_diameter = v.findViewById(R.id.txt_diameter);
        hasil = v.findViewById(R.id.hasil);
        kl = v.findViewById(R.id.klng);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai = txt_diameter.getText().toString();
                if(nilai.isEmpty()){
                    txt_diameter.setError("Data tidak boleh kosong");
                    txt_diameter.requestFocus();
                }else{
                    Double diameter = Double.parseDouble(nilai);
                    Double luas =0.25 * 3.14 * (diameter *2);
                    Double keliling = 3.14 * diameter;
                    hasil.setText(String.valueOf(luas));
                    kl.setText(String.valueOf(keliling));
                }
            }
        });

        return v;
    }
}