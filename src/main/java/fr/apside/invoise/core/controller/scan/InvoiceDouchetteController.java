package fr.apside.invoise.core.controller.scan;

import fr.apside.invoise.core.controller.InvoiceControllerInterface;
import fr.apside.invoise.core.entity.Invoice;
import fr.apside.invoise.core.service.InvoiceServiceInterface;

//@Controller
public class InvoiceDouchetteController implements InvoiceControllerInterface {

	private final InvoiceServiceInterface invoiceService;

	public InvoiceDouchetteController(InvoiceServiceInterface invoiceService) {
		this.invoiceService = invoiceService;
	}

	@Override
	public void createInvoice() {
		// de fausses données en dur pour simuler ce que récupère une scanner de code barre de notre exemple
		System.out.println("Usage of a scanner");
		Invoice invoice = new Invoice();
		invoice.setCustomerName("Virgin Galactic");
		invoiceService.createInvoice(invoice);
	}
}
