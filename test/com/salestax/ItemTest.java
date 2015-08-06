package com.salestax;


import org.junit.Test;

import static org.junit.Assert.*;


public class ItemTest {

    @Test
    public void itemKnowsItsPrice() {
        Item item = new Item(2, 3.5, true, true);

        assertEquals(7, item.totalPrice(), 0);
    }

    @Test
    public void itemKnowsIfItsSalesTaxable() {
        Item item = new Item(2, 3.5, true, true);

        assertEquals(true, item.isSalesTaxable());
    }

    @Test
    public void itemKnowsIfItsImportTaxable() {
        Item item = new Item(2, 3.5, true, true);

        assertEquals(true, item.isImportTaxApplicable());
    }
}