package fr.apside.demo.exerciceSpring.controller.web;

import fr.apside.demo.exerciceSpring.controller.InvoiceControllerInterface;
import fr.apside.demo.exerciceSpring.entity.Invoice;
import fr.apside.demo.exerciceSpring.service.InvoiceServiceInterface;
import org.springframework.stereotype.Controller;

// @Component indique que c'est une composant de l'application. Ici on utilise l'annotation fille :
@Controller// On par de stereotype
public class InvoiceWebController implements InvoiceControllerInterface {

	// @Autowired permmet l'injection de dépendance sans passer par le setter
	// @Resource est l'équivalent JEE
	// @Inject est l'équivalent JEE 6
	private final InvoiceServiceInterface invoiceServiceInterface;

	// Constructeur : en passant InvoiceServiceInterface en final et en ajoutant le constructeur, l'application ne pourras démmarrer QUE si TOUTES les
	// dépendances sont satisfaites.@Autowired deviens inutile.
	public InvoiceWebController(InvoiceServiceInterface invoiceServiceInterface) {
		this.invoiceServiceInterface = invoiceServiceInterface;
	}

	public void createInvoice(){
		//Ici on fait comme si on avais une interface graphique avec déjà les infos sais dans l'interface.
		String customerName = "Tesla";

		Invoice invoice=new Invoice();
		invoice.setCustomerName(customerName);

		invoiceServiceInterface.createInvoice(invoice);
	}
}
