package fr.apside.demo.exerciceSpring.service;

import fr.apside.demo.exerciceSpring.entity.Invoice;
import fr.apside.demo.exerciceSpring.repository.InvoiceRepositoryInterface;

public interface InvoiceServiceInterface {

	void createInvoice(Invoice invoice);

}
