package fr.apside.demo.exerciceSpring.service;

import fr.apside.demo.exerciceSpring.entity.Invoice;

import java.util.List;

public interface InvoiceServiceInterface {

	void createInvoice(Invoice invoice);
	List<Invoice> getInvoiceList();

}
