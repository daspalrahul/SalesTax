package com.salestax;


import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class BasketTest {

    @Test
    public void basketKnowsHowToCalculateItsFinalPrice() {
        Item item = Mockito.mock(Item.class);
        ArrayList<Item> items = new ArrayList<>();
        items.add(item);
        Basket basket = new Basket(items);

        Mockito.when(item.isImportTaxApplicable()).thenReturn(false);
        Mockito.when(item.isSalesTaxable()).thenReturn(false);
        Mockito.when(item.totalPrice()).thenReturn(7.0).thenReturn(7.0).thenReturn(7.0);

        assertEquals(7.0, basket.finalAmount(), 0.009);
    }
}