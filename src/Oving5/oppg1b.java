package Oving5;

public class oppg1b {

	public static void main(String[] args) {

		for (int i = 0; i < 11; i++) {
			System.out.println(sum(i));
		}
		
	}

	public static int sum(int n) {

		if (n == 0) {
			return 2;
		}

		else if (n == 1) {
			return 5;
		}

		return 5 * sum(n - 1) - 6 * sum(n - 2) + 2;
	}

}
