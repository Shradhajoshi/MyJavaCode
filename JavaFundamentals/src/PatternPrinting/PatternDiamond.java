package PatternPrinting;

public class PatternDiamond {

	static void printDiamondPattern(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j == (n - 1) / 2) || (j - i == (n - 1) / 2) || (i + j == 3 * (n - 1) / 2)
						|| (i - j == (n - 1) / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	static void printDiamondPatternInBox(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j <= (n - 1) / 2) || (j - i >= (n - 1) / 2) || (i + j >= 3 * (n - 1) / 2)
						|| (i - j >= (n - 1) / 2) || i == 0 || j == 0 || i == n - 1 || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	static void printDiamondPatternInBoxFilled(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j >= (n - 1) / 2 && i <= (n - 1) / 2 && j <= (n - 1) / 2)
						|| (j - i <= (n - 1) / 2 && i <= (n - 1) / 2 && j >= (n - 1) / 2)
						|| (i + j <= 3 * (n - 1) / 2 && i >= (n - 1) / 2 && j >= (n - 1) / 2)
						|| (i - j <= (n - 1) / 2 && i >= (n - 1) / 2 && j <= (n - 1) / 2) || i == 0 || j == 0
						|| i == n - 1 || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	static void printDiamondPatternInBoxFilledUpperHalfHorizontal(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j >= (n - 1) / 2 && i <= (n - 1) / 2 && j <= (n - 1) / 2)
						|| (j - i <= (n - 1) / 2 && i <= (n - 1) / 2 && j >= (n - 1) / 2) || i == 0 || j == 0
						|| i == n - 1 || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	static void printDiamondPatternInBoxFilledLowerHalfHorizontal(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j <= 3 * (n - 1) / 2 && i >= (n - 1) / 2 && j >= (n - 1) / 2)
						|| (i - j <= (n - 1) / 2 && i >= (n - 1) / 2 && j <= (n - 1) / 2) || i == 0 || j == 0
						|| i == n - 1 || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	static void printDiamondPatternInBoxFilledRightHalfVertical(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((j - i <= (n - 1) / 2 && i <= (n - 1) / 2 && j >= (n - 1) / 2)
						|| (i + j <= 3 * (n - 1) / 2 && i >= (n - 1) / 2 && j >= (n - 1) / 2) || i == 0 || j == 0
						|| i == n - 1 || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	static void printDiamondPatternInBoxFilledLeftHalfVertical(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j >= (n - 1) / 2 && i <= (n - 1) / 2 && j <= (n - 1) / 2)
						|| (i - j <= (n - 1) / 2 && i >= (n - 1) / 2 && j <= (n - 1) / 2) || i == 0 || j == 0
						|| i == n - 1 || j == n - 1) {
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
		// printDiamondPattern(9); //done
		// printDiamondPatternInBox(9); //done
		// printDiamondPatternInBoxFilled(30); //done
		// printDiamondPatternInBoxFilledUpperHalfHorizontal(30); //done
		// printDiamondPatternInBoxFilledLowerHalfHorizontal(30); //done
		// printDiamondPatternInBoxFilledLeftHalfVertical(30); //done
		// printDiamondPatternInBoxFilledRightHalfVertical(30); //done
	}

}
