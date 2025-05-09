package module11PatternPrinting;

public class TrianglePatternPrinting {

	public static void printRightTriangle(int number) {
		for (int i = 1; i <= number; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print(j + " "); // This will print the numbers
//				System.out.print(i + " "); // This will also print the numbers but in subsequence
//				System.out.print("*"+" "); // This will print '*'
//				System.out.print((char)(64+j)+" "); //This will print Capital Alphabets
			}
			System.out.println();
		}
	}

	public static void printInAlternateRightTriangle(int number) {
		for (int i = 1; i <= number; ++i) {
			for (int j = 1; j <= i; ++j) {
				if (i % 2 != 0) {
					System.out.print(j + " ");
				} else
					System.out.print((char) (64 + j) + " ");
			}
			System.out.println();
		}
	}

	public static void printLeftTriangle(int number) {
		for (int i = 1; i <= number; ++i) {
			for (int j = i; j < number; ++j) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printInvertedLeftTriangle(int number) {
		for (int i = 1; i <= number; ++i) {
			for (int j = number; j >= i; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public static void printInvertedLeftNumberTriangle(int number) {
		for (int i = 1; i <= number; ++i) {
			for (int j = 1; j <= (number + 1 - i); ++j) {
//				System.out.print(i + " ");
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void printSpecialRightTriangle(int number) {
		for (int i = 1; i <= number; ++i) {
			int a = 1;
			for (int j = 1; j <= i; ++j) {
//				System.out.print((2 * j - 1) + " "); // This will print the numbers
				// Second Method
				System.out.print(a + " ");
				a += 2; // It increments the variable by 2 steps
			}
			System.out.println();
		}
	}

	public static void printFloydTriangle(int number) {
		int a = 1;
		for (int i = 1; i <= number; ++i) {
			for (int j = 1; j <= i; ++j) {
//				System.out.print(a + " ");
//				a += 1;
				System.out.print(a++ + " ");
			}
			System.out.println();
		}
	}

	public static void learningPattern() {
		for (int i = 0; i < 4; i++) { // This is the no of rows
//			System.out.println("*****");
//			The above can also be written as
//			System.out.print("******");
//			One can print the no of start using another for-loop
			for (int j = 0; j < 4; j++) { // This is the no of columns
				System.out.print("* ");
			}
			System.out.println(); // This is creating the newline
		}
	}

	public static void main(String[] args) {
//		learningPattern();
//		printRightTriangle(10);
//		printFloydTriangle(5);
//		printSpecialRightTriangle(5);
//		printInAlternateRightTriangle(5);
		printLeftTriangle(5);
//		printInvertedLeftTriangle(5);
//		printInvertedLeftNumberTriangle(5);
	}
}
