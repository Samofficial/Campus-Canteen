package com.example.foodsorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        int image = getIntent().getIntExtra("image",0);
        int price = Integer.parseInt(getIntent().getStringExtra("price"));
        String name = getIntent().getStringExtra("name");
        String description = getIntent().getStringExtra("desc");

    }
}