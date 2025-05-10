package module11PatternPrinting;

public class MorePatternProgram {

	public void squarePattern(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void hollowSquare(int size) {
		for (int i = 0; i < size; i++) {
			if (i == 0 || i == size - 1) {
				for (int j = 0; j < size; j++) {
					System.out.print("*");
				}
			} else {
				for (int k = 0; k < size; k++) {
					if (k == 0 || k == size - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

	public void leftTriangleStarPattern(int size) {
		for (int i = 0; i < size; i++) {
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void rightTriangleStarPattern(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 1; j < size - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void leftDownTriangle(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = size - 1; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// REDO AGAIN ON 19-08-2022
	public void rightDownTriangle(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = size; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void hollowLeftTraingle(int size) {
		for (int i = 0; i < size; i++) {
			if (i == 0 || i == size - 1) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for (int k = 0; k <= i; k++) {
					if (k == 0 || k == i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

	public void pyramid(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void reversePyramid(int size) {
		for (int i = size - 1; i >= 0; i--) {
			for (int j = 0; j < size - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// Start again on 26-08-2022
	public void hollowPyramid(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < 2 * i + 1; k++) {
				if (k == 0 || k == 2 * i) {
					System.out.print("*");
				} else if (i == size - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public void hourglass(int size) {
		for (int i = size - 1; i >= 0; i--) {
			for (int j = 0; j < size - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void rightPascalTriangle(int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = size-1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void casting() {
		int[] arr = {1,2,3,4,5};
		System.out.println(arr);
 	}
	
	public static void main(String[] args) {
		MorePatternProgram program = new MorePatternProgram();
//		program.squarePattern(5);
		program.hollowSquare(5);
//		program.leftTriangleStarPattern(5);
//		program.rightTriangleStarPattern(5);
//		program.leftDownTriangle(5);
//		program.rightDownTriangle(5);
//		program.hollowLeftTraingle(5);
//		program.pyramid(5);
//		program.reversePyramid(5);
//		program.hollowPyramid(5);
//		program.hourglass(100);
//		program.rightPascalTriangle(5);
//		program.casting();
	}
}
