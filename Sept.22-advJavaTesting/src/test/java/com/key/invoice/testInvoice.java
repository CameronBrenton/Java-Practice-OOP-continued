package com.key.employee;

import com.key.invoice.Invoice;
import org.junit.Assert;
import org.junit.Test;

public class testInvoice {
    @Test
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("01", "Samsung Galaxy A70 mobile phone", 1, 800.00);
        System.out.println(invoice1.toString());
        System.out.println("The total cost for Invoice 1 is: $" + invoice1.getTotal());
        invoice1.setUnitPrice(900.00);
        Assert.assertFalse("Unit price for this innvoice should now be 900.00", invoice1.getUnitPrice() != 900.00);
        System.out.println("The total cost for Invoice 1 after updating the unitPrice is: $" + invoice1.getTotal());
        Assert.assertFalse("The total of this invoice should be = $900", invoice1.getTotal() != 900.0);

        Assert.assertFalse(invoice1 == null);
        //Assert.assertFalse(invoice1.invoiceCount != 0);
        Assert.assertTrue(invoice1.invoiceCount == 1);

        Invoice invoice2 = new Invoice(invoice1);
        System.out.println(invoice2.toString());
        invoice2.setQty(2);
        Assert.assertTrue("New invoice quantity should now be 2", invoice2.getQty() == 2);
        invoice2.setUnitPrice(899.99);
        Assert.assertTrue("New invoice unit price should now be 899.99", invoice2.getUnitPrice() == 899.99);
        System.out.println("Invoice 2 after updating the quantity and unit price is: " + invoice2.toString());
        System.out.println("The total cost for Invoice 2 is: $" + invoice2.getTotal());


        Invoice invoice3 = new Invoice("02", "Big box of fireworks", 4, 199.99);
        System.out.println(invoice3.toString());
        System.out.println("The total cost for Invoice 3 is: $" + invoice3.getTotal());
        Assert.assertFalse("The total cost for Invoice 3 should be $799.96", invoice3.getTotal() != 799.96);

        Invoice invoice4 = new Invoice("03", "One way ticket to Paris France", 1, 1700.00);
        Assert.assertTrue("If it's a trip to anywhere other than France it's a fail", invoice1.getDesc() != "One way ticket to Paris France");
        System.out.println(invoice4.toString());
        System.out.println("The total cost for Invoice 4 is: $" + invoice4.getTotal());
        Assert.assertFalse("The cost for this invoice should be $1700.00", invoice4.getTotal() != 1700.00);

        Invoice invoice5 = new Invoice("04", "Lumber for building", 35, 10.00);
        System.out.println(invoice5.toString());
        System.out.println("The total cost for Invoice 5 is: $" + invoice5.getTotal());
        Assert.assertFalse("The cost for this invoice should be $350", invoice5.getTotal() != 350.0);
        invoice5.setUnitPrice(11.00);
        Assert.assertFalse(invoice5.getUnitPrice() != 11);


        System.out.println("The total number of invoices that have been generated is: " + Invoice.invoiceCount);
    }
}
