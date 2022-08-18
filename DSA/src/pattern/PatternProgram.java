package pattern;

public class PatternProgram {

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
		for(int i=0;i<size;i++) {
			for(int j=size-1;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//REDO AGAIN ON 19-08-2022
	public void rightDownTriangle(int size) {
		for(int i=0;i<size;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=size;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PatternProgram program = new PatternProgram();
//		program.squarePattern(5);
//		program.hollowSquare(5);
//		program.leftTriangleStarPattern(5);
//		program.rightTriangleStarPattern(5);
//		program.leftDownTriangle(5);
		program.rightDownTriangle(5);
	}
}
