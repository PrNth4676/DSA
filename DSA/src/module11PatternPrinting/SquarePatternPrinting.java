package module11PatternPrinting;

public class SquarePatternPrinting {

	public static void printStarRectangle(int rows, int cols) {
		for (int i = 1; i <= rows; ++i) { // Rows will print the width of the rectangle i.e., no of lines
//			System.out.println("*****");
			// The above line can also be written as
//			System.out.print("******");
//			System.out.println();
			// The internal syso statement can be written as loop where no of stars are
			// printed using loop. This represents the columns i.e., no of stars in each
			// line
			for (int j = 1; j <= cols; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();// This will make the execution move to next line
		}

	}

	public static void printStarSquare(int len) {
		for (int i = 1; i <= len; ++i) { // Rows
			for (int j = 1; j <= len; j++) { // Columns
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public static void printNumberSquare(int len) {
		for (int i = 1; i <= len; ++i) { // Rows
			for (int j = 1; j <= len; j++) { // Columns
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void printAlphabetSquare(int len) {
		for (int i = 1; i <= len; ++i) { // Rows
			for (int j = 1; j <= len; j++) { // Columns
				System.out.print((char) (64 + j) + " "); // 65 is the ASCII value of 'A'
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printStarRectangle(5, 3);
//		printStarSquare(5);
//		printNumberSquare(5);
//		printAlphabetSquare(10);
	}
}
