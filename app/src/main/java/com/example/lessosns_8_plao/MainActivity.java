package com.example.lessosns_8_plao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.bv_button1).setOnClickListener(v->{
            Intent intent = new Intent(this, GameActivity2.class);
            startActivity(intent);
        });
    }
}