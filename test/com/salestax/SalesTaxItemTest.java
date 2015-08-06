package com.salestax;


import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;


public class SalesTaxItemTest {

    @Test
    public void nonExemptSalesTaxItemKnowHowToCalculatePriceAfterTax() {
        Item item = Mockito.mock(Item.class);
        SalesTaxItem salesTaxItem = new SalesTaxItem(item);

        Mockito.when(item.totalPrice()).thenReturn(7.0);

        assertEquals(.7, salesTaxItem.salesTax(.1), 0.009);
    }
}