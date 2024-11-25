package fr.apside.demo.exerciceSpring.repository;

import fr.apside.demo.exerciceSpring.entity.Invoice;

import java.util.List;

public interface InvoiceRepositoryInterface {

	void create(Invoice invoice);
	List<Invoice> lit();


}
