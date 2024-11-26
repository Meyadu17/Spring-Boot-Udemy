package fr.apside.invoise.core.repository.database;

import fr.apside.invoise.core.entity.Invoice;
import fr.apside.invoise.core.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * La classe repository pourrait aussi bien s'appeller DAO (Data Access Object)
 * pARTIE mOD7LE DU mvc
 */
// Même chose que pour @Controller et @Service, (il y a juste de légères différences cf : InvoiceControllerWeb
@Repository
public class InvoiceDataBaseRepository implements InvoiceRepositoryInterface {

	public void create(Invoice invoice){
        /*[…]
        PreparedStatement pstmt=connexion.prepareStatement("INSERT INTO FACTURE (NUMBER,CUSTOMERNAME) VALUES (?,?)");
                […]
        pstmt.executeUpdate();*/
		System.out.println("Database: Invoice added with number "+invoice.getNumber()+" for "+invoice.getCustomerName());
	}

	@Override
	public List<Invoice> list() {
		// Mock des données
		Invoice invoice1 = new Invoice();
		invoice1.setNumber("NUM_1");
		invoice1.setCustomerName("EDF");
		Invoice invoice2 = new Invoice();
		invoice2.setNumber("NUM_2");
		invoice2.setCustomerName("La poste");

		return List.of(invoice1, invoice2);
	}

	@Override
	public Invoice getById(String number) {

		// Mock des données
		Invoice invoice1 = new Invoice();
		invoice1.setNumber(number);
		invoice1.setCustomerName("EDF");
		invoice1.setOrderNumber("ON_002");

		return invoice1;
	}

}
