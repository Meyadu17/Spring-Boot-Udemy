package fr.apside.demo.exerciceSpring.service.number;

import fr.apside.demo.exerciceSpring.entity.Invoice;
import fr.apside.demo.exerciceSpring.repository.InvoiceRepositoryInterface;
import fr.apside.demo.exerciceSpring.service.InvoiceServiceInterface;

import java.util.List;

//@Service
public class InvoiceNumberService implements InvoiceServiceInterface {

	private static long lastNumber = 0L;
	private final InvoiceRepositoryInterface invoiceRepositoryInterface;

	public InvoiceNumberService(InvoiceRepositoryInterface invoiceRepository) {
		this.invoiceRepositoryInterface = invoiceRepository;
	}

	public InvoiceRepositoryInterface getInvoiceRepository() {
		return invoiceRepositoryInterface;
	}

	public void createInvoice(Invoice invoice) {
		invoice.setNumber(String.valueOf(++lastNumber));
		invoiceRepositoryInterface.create(invoice);
	}

	@Override
	public List<Invoice> getInvoiceList() {
		return invoiceRepositoryInterface.lit();
	}
}
