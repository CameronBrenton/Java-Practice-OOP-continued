package com.key.invoice;

public class Invoice {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    public static int invoiceCount = 0;

    public Invoice() {
        this.id = "1";
        this.desc = "";
        this.qty = 0;
        this.unitPrice = 0;
        invoiceCount++;
    }

    public Invoice(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
        invoiceCount++;
    }

    public Invoice(Invoice i) {
        this.id = i.id;
        this.desc = i.desc;
        this.qty = i.qty;
        this.unitPrice = i.unitPrice;
        invoiceCount++;
    }

    public String getID() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getTotal() {
        return qty * unitPrice;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String toString() {
        return "InvoiceItem[id = " + id + ", desc = " + desc + ", qty = " + qty + ", unitPrice = " + unitPrice + "]";
    }
}
