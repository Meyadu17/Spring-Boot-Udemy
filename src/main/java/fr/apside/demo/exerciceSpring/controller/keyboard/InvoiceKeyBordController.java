package fr.apside.demo.exerciceSpring.controller.keyboard;

import fr.apside.demo.exerciceSpring.controller.InvoiceControllerInterface;
import fr.apside.demo.exerciceSpring.entity.Invoice;
import fr.apside.demo.exerciceSpring.service.InvoiceServiceInterface;

import java.util.Scanner;

//@Controller
public class InvoiceKeyBordController implements InvoiceControllerInterface {

	private InvoiceServiceInterface invoiceService;

	public InvoiceServiceInterface getInvoiceService() {
		return invoiceService;
	}

	public void setInvoiceService(InvoiceServiceInterface invoiceService) {
		this.invoiceService = invoiceService;
	}

	public void createInvoice () {

		System.out.println( "What is customer name?" );
		Scanner scanner = new Scanner(System.in);
		String customerName = scanner.nextLine();

		Invoice invoice = new Invoice();
		invoice.setCustomerName(customerName);


		invoiceService.createInvoice(invoice);
	}
}
