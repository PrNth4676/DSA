package module12Arrays;

public class ArrayBasics {

	public static void main(String[] args) {
		// Initialization
		int[] arr = new int[5]; // Here, 100 is the size of array
		// Another way of Initialization where size is not defined.
		int[] arr2 = { 10, 20, 30, 40, 50 };

		// Storing values into array
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(arr[0] + " ");
		// Update value to an element in array
		arr[0] = 99;
		System.out.println(arr[0] + " ");

		// Print Contents of Array
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr2[i] + " ");
		}
	}
}
