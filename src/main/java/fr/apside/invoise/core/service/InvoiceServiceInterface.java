package fr.apside.invoise.core.service;

import fr.apside.invoise.core.entity.Invoice;

import java.util.List;

public interface InvoiceServiceInterface {

	Invoice createInvoice(Invoice invoice);

	List<Invoice> getInvoiceList();

	Invoice getInvoiceByNumber(String number);
}
