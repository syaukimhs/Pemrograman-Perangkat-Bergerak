package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtnumber1, edtnumber2;
    TextView txthasil;
    Button buttontambah, buttonkurang, buttonkali, buttonbagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtnumber1=(EditText) findViewById(R.id.number1);
        edtnumber2=(EditText) findViewById(R.id.number2);
        txthasil=(TextView) findViewById(R.id.viewhasil);
        buttontambah=(Button) findViewById(R.id.btntambah);
        buttonkurang=(Button) findViewById(R.id.btnkurang);
        buttonkali=(Button) findViewById(R.id.btnkali);
        buttonbagi=(Button) findViewById(R.id.btnbagi);

        buttontambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1, bilangan2, hasil;
                bilangan1=Double.valueOf(edtnumber1.getText().toString().trim());
                bilangan2=Double.valueOf(edtnumber2.getText().toString().trim());
                hasil=bilangan1+bilangan2;
                String hasil1=String.valueOf(hasil);
                txthasil.setText(hasil1);
            }
        });

        buttonkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1, bilangan2, hasil;
                bilangan1=Double.valueOf(edtnumber1.getText().toString().trim());
                bilangan2=Double.valueOf(edtnumber2.getText().toString().trim());
                hasil=bilangan1-bilangan2;
                String hasil1=String.valueOf(hasil);
                txthasil.setText(hasil1);
            }
        });

        buttonkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1, bilangan2, hasil;
                bilangan1=Double.valueOf(edtnumber1.getText().toString().trim());
                bilangan2=Double.valueOf(edtnumber2.getText().toString().trim());
                hasil=bilangan1*bilangan2;
                String hasil1=String.valueOf(hasil);
                txthasil.setText(hasil1);
            }
        });

        buttonbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1, bilangan2, hasil;
                bilangan1=Double.valueOf(edtnumber1.getText().toString().trim());
                bilangan2=Double.valueOf(edtnumber2.getText().toString().trim());
                hasil=bilangan1/bilangan2;
                String hasil1=String.valueOf(hasil);
                txthasil.setText(hasil1);
            }
        });
    }
}