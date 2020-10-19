package com.example.foodsorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class SignIn_Activity extends AppCompatActivity {
    Button login2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_);
        getSupportActionBar().setTitle("Sign_In");
        //Transparent ActionBar
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
        login2 =findViewById(R.id.btnLogin3);

        login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignIn_Activity.this, "Login has been clicked", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(SignIn_Activity.this,MainActivity2.class);
                startActivity(intent);
            }
        });

    }
}