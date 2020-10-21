package com.example.foodsorder;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodsorder.Adapters.OrdersAdapter;
import com.example.foodsorder.Models.OrdersModel;
//import com.example.foodsorder.databinding.ActivityOrdersBinding;

import java.util.ArrayList;

public class ordersActivity extends AppCompatActivity {
   private RecyclerView recyclerView;
  //  ActivityOrdersBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);
        recyclerView = findViewById(R.id.ordersRecyclerView);
        //binding = ActivityOrdersBinding.inflate(getLayoutInflater());
       // setContentView(binding.getRoot());
        ArrayList<OrdersModel> list = new ArrayList<>();
        list.add(new OrdersModel(R.drawable.food10,"cheese burger","4","4514445"));
        list.add(new OrdersModel(R.drawable.food10,"cheese burger","4","4514445"));
        list.add(new OrdersModel(R.drawable.food10,"cheese burger","4","4514445"));
        list.add(new OrdersModel(R.drawable.food10,"cheese burger","4","4514445"));
        list.add(new OrdersModel(R.drawable.food10,"cheese burger","4","4514445"));
        list.add(new OrdersModel(R.drawable.food10,"cheese burger","4","4514445"));
        list.add(new OrdersModel(R.drawable.food10,"cheese burger","4","4514445"));
        list.add(new OrdersModel(R.drawable.food10,"cheese burger","4","4514445"));

        OrdersAdapter adapter = new OrdersAdapter(list,this);
        //binding.ordersRecyclerView.setAdapter(adapter);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //binding.ordersRecyclerView.setLayoutManager(layoutManager);
    }
}