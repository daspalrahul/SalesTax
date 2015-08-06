package com.salestax;


import java.util.ArrayList;

public class Basket {

    private ArrayList<Item> itemList;

    public Basket(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    public double finalAmount() {
        double amount = 0;
        for (Item item : itemList) {
            amount += calculateSaleTax(item);
            amount += calculateimportTax(item);
            amount += item.totalPrice();
        }
        return amount;
    }

    private double calculateimportTax(Item item) {
        if (item.isImportTaxApplicable())
            return new ImportedTaxItem(item).importTax(TaxValues.IMPORT_TAX);
        else
            return new ImportedTaxItem(item).importTax(TaxValues.IMPORT_TAX_FOR_EXEMPT_GOODS);
    }

    private double calculateSaleTax(Item item) {
        if (item.isImportTaxApplicable())
            return new  SalesTaxItem(item).salesTax(TaxValues.SALES_TAX);
        else
            return new SalesTaxItem(item).salesTax(TaxValues.SALES_TAX_FOR_EXEMPT_GOODS);
    }
}
