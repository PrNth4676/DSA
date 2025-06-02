package module13multiDArray;

public class Basics2DArray {

	// 2D Array is a Grid, a Matrix containing data type of similar type

	public static void main(String[] args) {

		// Declaration
		int[][] arr = new int[3][4]; // It means there are 3 rows and 4 columns

		// Initialization
		arr[0][0] = 7;
		arr[1][2] = 9;

		// In an non-initialized location, the value is set to 0 instead of garbage
		// value
		System.out.println(arr[2][3]);

		// Traverse and initialize values using loop
		int rows = arr.length;
		int cols = 0;
		for (int i = 0; i < rows; ++i) {
			cols = arr[i].length;
			for (int j = 0; j < cols; ++j) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
