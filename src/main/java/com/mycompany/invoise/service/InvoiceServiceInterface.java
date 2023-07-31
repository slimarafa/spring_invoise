package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.repository.InvoiceRepositoryMemory;

public interface InvoiceServiceInterface {
    void createInvoice(Invoice invoice);
    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
}
