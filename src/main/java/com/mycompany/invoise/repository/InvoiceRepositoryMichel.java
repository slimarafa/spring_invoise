package com.mycompany.invoise.repository;

import com.mycompany.invoise.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepositoryMichel implements InvoiceRepositoryInterface {
   private static  List<Invoice> invoices= new ArrayList<Invoice>();
    public void create(Invoice invoice){
        invoices.add(invoice);
        System.out.println("DATABASE Invoice add with number: "+invoice.getNumber()+ " for: "+invoice.getCustomerName());
    }
}
