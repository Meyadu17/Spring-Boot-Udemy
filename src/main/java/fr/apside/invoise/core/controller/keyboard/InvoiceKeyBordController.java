package fr.apside.invoise.core.controller.keyboard;

import fr.apside.invoise.core.controller.InvoiceControllerInterface;
import fr.apside.invoise.core.entity.Invoice;
import fr.apside.invoise.core.service.InvoiceServiceInterface;

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
