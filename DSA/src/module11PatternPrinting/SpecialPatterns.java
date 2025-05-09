package module11PatternPrinting;

public class SpecialPatterns {

	public static void printStarPlus(int number) {
		int n = (number / 2) + 1;
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				if (i == n || j == n)
					System.out.print("*" + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}

	public static void printCrossPlus(int number) {
		for (int i = 1; i <= number; ++i) {
			for (int j = 1; j <= number; ++j) {
				// j == i : Condition for First Diagonal Printing
				// (i+j) == (number+1) : Condition for Second Diagonal Printing
				if (j == i || (i + j) == (number + 1))
					System.out.print("*" + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}

	public static void printBinaryTriangle(int number) {
		for (int i = 1; i <= number; ++i) { // Row Iteration
			for (int j = 1; j <= i; ++j) { // Column Iteration
				if (i % 2 != 0) { // Row is ODD
					if (j % 2 != 0) { // Column is ODD
						System.out.print(1 + " "); // Print 1 in Odd Positions
					} else {
						System.out.print(0 + " ");
					}
				} else { // Row is EVEN
					if (j % 2 == 0) { // Column is EVEN
						System.out.print(1 + " "); // Print 1 in Even Positions
					} else {
						System.out.print(0 + " ");
					}
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {
//		printStarPlus(11);
//		printCrossPlus(5);
		printBinaryTriangle(5);
	}
}
