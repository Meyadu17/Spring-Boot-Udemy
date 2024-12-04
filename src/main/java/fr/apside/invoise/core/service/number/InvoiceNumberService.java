package fr.apside.invoise.core.service.number;

import fr.apside.invoise.core.entity.Invoice;
import fr.apside.invoise.core.repository.InvoiceRepositoryInterface;
import fr.apside.invoise.core.service.InvoiceServiceInterface;

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

	public Invoice createInvoice(Invoice invoice) {
		invoice.setNumber(String.valueOf(++lastNumber));
		invoiceRepositoryInterface.create(invoice);
		return invoice;
	}

	@Override
	public List<Invoice> getInvoiceList() {
		return invoiceRepositoryInterface.list();
	}

	@Override
	public Invoice getInvoiceByNumber(String number) {
		return invoiceRepositoryInterface.getById(number);
	}
}
