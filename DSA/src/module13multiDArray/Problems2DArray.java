package module13multiDArray;

import java.util.Iterator;
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
		//Print the Elements after Storing
		printElementsOfMatrix(transpose);
	}

	public static void main(String[] args) {
//		storeValuesOfStudents();
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println("Largest Element in the Array is : " + findMaximumElementInArray(arr));
//		System.out.println("Sum of the Elements in the Array is : " + findSumOfArray(arr));
//		System.out.println("Product of the Elements in the Array is : " + findProductOfArray(arr));
//		int[][] b = { { 9, 3, 7 }, { 8, 6, 5 }, { 2, 4, 1 } };
//		int[][] result = addTwoMatrices(arr, b);
//		printElementsOfMatrix(result);
//		printTransposeOfMatrix(arr);
		storeTransposeOfMatrix(arr);
	}

}
