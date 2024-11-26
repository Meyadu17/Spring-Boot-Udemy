package fr.apside.invoise.core.service;

import fr.apside.invoise.core.entity.Invoice;

import java.util.List;

public interface InvoiceServiceInterface {

	void createInvoice(Invoice invoice);
	List<Invoice> getInvoiceList();

}
