package youtubeEgitim;

import youtubeEgitim.business.managers.CreditManager;
import youtubeEgitim.business.managers.CustomerManager;
import youtubeEgitim.business.managers.MilitaryCreditManager;
import youtubeEgitim.business.services.CreditService;
import youtubeEgitim.entities.Customer;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.giveCredit();

	}

}
