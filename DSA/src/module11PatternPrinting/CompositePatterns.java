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

	// Composite Pattern - 2 Loops inside 1 Loop
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

	public static void numberRowsTriangleVerticallyLeftFlipped(int number) {
		for (int i = 1; i <= number; ++i) { // ROWS
			for (int j = 1; j <= (number - i); ++j) { // COLUMNS
				System.out.print(" " + " "); // HASH LOOP
			}
			for (int j = 1; j <= i; ++j) { // COLUMNS
				System.out.print(i + " "); // STAR LOOP
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
			// Note : Odd Number Property is used as we are printing odd number of stars
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

	// Number Palindrome using Composite Pattern (3 For Loops)
	public static void numberPalindromePyramid(int number) {
		for (int i = 1; i <= number; ++i) {
			for (int j = 1; j <= (number - i); ++j) {
				System.out.print(" " + " ");
			}
			for (int j = 1; j <= i; ++j) {
				System.out.print(j + " ");
			}
			for (int k = (i - 1); k > 0; --k) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

	public static void starBridge(int number) {
		for (int i = 1; i <= (2 * number - 1); ++i) {
			System.out.print("*" + " "); // First Row
		}
		System.out.println();
		for (int i = 1; i <= number; ++i) {
			for (int j = 1; j <= (number - i); ++j) { // Stars
				System.out.print("*" + " ");
			}
			for (int k = 1; k <= (2 * i - 1); ++k) { // Spaces
				System.out.print(" " + " ");
			}
			for (int l = (number - i); l > 0; --l) { // Stars
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public static void numberBridge(int number) {
		for (int i = 1; i <= (2 * number - 1); ++i) {
			System.out.print(i + " "); // First Row
		}
		System.out.println();
		for (int i = 1; i <= number; ++i) {
			for (int j = 1; j <= (number - i); ++j) { // Left Side of the Bridge
				System.out.print(j + " ");
			}
			for (int k = 1; k <= (2 * i - 1); ++k) { // Spaces
				System.out.print(" " + " ");
			}
			for (int l = (number + i); l <= (2 * number - 1); ++l) { // Right Side of the Bridge
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}

	public static void starDiamond(int number) {
		for (int i = 1; i <= number; ++i) {
			for (int j = 1; j < (number + 1 - i); ++j) {
				System.out.print(" " + " "); // Spaces
			}
			// Note : Odd Number Property is used as we are printing odd number of stars
			for (int j = 1; j <= (2 * i - 1); ++j) {
				System.out.print("*" + " "); // Asterisk
			}
			System.out.println();
		}
		for (int i = number; i >= 1; --i) {
			for (int j = 1; j <= (number + 1 - i); ++j) {
				System.out.print(" " + " "); // Spaces
			}
			// Note : Odd Number Property is used as we are printing odd number of stars but
			// 1 less than odd number
			for (int k = (2 * (i - 1) - 1); k >= 1; --k) {
				System.out.print("*" + " "); // Asterisk
			}
			System.out.println();
		}
	}

	public static void animateText(String text) {
		for (int i = 0; i < text.length(); ++i) {
			for (int k = 0; k < i; ++k) {
				System.out.print(text.charAt(k) + " ");
			}
			System.out.print((char) ((int) text.charAt(i) - 32) + " ");
			for (int j = (i + 1); j < text.length(); ++j) {
				System.out.print(text.charAt(j) + " ");
			}
		}
	}
	
	//TOUGHEST Question
	public static void numberSpiral(int number) {
		for (int i = 1; i <= (2 * number - 1); ++i) {
			for (int j = 1; j <= (2 * number - 1); ++j) {
				int a = i, b = j;
				if (a > number)
					a = 2 * number - i;
				if (b > number)
					b = 2 * number - j;
				System.out.print((number + 1 - Math.min(a, b)) + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
//		numberTriangleVerticallyFlipped(5);
//		numberRowsTriangleVerticallyLeftFlipped(7);
//		starRhombus(5);
//		numberRhombus(10);
		starTriangle(15);
//		starTriangleAlternate(5);
//		starTriangleVerticallyFlipped(5);
//		starDiamond(3);
//		animateText("hello");
//		numberSpiral(5);
	}
}
