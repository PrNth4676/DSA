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
		// && colNum >=0 makes sure we don't go out from the matrix while going left
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

	// Search the element in a Sorted Matrix
	public static boolean searchInMatrixTwo(int[][] arr, int target) {
		int rowLength = arr.length, colLength = arr[0].length;
		int rowNum = rowLength - 1, colNum = 0;
		// rowNum >= 0 makes sure we travel to the up but not go out
		// && colNum < colLength makes sure we don't go out from the matrix while going
		// right
		while (rowNum >= 0 && colNum < colLength) {
			if (arr[rowNum][colNum] == target)
				return true;
			else if (arr[rowNum][colNum] < target) {
				// Go Right
				colNum++;
			} else {
				// Go Up
				rowNum--;
			}
		}
		return false;
	}

	// Solved it using the efficiency in Space
	public static void setZeroesInMatrix(int[][] arr) {
		int rowLength = arr.length;
		int colLength = arr[0].length;
		boolean[] rowCheck = new boolean[rowLength];
		boolean[] colCheck = new boolean[colLength];
		for (int i = 0; i < rowLength; ++i) {
			for (int j = 0; j < colLength; ++j) {
				if (arr[i][j] == 0) {
					// Marking the particular row and column where we have to set 0
					rowCheck[i] = true;
					colCheck[j] = true;
				}
			}
		}
		// Set the Rows marked set as 'true' to 0
		for (int i = 0; i < rowLength; ++i) {
			if (rowCheck[i] == true) {
				// Set the entire 'ith' row in the matrix to 0
				// We can set it by traversing the column with the row associated
				for (int j = 0; j < colLength; ++j) {
					arr[i][j] = 0;
				}
			}
		}

		// Set the Columns marked set as 'true' to 0
		for (int j = 0; j < colLength; ++j) {
			if (colCheck[j] == true) {
				// Set the entire 'jth' column in the matrix to 0
				// We can set it by traversing the row with the column associated
				for (int i = 0; i < rowLength; ++i) {
					arr[i][j] = 0;
				}
			}
		}
	}

	// Solved it using the even more efficiency in Space
	public static int[][] setZeroesInMatrixEfficient(int[][] arr) {
		int rowLength = arr.length;
		int colLength = arr[0].length;
		boolean zeroRow = false;
		boolean zeroCol = false;

		// Check the 0th row for any zero presence
		for (int j = 0; j < colLength; ++j) { // We can check it by traversing column wise
			if (arr[0][j] == 0) {
				zeroRow = true; // Anywhere in the row it finds 0, then set it to True and get-out from it
				break;
			}
		}

		// Check the 0th column for any zero presence
		for (int i = 0; i < rowLength; ++i) { // We can check it by traversing row wise
			if (arr[i][0] == 0) {
				zeroCol = true; // Anywhere in the column it finds 0, then set it to True and get-out from it
				break;
			}
		}

		// Traversing in the Sub-Matrix without 0th row and 0th column
		for (int i = 1; i < rowLength; ++i) {
			for (int j = 1; j < colLength; ++j) {
				if (arr[i][j] == 0) { // If we find any where its 0
					arr[i][0] = 0; // Mark the entire row as 0
					arr[0][j] = 0; // Mark the entire column as 0
				}
			}
		}
		// Traversing for the row having '0'
		for (int j = 1; j < colLength; ++j) { // Traversing Column-wise
			if (arr[0][j] == 0) {
				// Set the entire column to 0
				for (int i = 1; i < rowLength; ++i) {
					arr[i][j] = 0;
				}
			}
		}

		// Traversing for the column having '0'
		for (int i = 1; i < rowLength; ++i) { // Traversing Row-wise
			if (arr[i][0] == 0) {
				// Set the entire row to 0
				for (int j = 1; j < colLength; ++j) {
					arr[i][j] = 0;
				}
			}
		}

		// Set the 0th row to '0'
		if (zeroRow) {
			for (int j = 0; j < colLength; ++j) { // We can check it by traversing column wise
				arr[0][j] = 0; // Set the entire row to 0
			}
		}

		// Set the 0th column to '0'
		if (zeroCol) {
			for (int i = 0; i < rowLength; ++i) { // We can check it by traversing row wise
				arr[i][0] = 0; // Set the entire column to 0
			}
		}
		return arr;
	}
	
	
	// Q1
	

	public static void main(String[] args) {
//		storeValuesOfStudents();
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		System.out.println("Largest Element in the Array is : " + findMaximumElementInArray(arr));
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
//		searchInMatrix(arr, 11);
//		System.out.println(searchInMatrix(arr, 9));
		int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
		printElementsOfMatrix(setZeroesInMatrixEfficient(matrix));
	}
}
