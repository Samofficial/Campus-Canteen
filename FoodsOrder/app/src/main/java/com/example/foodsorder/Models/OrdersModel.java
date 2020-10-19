package com.example.foodsorder.Models;

public class OrdersModel {
    int ordersImage;
    String soldItemName,price,orderNumber;

    public OrdersModel(int ordersImage, String soldItemName, String price, String orderNumber) {
        this.ordersImage = ordersImage;
        this.soldItemName = soldItemName;
        this.price = price;
        this.orderNumber = orderNumber;
    }

    public int getOrdersImage() {
        return ordersImage;
    }

    public void setOrdersImage(int ordersImage) {
        this.ordersImage = ordersImage;
    }

    public String getSoldItemName() {
        return soldItemName;
    }

    public void setSoldItemName(String soldItemName) {
        this.soldItemName = soldItemName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
