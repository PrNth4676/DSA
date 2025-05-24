package module12Arrays;

public class ArrayQuestions {

	static int[] arr = { 10, 25, 37, 40, 100, 25, 17 };

	public static void findRollNumber(int mark) {
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] < mark) {
				System.out.println("Roll No is : " + i);
			}
		}
	}

	// Returns the elements in the array where the sum is met
	public static void twoSum(int sum) {
		int x = 0;
		for (int i = 0; i < arr.length; ++i) {
			x = arr[i];
			for (int j = (i + 1); j < arr.length; ++j) {
				if ((x + arr[j]) == sum) {
					System.out.print(x + " " + arr[j] + " ");
					break;
				}
			}
		}
	}

	// Reverse the array without using any extra array
	public static void reverseArray() {
		int firstIndex = 0;
		int lastIndex = (arr.length - 1);
		int temp = 0;
		// It can also be written using for loop
		for (int i = 0; i < (arr.length / 2); ++i) {
			// Swap Action
			temp = arr[lastIndex];
			arr[lastIndex] = arr[firstIndex];
			arr[firstIndex] = temp;
			firstIndex++;
			lastIndex--;
		}
		// It can also be written using while loop
		// while (firstIndex <= lastIndex) {
		// temp = arr[lastIndex];
		// arr[lastIndex] = arr[firstIndex];
		// arr[firstIndex] = temp;
		// firstIndex++;
		// lastIndex--;
		// }
		System.out.println();
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	

	/**
	 * @PrNth4676
	 * @ Summary : Rotate an array using an extra array
	 */
	public static void rotateAnArray(int steps) {
		int len = arr.length;
		steps = steps % len;
		int lastIndex = len - steps;
		int[] rotatedArr = new int[arr.length];
		int index = 0;
		int firstIndex = 0;
		while (lastIndex < len) {
			rotatedArr[index] = arr[lastIndex];
			index++;
			lastIndex++;
		}
		while (index < len) {
			rotatedArr[index] = arr[firstIndex];
			index++;
			firstIndex++;
		}
		for (int i : rotatedArr) {
			System.out.print(i + " ");
		}
	}

	public static void reverse(int[] arr, int firstIndex, int lastIndex) {
		while (firstIndex <= lastIndex) {
			int temp = arr[firstIndex];
			arr[firstIndex] = arr[lastIndex];
			arr[lastIndex] = temp;
			firstIndex++;
			lastIndex--;
		}
	}

	/**
	 * @PrNth4676
	 * @ Summary : Rotate the same array
	 */
	public static void rotateTheSameArray(int steps) {
		int len = arr.length;
		steps = steps % len;
		reverse(arr, 0, (len - steps - 1));
		reverse(arr, (len - steps), (len - 1));
		reverse(arr, 0, (len - 1));
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		findRollNumber(20);
		twoSum(50);
		reverseArray();
		rotateAnArray(5);
	}
}
