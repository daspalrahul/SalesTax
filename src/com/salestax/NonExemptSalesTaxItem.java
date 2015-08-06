package com.salestax;

public class NonExemptSalesTaxItem {

    private Item item;
    private int salesTax;

    public NonExemptSalesTaxItem(Item item) {
        this.item = item;
        salesTax = 10;
    }

    public double priceAfterSalesTax() {
        return item.totalPrice() + (item.totalPrice() * .1);
    }
}
