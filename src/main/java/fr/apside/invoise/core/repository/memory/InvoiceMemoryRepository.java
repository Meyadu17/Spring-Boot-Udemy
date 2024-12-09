package fr.apside.invoise.core.repository.memory;

import fr.apside.invoise.core.entity.Invoice;
import fr.apside.invoise.core.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe repository pourrait aussi bien s'appeller DAO (Data Access Object)
 */
@Repository
public class InvoiceMemoryRepository implements InvoiceRepositoryInterface {

	private static List<Invoice> invoiceList = new ArrayList<>();

	public void create(Invoice invoice) {
		invoiceList.add(invoice);
		System.out.println("Memory : Invoice added with number " + invoice.getNumber() + " for" + invoice.getCustomerName());
	}

	@Override
	public List<Invoice> list() {
		Invoice invoice1 = new Invoice();
		invoice1.setNumber("1");
		invoice1.setCustomerName("John Doe");
		invoice1.setOrderNumber("ON_001");

		System.out.println("id : " + invoice1.getNumber()
						   + ", entreprise : " + invoice1.getCustomerName()
						   + ", order : " + invoice1.getOrderNumber());

		Invoice invoice2 = new Invoice();
		invoice2.setNumber("2");
		invoice2.setCustomerName("Mike Myers");
		invoice2.setOrderNumber("ON_002");

		System.out.println("id : " + invoice2.getNumber()
						   + ", entreprise : " + invoice2.getCustomerName()
						   + ", order : " + invoice2.getOrderNumber());

		Invoice invoice3 = new Invoice();
		invoice3.setNumber("3");
		invoice3.setCustomerName("Benny Hill");
		invoice3.setOrderNumber("ON_003");

		System.out.println("id : " + invoice3.getNumber()
						   + ", entreprise : " + invoice3.getCustomerName()
						   + ", order : " + invoice3.getOrderNumber());

		return List.of(invoice1, invoice2, invoice3);
	}

	@Override
	public Invoice getById(String number) {

		List<Invoice> invoiceList = list();

		for (Invoice invoice : invoiceList) {
			if (invoice.getNumber().equals(number)) {
				return invoice;
			}
		}

		return null;
	}
}
