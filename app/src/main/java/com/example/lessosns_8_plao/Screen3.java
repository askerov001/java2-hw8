package com.example.lessosns_8_plao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Screen3 extends AppCompatActivity {

    EditText editText;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        editText = findViewById(R.id.btn_answer);
        btn = findViewById(R.id.btn_otvet);
        btn.setOnClickListener(v -> {
            if (editText.getText().toString().equals("2018")){
               Toast.makeText(this, "Ответ верен" , Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this,"Ответ не верен", Toast.LENGTH_SHORT).show();
            }
        });

    }


}