package module11PatternPrinting;

public class CompositePatterns {

	public static void starTriangleVerticallyFlipped(int number) {
		for (int i = 1; i <= number; ++i) {
			for (int j = 1; j <= number; ++j) {
				if ((i + j) > number)
					System.out.print("*" + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}

	// Composite Pattern
	public static void numberTriangleVerticallyFlipped(int number) {
		for (int i = 1; i <= number; ++i) {
			for (int j = 1; j < (number + 1 - i); ++j) {
				System.out.print(" " + " "); // Spaces
			}
			for (int j = 1; j <= i; ++j) {
				System.out.print(j + " "); // Numbers
			}
			System.out.println();
		}
	}

	public static void starRhombus(int number) {
		for (int i = 1; i <= number; ++i) {
			for (int j = 1; j < (number + 1 - i); ++j) {
				System.out.print(" " + " "); // Spaces
			}
			for (int j = 1; j <= number; ++j) {
				System.out.print("*" + " "); // Asterisk
			}
			System.out.println();
		}
	}

	public static void numberRhombus(int number) {
		for (int i = 1; i <= number; ++i) {
			for (int j = 1; j < (number + 1 - i); ++j) {
				System.out.print(" " + " "); // Spaces
			}
			for (int j = 1; j <= number; ++j) {
				System.out.print(j + " "); // Asterisk
			}
			System.out.println();
		}
	}

	public static void starTriangle(int number) {
		for (int i = 1; i <= number; ++i) {
			for (int j = 1; j < (number + 1 - i); ++j) {
				System.out.print(" " + " "); // Spaces
			}
			for (int j = 1; j <= (2 * i - 1); ++j) {
				System.out.print("*" + " "); // Asterisk
			}
			System.out.println();
		}
	}

	public static void starTriangleAlternate(int number) {
		int nsp = number - 1;
		int nst = 1;
		for (int i = 1; i <= number; ++i) {
			for (int j = 1; j <= nsp; ++j) {
				System.out.print(" " + " "); // Spaces
			}
			for (int j = 1; j <= nst; ++j) {
				System.out.print("*" + " "); // Asterisk
			}
			System.out.println();
			nsp--;
			nst += 2;
		}
	}

	public static void main(String[] args) {
//		numberTriangleVerticallyFlipped(5);
//		starRhombus(5);
//		numberRhombus(50);
//		starTriangle(15);
		starTriangleAlternate(5);
	}
}
