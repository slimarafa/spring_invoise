package com.mycompany.invoise.repository;

import com.mycompany.invoise.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {

    @Override
    public void create(Invoice invoice) {
        System.out.println("DATABASE Invoice add with number: "+invoice.getNumber()+ " for: "+invoice.getCustomerName());
    }
}
