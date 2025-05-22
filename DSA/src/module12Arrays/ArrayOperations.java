package module12Arrays;

public class ArrayOperations {

	static int[] arr = { 10, 25, 37, 40, 100, 25, 17 };

	/**
	 * @author Pratik
	 * @Summary : Print all elements of Array
	 **/
	public static void printElementsOfArray() {
		for (int element : arr) {
			System.out.print(element + " ");
		}
	}

	/**
	 * @author Pratik
	 * @Summary : Returns the sum of all elements in array
	 **/
	public static int returnSumOfArray() {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	/**
	 * @author Pratik
	 * @Summary : Returns the index of the element in array
	 **/
	public static int returnElementInArray(int element) {
		int index = 0;
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] == element) {
				index = i;
				break;
			} else {
				index = -1;
			}
		}
		return index;
	}

	/**
	 * @author Pratik
	 * @Summary : Returns the maximum element in array
	 **/
	public static int findMaximumElementInArray() {
		int max = arr[0]; // It is not initialized with 0 as it will not work when we have negative
							// elements in array
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	/**
	 * @author Pratik
	 * @Summary : Returns the second maximum element in array
	 **/
	public static int findSecondMaximumElementInArray() {
		int max = arr[0];
		int secondMax = arr[0];
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i] != max) { // Filters the maximum element of the array
				if (arr[i] > secondMax) {
					secondMax = arr[i];
				}
			}
		}
		return secondMax;
	}

	/**
	 * @author Pratik
	 * @Summary : Returns the minimum element in array
	 **/
	public static int findMinimumElementInArray() {
		int min = arr[0]; // It is not initialized with 0 as it will not work when we have negative
							// elements in array
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	/**
	 * @author Pratik
	 * @Summary : Updates an element in Array
	 **/
	public static void updateElementInArray(int element, int index) {
		if (index >= arr.length || index < 0) {
			System.out.println("Invalid Index");
		} else {
			for (int i = 0; i < arr.length; ++i) {
				arr[index] = element;
			}
		}
	}

	/**
	 * @author Pratik
	 * @Summary : Perform Deep-Copy of an Array
	 * @Note : Shallow-Copy happens when we assign an array to an existing one
	 *       directly. Here, a new name to the existing array happens and on
	 *       performing operations on the new array will cause updating the original
	 *       array as well. To avoid it, Deep-Copy needs to be done. // Shallow Copy
	 *       is : arr = copied;
	 **/
	public static int[] copyArray() {
		int[] copied = new int[arr.length];
		for (int i = 0; i < arr.length; ++i) {
			copied[i] = arr[i];
		}
		return copied;
	}

	public static void main(String[] args) {
		int element = 20;
		System.out.println("Element " + element + " is present at index : " + returnElementInArray(element));
		System.out.println("Maximum Element of the Array is : " + findMaximumElementInArray());
		System.out.println("Minimun Element of the Array is : " + findMinimumElementInArray());
		System.out.println("Second Maximum Element in the Array is : " + findSecondMaximumElementInArray());
		updateElementInArray(10, -1);
		printElementsOfArray();
	}
}
