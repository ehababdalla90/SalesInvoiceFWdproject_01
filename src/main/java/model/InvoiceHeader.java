
package model;

import java.util.ArrayList;

public class InvoiceHeader {
    private int invoiceNum;
    private String invoiceDate;
    private String customerName;
    private ArrayList<InvoiceLine> lines;
    
    public InvoiceHeader() {
    }

    public InvoiceHeader(int num, String date, String customer) {
        this.invoiceNum = num;
        this.invoiceDate = date;
        this.customerName = customer;
    }

    public double getInvoiceTotal() {
        double total = 0.0;
        for (InvoiceLine line : getLines()) {
            total += line.getLineTotal();
        }
        return total;
    }
    
    public ArrayList<InvoiceLine> getLines() {
        if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
    }

    public String getCustomer() {
        return customerName;
    }

    public void setCustomer(String customer) {
        this.customerName = customer;
    }

    public int getNum() {
        return invoiceNum;
    }

    public void setNum(int num) {
        this.invoiceNum = num;
    }

    public String getDate() {
        return invoiceDate;
    }

    public void setDate(String date) {
        this.invoiceDate = date;
    }

    @Override
    public String toString() {
        return "Invoice{" + "num=" + invoiceNum + ", date=" + invoiceDate + ", customer=" + customerName + '}';
    }
    
    public String getAsCSV() {
        return invoiceNum + "," + invoiceDate + "," + customerName;
    }
    
}
