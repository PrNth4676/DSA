package module13multiDArray;

public class MatrixWaveforms {

	public static void printMatrixInWaveForm(int[][] arr) {
		for (int i = 0; i < arr.length; ++i) { // ROWS
			if (i % 2 == 0) { // Condition for COLUMNS
				for (int j = 0; j < arr[i].length; ++j) {
					System.out.print(arr[i][j] + " ");
				}
			} else {
				for (int j = (arr[i].length - 1); j >= 0; --j) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	public static void printMatrixInWaveFormReverse(int[][] arr) {
		for (int i = 0; i < arr.length; ++i) { // ROWS
			if (i % 2 == 0) { // Condition for COLUMNS
				for (int j = (arr[i].length - 1); j >= 0; --j) {
					System.out.print(arr[i][j] + " ");
				}
			} else {
				for (int j = 0; j < arr[i].length; ++j) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	public static void printTransposeMatrixInWaveForm(int[][] arr) {
		for (int i = 0; i < arr[0].length; ++i) { // COLUMNS
			if (i % 2 == 0) { // Condition for ROWS
				for (int j = (arr.length - 1); j >= 0; --j) {
					System.out.print(arr[j][i] + " ");
				}
			} else {
				for (int j = 0; j < arr.length; ++j) {
					System.out.print(arr[j][i] + " ");
				}
			}
			System.out.println();
		}
	}

	public static void printTransposeMatrixInWaveFormReverse(int[][] arr) {
		for (int i = 0; i < arr[0].length; ++i) { // COLUMNS
			if (i % 2 == 0) { // Condition for ROWS
				for (int j = 0; j < arr.length; ++j) {
					System.out.print(arr[j][i] + " ");
				}
			} else {
				for (int j = (arr.length - 1); j >= 0; --j) {
					System.out.print(arr[j][i] + " ");
				}
			}
			System.out.println();
		}
	}

	public static void printMatrixInSpiral(int[][] arr) {
		int minRow = 0, maxRow = arr.length - 1, minCol = 0, maxCol = arr[0].length - 1;
		while (minRow <= maxRow && minCol <= maxCol) { // Terminating Condition
			// Left to Right
			for (int j = minCol; j <= maxCol; ++j) {
				System.out.print(arr[minRow][j] + " ");
			}
			minRow++;
			// Top to Bottom
			if (minRow > maxRow || minCol > maxCol)
				break;
			for (int i = minRow; i <= maxRow; ++i) {
				System.out.print(arr[i][maxCol] + " ");
			}
			maxCol--;
			// Right to Left
			if (minRow > maxRow || minCol > maxCol)
				break;
			for (int j = maxCol; j >= minCol; --j) {
				System.out.print(arr[maxRow][j] + " ");
			}
			maxRow--;
			// Bottom to Top
			if (minRow > maxRow || minCol > maxCol)
				break;
			for (int i = maxRow; i >= minRow; --i) {
				System.out.print(arr[i][minCol] + " ");
			}
			minCol++;
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		Problems2DArray.printElementsOfMatrix(arr);
//		printMatrixInWaveForm(arr);
//		printMatrixInWaveFormReverse(arr);
//		printTransposeMatrixInWaveForm(arr);
//		printTransposeMatrixInWaveFormReverse(arr);
		printMatrixInSpiral(arr);
	}

}
