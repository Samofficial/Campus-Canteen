package com.example.foodsorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.foodsorder.Adapters.MainAdapter;
import com.example.foodsorder.Models.MainModel;
//import com.example.foodsorder.databinding.ActivityMain2Binding;
//import com.example.foodsorder.databinding.ActivityMain2Binding;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView = findViewById(R.id.recycleview);
        getSupportActionBar().setTitle("Menu");

                

        ArrayList<MainModel> list = new ArrayList<>();
        list.add(new MainModel(R.drawable.burger,"Burger","5" ," chicken buger with extra cheez"));
        list.add(new MainModel(R.drawable.nonveg,"nonveg","0" ," chicken buger with extra cheez"));
        list.add(new MainModel(R.drawable.food3,"food3","10" ," chicken buger with extra chej"));
        list.add(new MainModel(R.drawable.food4,"maggi","25" ," chicken buger with extra chej"));
        list.add(new MainModel(R.drawable.food5,"paties","25" ," chicken buger with extra chej"));
        list.add(new MainModel(R.drawable.food3,"samosa","25" ," chicken buger with extra chej"));

        MainAdapter adapter = new MainAdapter(list,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));








    }
}
