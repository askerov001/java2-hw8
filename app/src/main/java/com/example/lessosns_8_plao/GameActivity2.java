package com.example.lessosns_8_plao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class GameActivity2 extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);

        editText = findViewById(R.id.btn_answer);

        findViewById(R.id.button_answer).setOnClickListener(v -> {
            if (editText.getText().toString().equals("30")){
                Intent intent = new Intent(this, Screen3.class);
                startActivity(intent);
                finish();
            }else {
                Toast.makeText(this,"Ответ не верен", Toast.LENGTH_SHORT).show();
            }

        });
    }
}