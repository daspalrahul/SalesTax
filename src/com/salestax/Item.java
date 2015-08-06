package com.salestax;


public class Item {

    private int quantity;
    private double price;
    private boolean isSalesTaxable;
    private boolean isImportTaxApplicable;

    public Item(int quantity, double price, boolean isSalesTaxable, boolean isImportTaxApplicable) {
        this.quantity = quantity;
        this.price = price;
        this.isSalesTaxable = isSalesTaxable;
        this.isImportTaxApplicable = isImportTaxApplicable;
    }

    public double totalPrice() {
        return quantity * price;
    }

    public boolean isSalesTaxable() {
        return isSalesTaxable;
    }

    public boolean isImportTaxApplicable() {
        return isImportTaxApplicable;
    }
}
