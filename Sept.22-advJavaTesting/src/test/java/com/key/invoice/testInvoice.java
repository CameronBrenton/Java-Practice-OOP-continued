package com.key.invoice;

import org.junit.Assert;
import org.junit.Test;

public class testInvoice {

    @Test
    public void testGetID() {
        Invoice invoice1 = new Invoice("01", "Samsung Galaxy A70 mobile phone", 1, 800.00);
        Assert.assertTrue(invoice1.getID() == "01");
    }

    @Test
    public void testGetDesc(){
        Invoice invoice1 = new Invoice("01", "Samsung Galaxy A70 mobile phone", 1, 800.00);
        Assert.assertTrue(invoice1.getDesc() == "Samsung Galaxy A70 mobile phone");
    }

    @Test
    public void testGetQty(){
        Invoice invoice2 = new Invoice("02", "Big box of fireworks", 4, 199.99);
        Assert.assertTrue(invoice2.getQty() == 4);
    }

    @Test
    public void testGetUnitPrice(){
        Invoice invoice2 = new Invoice("02", "Big box of fireworks", 4, 199.99);
        Assert.assertTrue(invoice2.getUnitPrice() == 199.99);
    }

    @Test
    public void testTotal(){
        Invoice invoice2 = new Invoice("02", "Big box of fireworks", 4, 199.99);
        Assert.assertTrue(invoice2.getTotal() == (4 * 199.99));
    }

    @Test
    public void testSetQty(){
        Invoice invoice3 = new Invoice("03", "One way ticket to Paris France", 1, 1700.00);
        // Set the quantity
        invoice3.setQty(4);
        Assert.assertTrue(invoice3.getQty() == 4);
    }

    @Test
    public void testSetUnitPrice(){
        Invoice invoice4 = new Invoice("04", "Lumber for building", 35, 10.00);
        // Set the unit price
        invoice4.setUnitPrice(11.00);
        Assert.assertTrue(invoice4.getUnitPrice() == 11.00);
    }
}
