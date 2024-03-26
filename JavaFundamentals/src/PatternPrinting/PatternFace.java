package PatternPrinting;

public class PatternFace {

	static void printFacePattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == 0 && j >= (n - 1) / 4 && j <= 3 * (n - 1) / 4)
						|| (j == 0 && i >= (n - 1) / 4 && i <= 3 * (n - 1) / 4)
						|| (i == n - 1 && j >= (n - 1) / 4 && j <= 3 * (n - 1) / 4)
						|| (j == n - 1 && i >= (n - 1) / 4 && i <= 3 * (n - 1) / 4) || (i + j == (n - 1) / 4)
						|| (j - i == 3 * (n - 1) / 4) || (i - j == 3 * (n - 1) / 4) || (i + j == 7 * (n - 1) / 4)
						|| (j == (n - 1) / 2 && i > (n - 1) / 4 && i <= (n - 1) / 2)
						|| (i == 3 * (n - 1) / 4 && j > (n - 1) / 4 && j < 3 * (n - 1) / 4)
						|| (i == (n - 1) / 4 && j == (n - 1) / 4) || (i == (n - 1) / 4 && j == 3 * (n - 1) / 4)
						|| (i > (n - 1) / 2 && i < 3 * (n - 1) / 4 && j == (n - 1) / 4)
						|| (i > (n - 1) / 2 && i < 3 * (n - 1) / 4 && j == 3 * (n - 1) / 4)) {
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
		printFacePattern(17);
	}

}
