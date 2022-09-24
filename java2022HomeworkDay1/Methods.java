package java2022HomeworkDay1;

public class Methods {

	public static void main(String[] args) {

		findNumber();
		sendMessage("test");

	}

	public static void findNumber() {
		int[] numbers = new int[] { 3, 5, 7, 9, 11, 13 };
		int findNumber = 11;
		boolean isExist = false;
		for (int num : numbers) {
			if (num == findNumber) {
				isExist = true;
			}
		}
		if (isExist == true) {
			sendMessage("Aradiginiz sayi o dizide mevcut :" + findNumber);
		} else {
			sendMessage("Aradiginiz sayi o dizide mevcut degildir :" + findNumber);
		}
	}

	public static void sendMessage(String message) {
		System.out.println(message);
	}
}
