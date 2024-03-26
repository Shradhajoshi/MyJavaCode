package PatternPrinting;

public class PatternAlbhabets {

	static void sameLineHorizontalPrint() {
		for (int i = 0; i < 5; i++)
			System.out.print("* ");
	}

	static void sameLineVerticalPrint() {
		for (int i = 0; i < 5; i++)
			System.out.println("*");
	}

	static void squarePrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print("* ");
			System.out.println();
		}
	}

	static void rectanglePrint(int row, int col) {
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++)
				System.out.print("* ");
			System.out.println();
		}
	}

	static void aPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || j == n - 1 || i == (n - 1) / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void aPatternAdvancePrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == 0 && j > 0 && j < n - 1) || (j == 0 && i > 0) || (j == n - 1 && i > 0) || i == (n - 1) / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void bPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || j == n - 1 || i == (n - 1) / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void bPatternAdvancePrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == 0 && j < n - 1) || (j == 0) || (i == n - 1 && j > 0 && j < n - 1)
						|| (j == n - 1 && i > 0 && i < n - 1 && i != (n - 1) / 2) || (i == (n - 1) / 2) && j < n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void cPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == 0 || i == n - 1) || (j == 0))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void cPatternAdvancePrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == 0 && j > 0) || (i == n - 1 && j > 0) || (j == 0 && i > 0 && i < n - 1))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void dPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void dPatternAdvancePrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == 0 && j < n - 1) || (i == n - 1 && j < n - 1) || j == 0 || (j == n - 1 && i > 0 && i < n - 1))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void ePatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == 0) || (j == 0) || (i == n - 1) || (i == (n - 1) / 2))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void fPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == 0) || (j == 0) || (i == (n - 1) / 2))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void gPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == 0) || (j == 0) || (i == n - 1) || (i == (n - 1) / 2) || (j == n - 1 && i >= (n - 1) / 2))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void gPatternAdvancePrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == 0 && j > 0) || (j == 0 && i > 0 && i < n - 1) || (i == n - 1 && j > 0 && j < n - 1)
						|| (i == (n - 1) / 2 && j < n - 1) || (j == n - 1 && i < n - 1 && i > (n - 1) / 2))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void hPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((j == 0) || (j == n - 1) || (i == (n - 1) / 2))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void iPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == (n - 1) / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void jPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || (i == n - 1 && j <= (n - 1) / 2) || j == (n - 1) / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void jPatternAdvancePrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || (i == n - 1 && j < (n - 1) / 2) || (j == (n - 1) / 2 && i != n - 1))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void kPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || i + j == (n - 1) / 2 || i - j == (n - 1) / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void lPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void lPatternAdvancePrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((j == 0 && i < n - 1) || (i == n - 1 && j > 0))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void mPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || (i == j && j <= (n - 1) / 2) || (i + j == n - 1 && i <= (n - 1) / 2))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void nPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i == j)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void oPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == 0 || i == n - 1) || (j == 0 || j == n - 1))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void oPatternAdvancePrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == 0 && j > 0 && j < n - 1) || (i == n - 1 && j > 0 && j < n - 1)
						|| (j == 0 && i > 0 && i < n - 1) || (j == n - 1 && i > 0 && i < n - 1))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void pPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == (n - 1) / 2 || (j == n - 1 && i <= (n - 1) / 2))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void pPatternAdvancePrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == 0 && j < n - 1) || j == 0 || (i == (n - 1) / 2 && j < n - 1)
						|| (j == n - 1 && i < (n - 1) / 2) && i > 0)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void qPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((j == 0 && i > 0 && i < 3 * (n - 1) / 4) || (i == 0 && j > 0 && j < 3 * (n - 1) / 4)
						|| (i == 3 * (n - 1) / 4 && j > 0 && j < 3 * (n - 1) / 4)
						|| (j == 3 * (n - 1) / 4) && i > 0 && i < 3 * (n - 1) / 4 || (i == j && i >= (n - 1) / 2))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void rPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || i - j == (n - 1) / 2 || (i == 0 && j < (n - 1) / 2)
						|| (i == (n - 1) / 2 && j < (n - 1) / 2) || (j == (n - 1) / 2 && i < (n - 1) / 2) && i > 0)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void sPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || (j == 0 && i <= (n - 1) / 2) || (j == n - 1 && i >= (n - 1) / 2)
						|| i == (n - 1) / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void sPatternAdvancePrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == 0 && j > 0) || (i == n - 1 && j < n - 1) || (j == 0 && i <= (n - 1) / 2 && i > 0)
						|| (j == n - 1 && i > (n - 1) / 2 && i < n - 1) || (i == (n - 1) / 2) && j != n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void tPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == 0) || (j == (n - 1) / 2))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void uPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i == n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void uPatternAdvancePrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((j == 0 && i < n - 1) || (j == n - 1 && i < n - 1) || (i == n - 1 && j > 0 && j < n - 1))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void vPatternPrint(int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void wPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || (i >= (n - 1) / 2 && i + j == n - 1) || (i == j && j >= (n - 1) / 2))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void xPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void yPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((j == (n - 1) / 2 && i >= (n - 1) / 2) || (i + j == n - 1 && i <= (n - 1) / 2)
						|| (i == j && j <= (n - 1) / 2))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	static void zPatternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i + j == n - 1 || i == n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sameLineHorizontalPrint();
		// sameLineVerticalPrint();
		// squarePrint(5);
		// rectanglePrint(5,3);
		// aPatternPrint(5); // done
		// aPatternAdvancePrint(5); // done
		// bPatternPrint(5); // done
		// bPatternAdvancePrint(5); //done
		// cPatternPrint(5); //done
		// cPatternAdvancePrint(5); //done
		// dPatternPrint(5); //done
		// dPatternAdvancePrint(5); //done
		// ePatternPrint(5); //done
		// fPatternPrint(5); //done
		// gPatternPrint(5); //done
		// gPatternAdvancePrint(5); //done
		// hPatternPrint(5); //done
		// iPatternPrint(5); //done
		// jPatternPrint(5); //done
		// jPatternAdvancePrint(5); //done
		// kPatternPrint(11); //done
		// lPatternPrint(5); //done
		// lPatternAdvancePrint(5); //done
		// mPatternPrint(5); //done
		// nPatternPrint(5); //done
		// oPatternPrint(5); //done
		// oPatternAdvancePrint(5); //done
		// pPatternPrint(5); //done
		// pPatternAdvancePrint(5); //done
		// qPatternPrint(8);
		// rPatternPrint(8); //done
		// sPatternPrint(5); //done
		// sPatternAdvancePrint(5); //done
		// tPatternPrint(5); //done
		// uPatternPrint(5); //done
		// uPatternAdvancePrint(5); //done
		// vPatternPrint(5,9); //done
		// wPatternPrint(7); //done
		// xPatternPrint(5); //done
		// yPatternPrint(5); //done
		// zPatternPrint(5); //done

	}

}
