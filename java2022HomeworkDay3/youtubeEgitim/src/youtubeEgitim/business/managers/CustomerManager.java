package youtubeEgitim.business.managers;

import youtubeEgitim.business.services.CreditService;
import youtubeEgitim.business.services.CustomerService;
import youtubeEgitim.entities.Customer;

public class CustomerManager implements CustomerService {

	private Customer customer;
	private CreditService creditService;

	public CustomerManager(Customer customer, CreditService creditService) {
		super();
		this.customer = customer;
		this.creditService = creditService;
	}

	@Override
	public void save() {
		System.out.println("Müsteri Kaydedildi: ");

	}

	@Override
	public void delete() {
		System.out.println("Müsteri Silindi: ");

	}

	@Override
	public void giveCredit() {
		creditService.calculate();
		System.out.println("Kredi Verildi.");

	}

}
