package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Table_nos extends AppCompatActivity {

    Button T1, T2, T3, T4, T5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_nos);

        T1=findViewById(R.id.table_1);
        T2=findViewById(R.id.table_2);
        T3=findViewById(R.id.table_3);
        T4=findViewById(R.id.table_4);
        T5=findViewById(R.id.table_5);

        T1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Menu1.class));
            }
        });
        T2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Menu1.class));
            }
        });
        T3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Menu1.class));
            }
        });
        T4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Menu1.class));
            }
        });
        T5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Menu1.class));
            }
        });
    }
}