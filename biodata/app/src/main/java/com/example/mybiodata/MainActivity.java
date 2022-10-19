package com.example.mybiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static  final int REQUEST_PHONE_CALL=1;
    TextView txtDesc;

    //ListView listView;
    private Object TextView;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDesc = findViewById(R.id.txtDesc);
        txtDesc.setMovementMethod(new ScrollingMovementMethod());

    }

    public void alamat(View v){
        Uri map = Uri.parse("https://www.google.com/maps/place/Rembang,+Kec.+Rembang,+Kabupaten+Rembang,+Jawa+Tengah/@-6.7147371,111.3209311,14z/data=!3m1!4b1!4m5!3m4!1s0x2e7724380a162e63:0xbc8117e0521e1119!8m2!3d-6.7093739!4d111.3413151");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, map);

        startActivity(mapIntent);
    }

    public void email(View v){
        Uri email = Uri.parse("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox?compose=new");
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, email);

        startActivity(emailIntent);
    }

    public void telp(View v){
        Uri number = Uri.parse("tel:");
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);

        startActivity(callIntent);
    }
}