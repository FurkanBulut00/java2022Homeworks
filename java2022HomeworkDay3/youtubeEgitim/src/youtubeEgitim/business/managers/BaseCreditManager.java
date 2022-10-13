package youtubeEgitim.business.managers;

import youtubeEgitim.business.services.CreditService;

public abstract class BaseCreditManager implements CreditService {

	public abstract void calculate();

	public void save() {
		System.out.println("Kaydedildi");

	}

}
