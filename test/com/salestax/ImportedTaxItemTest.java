package com.salestax;


import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class ImportedTaxItemTest {

    @Test
    public void importTaxItemKnowsHowToCalculateImportTax() {
        Item item = Mockito.mock(Item.class);
        ImportedTaxItem importedTaxItem = new ImportedTaxItem(item);

        Mockito.when(item.totalPrice()).thenReturn(7.0).thenReturn(7.0);

        assertEquals(7.35, importedTaxItem.priceAfterImportTax(.05), 0);
    }
}