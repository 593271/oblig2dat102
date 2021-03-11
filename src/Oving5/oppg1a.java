package Oving5;

public class oppg1a {

	public static void main(String[] args) {

		System.out.println(sum(100));
	}

	public static int sum(int n) {

		if (n <= 1) {
			return n;
		}
			
		return n + sum(n - 1);

	}

}
