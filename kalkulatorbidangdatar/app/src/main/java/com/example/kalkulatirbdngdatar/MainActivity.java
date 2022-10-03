package com.example.kalkulatirbdngdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fragmentPertama(View view){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new pertamaFragment()).commit();
    }

    public void fragmentKedua(View view){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new keduaFragment()).commit();
    }

    public void fragmentKetiga(View view){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new ketigaFragment()).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new pertamaFragment()).commit();
    }
}