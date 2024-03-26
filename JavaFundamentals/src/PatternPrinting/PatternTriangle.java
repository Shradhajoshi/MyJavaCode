package PatternPrinting;

public class PatternTriangle {

	static void printLeftSideRightAngleTriangle(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j || i == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void printInvertedLeftSideRightAngleTriangle(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i + j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void printRightSideRightAngleTriangle(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == n - 1 || i + j == n - 1 || i == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void printInvertedRightSideRightAngleTriangle(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == n - 1 || i == j || i == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void printLeftSideRightAngleTriangleFilled(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || i >= j || i == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void printInvertedLeftSideRightAngleTriangleFilled(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i + j <= n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void printRightSideRightAngleTriangleFilled(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == n - 1 || i + j >= n - 1 || i == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void printInvertedRightSideRightAngleTriangleFilled(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == n - 1 || i <= j || i == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void printTriangle(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j == (n - 1) / 2 && i <= (n - 1) / 2 && j <= (n - 1) / 2)
						|| (j - i == (n - 1) / 2 && i <= (n - 1) / 2 && j >= (n - 1) / 2) || i == (n - 1) / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void printTriangleFilled(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j >= (n - 1) / 2 && i <= (n - 1) / 2 && j <= (n - 1) / 2)
						|| (j - i <= (n - 1) / 2 && i <= (n - 1) / 2 && j >= (n - 1) / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void printInvertedTriangle(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j == 3 * (n - 1) / 2 && i >= (n - 1) / 2 && j >= (n - 1) / 2)
						|| (i - j == (n - 1) / 2 && i >= (n - 1) / 2 && j <= (n - 1) / 2) || i == (n - 1) / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void printInvertedTriangleFilled(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j <= 3 * (n - 1) / 2 && i >= (n - 1) / 2 && j >= (n - 1) / 2)
						|| (i - j <= (n - 1) / 2 && i >= (n - 1) / 2 && j <= (n - 1) / 2)) {
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
		// printLeftSideRightAngleTriangle(5); //done
		// printInvertedLeftSideRightAngleTriangle(5); //done
		// printRightSideRightAngleTriangle(5); //done
		// printInvertedRightSideRightAngleTriangle(5); //done
		// printLeftSideRightAngleTriangleFilled(5); //done
		// printInvertedLeftSideRightAngleTriangleFilled(5); //done
		// printRightSideRightAngleTriangleFilled(5); //done
		// printInvertedRightSideRightAngleTriangleFilled(5); //done
		// printTriangle(9); //done
		// printTriangleFilled(9); //done
		// printInvertedTriangle(9); //done
		// printInvertedTriangleFilled(9); //done
	}

}
