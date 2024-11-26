package fr.apside.invoise.core.service.prefix;

import fr.apside.invoise.core.entity.Invoice;
import fr.apside.invoise.core.repository.InvoiceRepositoryInterface;
import fr.apside.invoise.core.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

//Même chose que pour @Controller cf : InvoiceControllerWeb
@Service
public class InvoicePrefixService implements InvoiceServiceInterface {

	@Value("${invoice.lastNumber}")
	private long lastNumber;
	@Value("${invoice.prefix}")
	private String prefix;

	private final InvoiceRepositoryInterface invoiceRepositoryInterface;

	public InvoicePrefixService(InvoiceRepositoryInterface invoiceRepository) {
		this.invoiceRepositoryInterface = invoiceRepository;
	}

	public InvoiceRepositoryInterface getInvoiceRepository() {
		return invoiceRepositoryInterface;
	}

	public void createInvoice(Invoice invoice){
		invoice.setNumber(prefix+(++lastNumber));
		invoiceRepositoryInterface.create(invoice);
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