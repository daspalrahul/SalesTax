package com.salestax;


import org.junit.Test;

import static org.junit.Assert.*;


public class ItemTest {

    @Test
    public void itemKnowsItsPrice() {
        Item item = new Item(2, 3.5);

        assertEquals(7, item.totalPrice(), 0);
    }
}