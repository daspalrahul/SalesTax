package com.salestax;

public class SalesTaxItem {

    private Item item;

    public SalesTaxItem(Item item) {
        this.item = item;
    }

    public double priceAfterSalesTax(double salesTax) {
        return item.totalPrice() + (item.totalPrice() * salesTax);
    }
}
