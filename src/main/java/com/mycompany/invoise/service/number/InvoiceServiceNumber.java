package com.mycompany.invoise.service.number;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.memory.InvoiceRepositoryMemory;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class InvoiceServiceNumber implements InvoiceServiceInterface {
    private static long lastNumber=0L;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Autowired
    private InvoiceRepositoryInterface invoiceRepository ;
    @Override
    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }
}
