package Oving5;

public class TowersOfHanoi {
	private static int totalDisks;
	private static int flyttinger = 0;

	public TowersOfHanoi(int disks) {
		totalDisks = disks;
	}

	public static void solve() {
		moveTower(totalDisks, 1, 3, 2);
	}

	private static void moveTower(int numDisks, int start, int end, int temp) {
		if (numDisks == 1)
			moveOneDisk(start, end);
		else {
			moveTower(numDisks - 1, start, temp, end);
			moveOneDisk(start, end);
			moveTower(numDisks - 1, temp, end, start);
		}
	}

	private static void moveOneDisk(int start, int end) {
		// System.out.println("Move one disk from " + start + " to " + end);
		flyttinger++;

	}

	public static void main(String[] args) {

		long start = System.nanoTime();

		TowersOfHanoi tower = new TowersOfHanoi(15);
		System.nanoTime();
		solve();
		long finish = System.nanoTime();
		long totalTid = finish - start;
		System.out.println("Totalt antall flyttinger " + flyttinger);
		System.out.println(totalTid + " nanosekunder");

	}
	
	
	
}
