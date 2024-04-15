package com.example.screens;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String celebration;
        String date;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        Bundle extras = getIntent().getExtras();
        celebration = extras.getString("celebration");
        date = extras.getString("date");


        TextView textView = findViewById(R.id.TextView);

        // Update TextView content based on the variable
        textView.setText("Välkommen på " + celebration + " den " + date + ".");
    }
}