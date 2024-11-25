package fr.apside.demo.exerciceSpring.repository.memory;

import fr.apside.demo.exerciceSpring.entity.Invoice;
import fr.apside.demo.exerciceSpring.repository.InvoiceRepositoryInterface;

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
	public List<Invoice> lit() {

		throw new UnsupportedOperationException();
	}
}
