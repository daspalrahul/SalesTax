package com.salestax;

public class SalesTaxItem {

    private Item item;

    public SalesTaxItem(Item item) {
        this.item = item;
    }

    public double salesTax(double salesTax) {
        return item.totalPrice() * salesTax;
    }
}
