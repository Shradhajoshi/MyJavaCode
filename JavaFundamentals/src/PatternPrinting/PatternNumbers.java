package PatternPrinting;

public class PatternNumbers {

	static void printOne(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((j == (n - 1) / 2) || (i == n - 1 && j > 0 && j < n - 1) || (i + j == (n - 1) / 2) && j > 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void printTwo(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == n - 1 && j < n - 1) || (i == 0 && j > 0 && j < n - 1) || (j == 0 && i > 0 && i < (n - 1) / 2)
						|| (i + j == n - 1) && j < n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void printThree(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == 0 && j < n - 1) || (i == n - 1 && j < n - 1) || (i + j == 3 * (n - 1) / 4 && j > 0)
						|| (i - j == (n - 1) / 4 && i >= (n - 1) / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void printFour(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((j == 0 && i < n - 1) || (i == 3 * (n - 1) / 4 && j < n - 1) || (j == (n - 1) / 2 && i > 0)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void printFive(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((j == 0 && i <= (n - 1) / 2) || (i == (n - 1) / 2 && j <= (n - 1) / 2)
						|| (j == (n - 1) / 2 && i >= (n - 1) / 2) || (i == n - 1 && j <= (n - 1) / 2)
						|| (i == 0 && j <= (n - 1) / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void printSix(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((j == 0) || (i == (n - 1) / 2 && j <= (n - 1) / 2) || (j == (n - 1) / 2 && i >= (n - 1) / 2)
						|| (i == n - 1 && j <= (n - 1) / 2) || (i == 0 && j <= (n - 1) / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void printSeven(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i + j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void printEight(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == 0 && j > 0 && j < n - 1) || (i == n - 1 && j > 0 && j < n - 1)
						|| (j == 0 && i > 0 && i < n - 1) || (j == n - 1 && i > 0 && i < n - 1) || (i == (n - 1) / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void printNine(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == 0 && j > 0 && j < n - 1) || (i == n - 1 && j > 0 && j < n - 1)
						|| (j == n - 1 && i > 0 && i < n - 1) || (i == (n - 1) / 2 && j > 0)
						|| (j == 0 && i < (n - 1) / 2) && i > 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printOne(5); //done
		// printTwo(5); //done
		// printThree(5); //done
		// printFour(5); //done
		// printFive(5); //done
		// printSix(5); //done
		// printSeven(5); //done
		// printEight(5); //done
		// printNine(5); //done
	}

}
