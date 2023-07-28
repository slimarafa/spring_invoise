package com.mycompany.invoise.repository;

import com.mycompany.invoise.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepository {
   private static  List<Invoice> invoices= new ArrayList<Invoice>();
    public void create(Invoice invoice){
        invoices.add(invoice);
        System.out.println("Invoice add with number: "+invoice.getNumber()+ " for: "+invoice.getCustomerName());
    }
}
