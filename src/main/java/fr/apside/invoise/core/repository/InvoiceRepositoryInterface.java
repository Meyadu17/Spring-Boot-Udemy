package fr.apside.invoise.core.repository;

import fr.apside.invoise.core.entity.Invoice;

import java.util.List;

public interface InvoiceRepositoryInterface {

	void create(Invoice invoice);

	List<Invoice> list();

	Invoice getById(String number);
}