package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryMemory;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;

public class InvoiceServiceNumber implements  InvoiceServiceInterface{
    private static long lastNumber=0L;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    private InvoiceRepositoryInterface invoiceRepository = new InvoiceRepositoryMemory();
    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }
}
