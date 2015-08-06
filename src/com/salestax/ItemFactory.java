package com.salestax;


import java.util.ArrayList;

public class ItemFactory {

    ArrayList<String> taxFreeItems;

    public ItemFactory() {
        taxFreeItems = new ArrayList<>();
        taxFreeItems.add("chocolates");
        taxFreeItems.add("pills");
        taxFreeItems.add("chocolate");
        taxFreeItems.add("book");
        taxFreeItems.add("books");
    }

    public Item createItemFrom(String userInput) {
        String[] input = userInput.split(" ");
        int quantity = Integer.parseInt(input[0]);
        double price = Double.parseDouble(input[input.length - 1]);
        boolean isImportTaxApplicable = false;
        if (userInput.contains("imported"))
            isImportTaxApplicable = true;
        boolean isSalesTaxApplicable = true;
        for (String itemName : taxFreeItems) {
            if (userInput.contains(itemName))
                isImportTaxApplicable = false;
        }
        return new Item(quantity, price, isSalesTaxApplicable, isImportTaxApplicable);
    }
}
