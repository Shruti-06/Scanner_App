package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu5 extends AppCompatActivity {

    Button pasta, pizza, dessert, drink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu5);

        pasta = findViewById(R.id.pasta_btn);
        pizza = findViewById(R.id.pizza_btn);
        drink = findViewById(R.id.bev_btn);
        dessert = findViewById(R.id.dessert_btn);

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

        drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Menu3.class));
            }
        });

        dessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Menu4.class));
            }
        });

    }
}