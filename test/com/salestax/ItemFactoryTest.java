package com.salestax;


import org.junit.Test;

import static org.junit.Assert.*;


public class ItemFactoryTest {

    @Test
    public void itemFactoryCanReturnAnItem() {
        ItemFactory itemFactory = new ItemFactory();

        assertEquals(Item.class, itemFactory.createItemFrom("1 imported box of chocolates at 10.00").getClass());
    }
}
