package module13multiDArray;

import java.util.Scanner;

public class Problems2DArray {

	/**
	 * @Description: Stores the roll No. and marks side by side in a 2D Array
	 **/
	public static void storeValuesOfStudents() {
		Scanner sc = new Scanner(System.in);
		int[][] students = new int[4][2];
		for (int i = 0; i < students.length; ++i) {
			for (int j = 0; j < students[i].length; ++j) {
				students[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		sc.close();

		for (int i = 0; i < students.length; ++i) {
			for (int j = 0; j < students[i].length; ++j) {
				System.out.print(students[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * @Description: Returns the maximum element in array
	 **/
	public static int findMaximumElementInArray(int[][] arr) {
		int max = arr[0][0];
		for (int i = 1; i < arr.length; ++i) { // Rows
			for (int j = 1; j < arr[i].length; ++j) { // Columns
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}

	/**
	 * @Description: Returns the Sum of array
	 **/
	public static int findSumOfArray(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; ++i) { // Rows
			for (int j = 0; j < arr[i].length; ++j) { // Columns
				sum += arr[i][j];
			}
		}
		return sum;
	}

	/**
	 * @Description: Returns the Products of array
	 **/
	public static int findProductOfArray(int[][] arr) {
		int product = 1;
		for (int i = 0; i < arr.length; ++i) { // Rows
			for (int j = 0; j < arr[i].length; ++j) { // Columns
				product *= arr[i][j];
			}
		}
		return product;
	}

	/**
	 * @Description: Returns the Sum of Two Matrices with similar size/order
	 **/
	public static int[][] addTwoMatrices(int[][] a, int[][] b) {
		int[][] result = new int[a.length][b.length];
		for (int i = 0; i < result.length; ++i) {
			for (int j = 0; j < result[i].length; ++j) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		return result;
	}

	/**
	 * @Description: Prints the Elements of matrix
	 **/
	public static void printElementsOfMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr[i].length; ++j) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * @Description: Prints the Transpose of matrix
	 **/
	public static void printTransposeOfMatrix(int[][] arr) {
		for (int j = 0; j < arr[0].length; ++j) { // Columns
			for (int i = 0; i < arr.length; ++i) { // Rows
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * @Description: Stores the Transpose of matrix
	 **/
	public static void storeTransposeOfMatrix(int[][] arr) {
		int[][] transpose = new int[arr[0].length][arr.length];
		for (int i = 0; i < arr[0].length; ++i) { // Columns
			for (int j = 0; j < arr.length; ++j) { // Rows
				transpose[i][j] = arr[j][i];
			}
		}
		// Print the Elements after Storing
		printElementsOfMatrix(transpose);
	}

	/**
	 * @Description: Converts the Square Matrix to its Transpose in the same matrix
	 **/
	public static void convertMatrixToTranspose(int[][] arr) {
		for (int i = 0; i < arr.length; ++i) { // Rows
			for (int j = 0; j < i; ++j) { // Similar to Left-Triangle
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		// Print the Matrix
		printElementsOfMatrix(arr);
	}

	/**
	 * @Description: Rotates the Matrix by 90 degrees clock-wise
	 **/
	public static void rotateMatrix(int[][] arr) {

		// TRANSPOSE
		for (int i = 0; i < arr.length; ++i) { // Rows
			for (int j = 0; j < i; ++j) { // Similar to Left-Triangle
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		// REVERSE for each row
		for (int i = 0; i < arr.length; ++i) { // Rows
			// We are reversing an 1D array
			// SWAP between arr[i][firstIndex] and arr[i][lastIndex]
			int f = 0;
			int l = arr[i].length - 1; // Last Index
			while (f <= l) {
				int temp = arr[i][f];
				arr[i][f] = arr[i][l];
				arr[i][l] = temp;
				f++;
				l--;
			}
		}

		// Print the Matrix
		printElementsOfMatrix(arr);
	}

	// Multiple Matrices
	public static int[][] multiplyMatrices(int[][] a, int[][] b) {
		int[][] product = new int[a.length][b[0].length];
		int sum = 0;
		if (a[0].length != b.length) {
			System.out.println("Multiplication Not Possible");
		} else {
			for (int i = 0; i < product.length; ++i) { // ROWS
				for (int j = 0; j < product[i].length; ++j) { // COLUMNS
					for (int k = 0; k < a[i].length; ++k) { // To fetch the length of rows or columns of two matrices
						sum += (a[i][k] * b[k][j]);
					}
					product[i][j] = sum;
				}
			}
		}
		return product;
	}

	// Flipping A Matrix
	public static int flipMatrix(int[][] arr) {
		int m = arr.length, n = arr[0].length;
		for (int i = 0; i < m; ++i) {
			if (arr[i][0] == 0) { // Check if the start of the row has 0, then flip it
				// Flipping the row
				for (int j = 0; j < n; ++j) {
					if (arr[i][j] == 0)
						arr[i][j] = 1;
					else
						arr[i][j] = 0;
				}
			}
		}
		for (int j = 1; j < n; ++j) {
			int noOfZeros = 0, noOfOnes = 0;
			for (int i = 0; i < m; ++i) {
				// Check if the start of the column has 0, then flip it
				if (arr[i][j] == 0)
					noOfZeros++;
				else
					noOfOnes++;
			}
			if (noOfZeros > noOfOnes) {
				// Flipping the Column
				for (int i = 0; i < m; ++i) {
					if (arr[i][j] == 0)
						arr[i][j] = 1;
					else
						arr[i][j] = 0;
				}
			}
		}
		// Converting Binary to Decimal Value
		int score = 0;
		for (int i = 0; i < m; ++i) {
			for (int j = n - 1; j >= 0; --j) {
				score += (arr[i][j] * Math.pow(2, j));
				System.out.print((arr[i][j] * Math.pow(2, j)) + " ");
			}
			System.out.println();
		}
		System.out.println(score);
		return score;
	}

	// Search the element in a Sorted Matrix
	public static boolean searchInMatrix(int[][] arr, int target) {
		int rowLength = arr.length, colLength = arr[0].length;
		int rowNum = 0, colNum = colLength - 1;
		// rowNum < rowLength makes sure we travel to the down but not go out
		// && colNum >=0 makes sure
		// we don't go out from the matrix while travelling left
		while (rowNum < rowLength && colNum >= 0) {
			if (arr[rowNum][colNum] == target)
				return true;
			else if (arr[rowNum][colNum] > target) {
				// Go Left
				colNum--;
			} else {
				// Go Down
				rowNum++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
//		storeValuesOfStudents();
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
//		System.out.println("Largest Element in the Array is : " + findMaximumElementInArray(arr));
//		System.out.println("Sum of the Elements in the Array is : " + findSumOfArray(arr));
//		System.out.println("Product of the Elements in the Array is : " + findProductOfArray(arr));
//		int[][] b = { { 9, 3, 7 }, { 8, 6, 5 }, { 2, 4, 1 } };
//		int[][] result = addTwoMatrices(arr, b);
//		printElementsOfMatrix(result);
//		printTransposeOfMatrix(arr);
//		storeTransposeOfMatrix(arr);
//		rotateMatrix(arr);
//		int[][] b = { { 1 }, { 2 }, { 3 }, { 4 } };
//		int[][] p = multiplyMatrices(arr, b);
//		printElementsOfMatrix(p);
//		int[][] binaryMatrix = { { 0, 0, 1, 1 }, { 1, 0, 1, 0 }, { 1, 1, 0, 0 } };
//		int[][] binaryMatrix = { { 0, 1 }, { 1, 1 } };
//		flipMatrix(binaryMatrix);
		searchInMatrix(arr, 11);
	}

}
