package com.salestax;


public class Item {

    private int quantity;
    private double price;

    public Item(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public double totalPrice() {
        return quantity * price;
    }
}
