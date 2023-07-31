package com.mycompany.invoise.controller;

import com.mycompany.invoise.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {
   void createInvoice();
   public void setInvoiceService(InvoiceServiceInterface invoiceService);
}
