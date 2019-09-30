package evenoddcounter;

import java.util.Random;

public class EvenOddCounter {

	public static void main(String[] args) {

		int number = 100;
		int even = 0;
		int odd = 0;

		Random randomValue = new Random();

		for (int i = 1; i <= number; i++) { // petlja za utvrdjivanje da li je paran ili neparan
			if (isEven(randomValue.nextInt(i))) {
				even++;
			} else {
				odd++;
			}
		}

		System.out.println("Number of even " + even);
		System.out.println("Number of odd " + odd);
	}

	public static boolean isEven(int num) {
		boolean isEven = false;
		if ((num % 2) == 0) {
			isEven = true;
		}
		return isEven;
	}
}
