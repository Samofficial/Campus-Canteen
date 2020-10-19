package com.example.foodsorder.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodsorder.Models.OrdersModel;
import com.example.foodsorder.R;

import java.util.ArrayList;

public class OrdersAdapter extends RecyclerView.Adapter<OrdersAdapter.ViewHolder>
{
    ArrayList<OrdersModel> list;
    Context context;



    public OrdersAdapter(ArrayList<OrdersModel> list, Context context) {
        this.list = list;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.orders_sample,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final OrdersModel model = list.get(position);
        holder.ordersImage.setImageResource(model.getOrdersImage());
        holder.soldItemName.setText(model.getSoldItemName());
        holder.orderNumber.setText(model.getOrderNumber());
        holder.price.setText(model.getPrice());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
         ImageView ordersImage;
         TextView  soldItemName,orderNumber,price;
         public ViewHolder(@NonNull View itemView) {
             super(itemView);
             ordersImage = itemView.findViewById(R.id.ordersimage);
             soldItemName = itemView.findViewById(R.id.ordersitemName );
             orderNumber = itemView.findViewById(R.id.orderNumber);
             price = itemView.findViewById(R.id.orderPrice);
         }
     }
}
