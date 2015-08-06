package com.salestax;


public class ImportedTaxItem {

    Item item;

    public ImportedTaxItem(Item item) {
        this.item = item;
    }

    public double importTax(double importTax) {
        return item.totalPrice() * importTax;
    }
}
