package module11PatternPrinting;

public class AssignmentQuestions {

	// Q1
	public static void printNumberSquare(int number) {
		for (int i = 1; i <= number; ++i) { // ROWS
			for (int j = 1; j <= number; ++j) { // COLUMNS
				System.out.print(i + " "); // Print Numbers
			}
			System.out.println();
		}
	}

	// Q2
	public static void printInvertedLeftHandTriangle(int number) {
		for (int i = number; i > 0; --i) { // ROWS
			for (int j = 1; j <= i; ++j) { // COLUMNS
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	// Q3
	public static void printAlphabetLeftHandTriangle(int number) {
		for (int i = 1; i <= number; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print((char) (64 + j) + " ");
			}
			System.out.println();
		}
	}

	// Q4
	public static void printAlternateTriangle(int number) {
		for (int i = 1; i <= number; ++i) {
			for (int j = 1; j <= i; ++j) {
				if (i % 2 == 0) {
					System.out.print((char) (64 + j) + " ");
				} else {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}

	// Q5
	public static void printArrow(int number) {
		for (int i = 1; i <= number; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		for (int i = (number - 1); i > 0; --i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	// Q10
	public static void printNumberTriangle(int number) {
		for (int i = 1; i <= number; ++i) {
			for (int j = i; j > 0; --j) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	// Q12
	public static void printNumberPyramid(int number) {
		for (int i = 1; i <= number; ++i) {
			for (int j = 1; j <= (number - i); ++j) {
				System.out.print(" " + " ");
			}
			for (int k = 1; k <= (2 * i - 1); ++k) {
				System.out.print(k + " ");
			}
			for (int l = (number - i); l > 0; --l) {
				System.out.print(" " + " ");
			}
			System.out.println();
		}
	}

	// Q13
	public static void printAlphabetPyramid(int number) {
		for (int i = 1; i <= number; ++i) {
			for (int j = 1; j <= (number - i); ++j) {
				System.out.print(" " + " ");
			}
			for (int k = 1; k <= (2 * i - 1); ++k) {
				System.out.print((char) (64 + k) + " ");
			}
			for (int l = (number - i); l > 0; --l) {
				System.out.print(" " + " ");
			}
			System.out.println();
		}
	}

	// Q14
	public static void printAlphabetPatternPyramid(int number) {
		for (int i = 1; i <= number; ++i) {
			for (int j = 1; j <= (number - i); ++j) {
				System.out.print(" " + " ");
			}
			for (int k = 1; k <= (2 * i - 1); ++k) {
				System.out.print((char) (64 + i) + " ");
			}
			for (int l = (number - i); l > 0; --l) {
				System.out.print(" " + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
//		printNumberSquare(5);
//		printInvertedLeftHandTriangle(5);
//		printAlphabetLeftHandTriangle(5);
//		printAlternateTriangle(5);
//		printArrow(5);
//		printNumberTriangle(5);
//		printNumberPyramid(5);
//		printAlphabetPyramid(5);
		printAlphabetPatternPyramid(5);
	}

}
