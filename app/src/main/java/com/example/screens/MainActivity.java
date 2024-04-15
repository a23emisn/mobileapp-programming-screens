package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String högtid = "Kräftskiva";
        final String datum = "2024/08/08";
        Button toSecondaryActivity = findViewById(R.id.magicButton);

        toSecondaryActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                intent.putExtra("celebration", högtid);
                intent.putExtra("date", datum);
                startActivity(intent);
            }
        });
    }
}
