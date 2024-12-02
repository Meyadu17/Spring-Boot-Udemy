package fr.apside.invoise.core.repository.memory;

import fr.apside.invoise.core.entity.Invoice;
import fr.apside.invoise.core.repository.InvoiceRepositoryInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe repository pourrait aussi bien s'appeller DAO (Data Access Object)
 */
//@Repository
public class InvoiceMemoryRepository implements InvoiceRepositoryInterface {

	private static List<Invoice> invoices = new ArrayList<>();

	public void create(Invoice invoice) {
		invoices.add(invoice);
		System.out.println("Memory : Invoice added with number " + invoice.getNumber() + " for" + invoice.getCustomerName());
	}

	@Override
	public List<Invoice> list() {

		// Retourne une exception, car dans notre exercice, méthode non implémenté.
		throw new UnsupportedOperationException();
	}

	@Override
	public Invoice getById(String number) {
		// Retourne une exception, car dans notre exercice, méthode non implémenté.
		throw new UnsupportedOperationException();
	}
}
