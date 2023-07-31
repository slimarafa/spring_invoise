package com.mycompany.invoise;

import com.mycompany.invoise.controller.InvoiceController;
import com.mycompany.invoise.controller.InvoiceControllerChambouleToutMag2;
import com.mycompany.invoise.controller.InvoiceControllerMichel;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepository;
import com.mycompany.invoise.repository.InvoiceRepositoryMichel;
import com.mycompany.invoise.service.InvoiceService;
import com.mycompany.invoise.service.InvoiceServiceMichel;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Scanner sc = new Scanner(System.in); //clavier
        System.out.println("Dans quelle configuration êtes-vous ?");
        int configuration=sc.nextInt();
        if(configuration==1) {
            InvoiceController invoiceController= new InvoiceController();
            InvoiceService invoiceService= new InvoiceService();
            invoiceController.setInvoiceService(invoiceService);
            InvoiceRepository  invoiceRepository= new InvoiceRepository();
            invoiceService.setInvoiceRepository(invoiceRepository);
            invoiceController.createInvoice();
        }else if(configuration==2){
             InvoiceControllerMichel invoiceController= new InvoiceControllerMichel();
            InvoiceServiceMichel invoiceService= new InvoiceServiceMichel();
            invoiceController.setInvoiceService(invoiceService);
            InvoiceRepositoryMichel invoiceRepository= new InvoiceRepositoryMichel();
            invoiceService.setInvoiceRepository(invoiceRepository);
            invoiceController.createInvoice();
        }else if(configuration==3){
            InvoiceController invoiceController= new InvoiceController();
            InvoiceServiceMichel invoiceService= new InvoiceServiceMichel();
            invoiceController.setInvoiceService(invoiceService);
            InvoiceRepositoryMichel invoiceRepository= new InvoiceRepositoryMichel();
            invoiceService.setInvoiceRepository(invoiceRepository);
            invoiceController.createInvoice();
        }else if(configuration==4){
            InvoiceControllerChambouleToutMag2 invoiceController= new InvoiceControllerChambouleToutMag2();
            InvoiceService invoiceService= new InvoiceService();
            invoiceController.setInvoiceService(invoiceService);
            InvoiceRepositoryMichel invoiceRepository= new InvoiceRepositoryMichel();
            invoiceService.setInvoiceRepository(invoiceRepository);
            invoiceController.createInvoice();
        }
    }
}
