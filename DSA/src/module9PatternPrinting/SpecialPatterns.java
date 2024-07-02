package module9PatternPrinting;

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
				if (j == i || (i + j) == (number + 1))
					System.out.print("*" + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}

	public static void printBinaryTriangle(int number) {
		for (int i = 1; i <= number; ++i) {
			for (int j = 1; j <= i; ++j) {
				if (i % 2 != 0) {
					if (j % 2 != 0) {
						System.out.print(1 + " ");
					} else {
						System.out.print(0 + " ");
					}
				} else {
					if (j % 2 == 0) {
						System.out.print(1 + " ");
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
//		for(int i=1;i<=11;i=i+2) {
//		printCrossPlus(5);
//			Thread.sleep(3000);
//			printCrossPlus(0);
//		}
		printBinaryTriangle(5);
	}
}
