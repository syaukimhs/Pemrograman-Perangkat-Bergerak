package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnprsg, btnsg, btnlngkr;
    private EditText txt_input1, txt_input2, txt_input3;
    private TextView Hluas, Hkeliling;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
    }

    private void initComponent(){
        btnprsg = findViewById(R.id.btnprsg);
        btnsg = findViewById(R.id.btnsg);
        btnlngkr = findViewById(R.id.btnlngkr);
        txt_input1 = findViewById(R.id.txt_input1);
        txt_input2 = findViewById(R.id.txt_input2);
        txt_input3 = findViewById(R.id.txt_input3);
        Hluas = findViewById(R.id.Luas);
        Hkeliling = findViewById(R.id.Keliling);

        btnprsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 = txt_input1.getText().toString();
                String nilai2 = txt_input2.getText().toString();

                if(nilai1.isEmpty()){
                    txt_input1.setError("Data tidak boleh kosong");
                    txt_input1.requestFocus();
                }else if(nilai2.isEmpty()){
                    txt_input2.setError("Data tidak boleh kosong");
                    txt_input2.requestFocus();
                }else {
                    Double panjang = Double.parseDouble(nilai1);
                    Double lebar = Double.parseDouble(nilai2);

                    Double luas = panjang * lebar;
                    Double keliling = 2 * (panjang + lebar);

                    Hluas.setText(String.format("%.1f cm", luas));
                    Hkeliling.setText(String.format("%.1f cm", keliling));
                }
            }
        });

        btnsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 = txt_input1.getText().toString();
                String nilai2 = txt_input2.getText().toString();
                String nilai3 = txt_input3.getText().toString();

                if(nilai1.isEmpty()){
                    txt_input1.setError("Data tidak boleh kosong");
                    txt_input1.requestFocus();
                }else if(nilai2.isEmpty()){
                    txt_input2.setError("Data tidak boleh kosong");
                    txt_input2.requestFocus();
                }else if(nilai3.isEmpty()){
                    txt_input3.setError("Data tidak boleh kosong");
                    txt_input3.requestFocus();
                }else {
                    Double alas = Double.parseDouble(nilai1);
                    Double tinggi = Double.parseDouble(nilai2);
                    Double sisi = Double.parseDouble((nilai2));

                    Double luas =(alas * tinggi)/2;
                    Double keliling = alas + tinggi + sisi ;

                    Hluas.setText(String.format("%.1f cm", luas));
                    Hkeliling.setText(String.format("%.1f cm", keliling));

                }
            }
        });

        btnlngkr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 = txt_input1.getText().toString();
                String nilai2 = txt_input2.getText().toString();

                if(nilai1.isEmpty()){
                    txt_input1.setError("Data tidak boleh kosong");
                    txt_input1.requestFocus();
                }else if(nilai2.isEmpty()){
                    txt_input2.setError("Data tidak boleh kosong");
                    txt_input2.requestFocus();
                }else {
                    Double diameter = Double.parseDouble(nilai1);

                    Double luas =0.25 * 3.14 * (diameter *2);
                    Double keliling = 3.14 * diameter;

                    Hluas.setText(String.format("%.1f cm", luas));
                    Hkeliling.setText(String.format("%.1f cm", keliling));

                }
            }
        });

    }
}