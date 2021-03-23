package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu3 extends AppCompatActivity {

    Button pasta, pizza, dessert, sandwich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu3);

        pasta = findViewById(R.id.pasta_btn);
        pizza = findViewById(R.id.pizza_btn);
        dessert = findViewById(R.id.dessert_btn);
        sandwich = findViewById(R.id.sand_btn);

        pasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Menu1.class));
            }
        });

        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Menu2.class));
            }
        });

        dessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Menu4.class));
            }
        });

        sandwich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Menu5.class));
            }
        });
    }
}