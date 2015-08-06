package com.salestax;


import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;


public class NonExemptSalesTaxItemTest {

    @Test
    public void nonExemptSalesTaxItemKnowHowToCalculatePriceAfterTax() {
        Item item = Mockito.mock(Item.class);
        NonExemptSalesTaxItem nonExemptSalesTaxItem = new NonExemptSalesTaxItem(item);

        Mockito.when(item.totalPrice()).thenReturn(7.0).thenReturn(7.0);

        assertEquals(7.7, nonExemptSalesTaxItem.priceAfterSalesTax(), 0);
    }

}