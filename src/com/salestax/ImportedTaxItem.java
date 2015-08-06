package com.salestax;


public class ImportedTaxItem {

    Item item;

    public ImportedTaxItem(Item item) {
        this.item = item;
    }

    public double priceAfterImportTax(double importTax) {
        return item.totalPrice() + (item.totalPrice() * importTax);
    }
}
