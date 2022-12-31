package com.example.fooddeliv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register_activity extends AppCompatActivity {

    Button btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnConfirm = (Button) findViewById(R.id.btnconfirm);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Confirm = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(Confirm);
            }
        });

    }
}