package youtubeEgitim.business.managers;

import youtubeEgitim.business.services.CreditService;

public class CreditManager implements CreditService {

	@Override
	public void calculate() {
		System.out.println("Hesaplandi");

	}

	@Override
	public void save() {
		System.out.println("Kredi hesaplandi");

	}

}
