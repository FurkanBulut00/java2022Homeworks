package java2022HomeworkDay2;

public class Main {

	public static void main(String[] args) {

		// ----------Mini proje-1 sayi asal mi---------------

		int number = 11;
		boolean isPrime = true;

		if (number < 1) {
			System.out.println("Sayi gecersiz");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}

		}
		if (isPrime == true && number != 1) {
			System.out.println("sayi asaldir");
		} else {
			System.out.println("sayi asal degildir");
		}

		// ----------Mini proje-2 Kalın Sesli ve İnce Sesli Harfler---------------

		char letter = 'Ü';
		switch (letter) {
		case 'A':
		case 'I':
		case 'U':
		case 'O':
			System.out.println("Kalin sesli harfler");
			break;
		case 'E':
		case 'İ':
		case 'Ü':
		case 'Ö':
			System.out.println("İnce sesli harfler");
			break;
		default:
			System.out.println("Sessiz harfler");
			break;
		}

		// ----------Mini Proje 3 - Mükemmel Sayılar---------------

		int perfectNumber = 27;
		int sum = 0;

		for (int i = 1; i < perfectNumber; i++) {
			if (perfectNumber % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == perfectNumber) {
			System.out.println("Sayi mukemmel sayidir");
		}
		System.out.println("Sayi mukemmel sayi degildir");

		// ----------Mini Proje 4 - Arkadaş Sayılar---------------

		int friendNumber1 = 17296;
		int friendNumber2 = 18416;

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 1; i < friendNumber1; i++) {
			if (friendNumber1 % i == 0) {
				sum1 = sum1 + i;
			}
		}
		for (int i = 1; i < friendNumber2; i++) {
			if (friendNumber2 % i == 0) {
				sum2 = sum2 + i;
			}
		}
		if (sum1 == friendNumber2 || sum2 == friendNumber1) {
			System.out.println("Bu sayilar mukkemmeldir");
		}

		// ----------Mini Proje 4 - Arkadaş Sayılar---------------

		int[] numbers = new int[] { 3, 5, 7, 9, 11, 13 };
		int findNumber = 11;
		boolean isExist = false;
		for (int num : numbers) {
			if (num == findNumber) {
				isExist = true;
			}
		}
		if (isExist == true) {
			System.out.println("Aradiginiz sayi o dizide mevcut");
		} else {
			System.out.println("Aradiginiz sayi o dizide mevcut degil");
		}

	}

}
