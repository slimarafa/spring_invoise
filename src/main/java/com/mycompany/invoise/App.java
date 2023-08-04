package com.mycompany.invoise;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        InvoiceControllerInterface invoiceController=context.getBean(InvoiceControllerInterface.class);
        invoiceController.createInvoice();
       /* Scanner sc = new Scanner(System.in); //clavier
        System.out.println("Quelle est  classe de contrôleur ? ");
        String controllerClass=sc.nextLine();

        System.out.println("Quelle est la classe de service ?");
        String serviceClass=sc.nextLine();

        System.out.println("Quelle est la classe de repository ?");
        String repositoryClass=sc.nextLine();

        InvoiceControllerInterface invoiceController=null;
        InvoiceServiceInterface invoiceService=null;
        InvoiceRepositoryInterface invoiceRepository=null;
        try {
            invoiceController = (InvoiceControllerInterface) Class.forName(controllerClass).getDeclaredConstructor().newInstance();
            invoiceService = (InvoiceServiceInterface) Class.forName(serviceClass).getDeclaredConstructor().newInstance();
            invoiceRepository = (InvoiceRepositoryInterface) Class.forName(repositoryClass).getDeclaredConstructor().newInstance();
            invoiceController.setInvoiceService(invoiceService);
            invoiceService.setInvoiceRepository(invoiceRepository);
            invoiceController.createInvoice();
        }catch(Exception ex){
            ex.printStackTrace();
        }*/
    }
}
