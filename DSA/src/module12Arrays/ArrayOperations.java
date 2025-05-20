package module12Arrays;

public class ArrayOperations {

	static int[] arr = { 10, 25, 37, 40, 100, 25, 17 };

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

	public static void main(String[] args) {
		int element = 20;
		System.out.println("Element " + element + " is present at index : " + returnElementInArray(element));
		System.out.println("Maximum Element of the Array is : " + findMaximumElementInArray());
		System.out.println("Minimun Element of the Array is : " + findMinimumElementInArray());
	}
}
