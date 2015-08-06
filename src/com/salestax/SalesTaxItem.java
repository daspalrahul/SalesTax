package com.salestax;

public class SalesTaxItem {

    private Item item;
    private int salesTax;

    public SalesTaxItem(Item item) {
        this.item = item;
        salesTax = 10;
    }

    public double priceAfterSalesTax() {
        return item.totalPrice() + (item.totalPrice() * .1);
    }
}
