package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.repository.InvoiceRepositoryDatabase;

public class InvoiceServicePrefix implements InvoiceServiceInterface{
    private static long lastNumber=112L;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    private InvoiceRepositoryInterface invoiceRepository = new InvoiceRepositoryDatabase();
    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf("INV_"+(++lastNumber)));
        invoiceRepository.create(invoice);
    }
}
