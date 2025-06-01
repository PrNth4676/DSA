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
	 * @PrNth4676 @ Summary : Rotate an array using an extra array
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
	 * @PrNth4676 @ Summary : Rotate the same array
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

	public static int[] sortingZeroOnesArray(int[] arr) {
		int n = arr.length;
		int noOfZeroes = 0;
		for (int i = 0; i < n; ++i) {
			if (arr[i] == 0)
				noOfZeroes++;
		}
		for (int j = 0; j < n; ++j) {
			if (j < noOfZeroes)
				arr[j] = 0;
			else
				arr[j] = 1;
		}
		return arr;
	}

	public static int[] sortingZeroOnesArrayUsingTwoPointers(int[] arr) {
		int n = arr.length;
		int zero = 0;
		int one = n - 1;
		while (zero < one) {
			if (arr[zero] == 0)
				zero++;
			else if (arr[one] == 1)
				one--;
			else if (arr[zero] == 1 && arr[one] == 0) {
				arr[zero] = 0;
				arr[one] = 1;
				zero++;
				one--;
			}
		}
		return arr;
	}

	public static int[] sortColors(int[] arr) {
		int noz = 0, noo = 0;
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] == 0)
				noz++;
			else if (arr[i] == 1)
				noo++;
		}
		for (int i = 0; i < arr.length; ++i) {
			if (i < noz)
				arr[i] = 0;
			else if (i < (noz + noo))
				arr[i] = 1;
			else
				arr[i] = 2;
		}
		return arr;
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

	}

	// Solved using Three-pointer approach
	public static int[] sortColorsUsingDutchFlag(int[] arr) {
		int n = arr.length;
		int low = 0, mid = 0, high = n - 1;
		while (mid <= high) {
			if (arr[mid] == 0) {
				swap(arr, mid, low);
				low++;
				mid++;
			} else if (arr[mid] == 1)
				mid++;
			else {
				swap(arr, mid, high);
				high--;
			}
		}
		return arr;
	}

	public static int[] mergeSortedArray(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		// Merging
		while (i < a.length && j < b.length) {
			if (a[i] <= b[j]) {
				c[k] = a[i];
				i++;
			} else {
				c[k] = b[j];
				j++;
			}
			k++;
		}
		// Copy the remaining elements when i reaches the end of array 'a'
		if (i == a.length) {
			while (j != b.length) {
				c[k] = b[j];
				j++;
				k++;
			}
		}
		// Copy the remaining elements when j reaches the end of array 'b'
		else if (j == b.length) {
			while (i != a.length) {
				c[k] = a[i];
				i++;
				k++;
			}
		}
		return c;
	}

	public static int[] mergeSortedArrayInReverse(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int i = (a.length - 1), j = (b.length - 1), k = (c.length - 1);
		// Merging
		while (i >= 0 && j >= 0) {
			if (b[j] >= a[i]) {
				c[k] = b[j];
				j--;
			} else {
				c[k] = a[i];
				i--;
			}
			k--;
		}
		// When i reached the first of array 'a'
		if (i < 0) {
			while (j >= 0) {
				c[k] = b[j];
				j--;
				k--;
			}
		}
		// When j reached the last of array 'b'
		else if (j < 0) {
			while (i >= 0) {
				c[k] = a[i];
				i--;
				k--;
			}
		}
		return c;
	}

	public static int[] mergeSortedArrayInLeetCode(int[] a, int[] b) {
		int[] c = new int[6];
		int i = 0, j = 0, k = 0;
		// Merging
		if (a.length != 0 && b.length != 0) {
			while (a[i] != 0 && b[j] != 0) {
				if ((a[i] != 0) && (a[i] <= b[j])) {
					c[k] = a[i];
					i++;
					k++;
				} else if ((b[j] != 0) && (a[i] >= b[j])) {
					c[k] = b[j];
					j++;
					k++;
				}
			}
			// Copy the remaining elements when i reaches the end of array 'a'
			if (a[i] == 0) {
				while (j != b.length) {
					c[k] = b[j];
					j++;
					k++;
				}
			}
			// Copy the remaining elements when j reaches the end of array 'b'
			else if (b[j] == 0) {
				while (i != a.length) {
					c[k] = a[i];
					i++;
					k++;
				}
			}
		} else {
			if (a.length == 0) {
				while (j < b.length) {
					c[k] = b[j];
					j++;
					k++;
				}
			} else if (b.length == 0) {
				while (i < a.length) {
					c[k] = a[i];
					i++;
					k++;
				}
			}
		}
		return c;
	}

	public static int[] nextGreatestElement(int[] arr) {
		int n = arr.length;
		int[] ans = new int[n];
		// O(n^2) : Brute-Force Approach
//		for (int i = 0; i < n - 1; ++i) {
//			int max = arr[i+1];
//			for (int j = (i + 1); j < n; ++j) {
//				if (arr[j] > max) {
//					max = arr[j];
//				}
//			}
//			ans[i] = max;
//		}
		// O(n) : Optimized Approach
		int nge = arr[n - 1];
		for (int i = n - 2; i >= 0; --i) {
			ans[i] = nge;
			if (arr[i] > nge) {
				nge = arr[i]; // Find the max
			}
		}
		ans[n - 1] = -1;
		return ans;
	}

	// Assignment Questions

	// Q1
	public static int findProductOfElements(int[] arr) {
		int result = 1;
		for (int i = 0; i < arr.length; ++i) {
			result *= arr[i];
		}
		return result;
	}

	// Q2
	public static int findSecondLargestElement(int[] arr) {
		int max = arr[0];
		int secondMax = arr[0];
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i] != max) { // Filters the max element which is found out in the above iteration
				if (arr[i] > secondMax) {
					secondMax = arr[i];
				}
			}
		}
		return secondMax;
	}

	// Q3
	public static int findSmallestElement(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	// Q4 - Returns the first duplicate element encountered
	public static int findDuplicateElement(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		int result = 0;
		while (i < j) {
			if (arr[i] == arr[j]) {
				result = arr[i];
				break;
			}
			i++;
			j--;
		}
		return result;
	}

	// Q5
	public static int findSmallestMissingPositiveElement(int[] arr) {
		int l = arr.length;
		int result = 0;
		for (int i = 0; i < l - 1; ++i) {
			if (arr[i + 1] - arr[i] > 1) {
				result = arr[i] + 1;
			}
		}
		return result;
	}

	// Q6
	public static int countStrictlyGreater(int[] arr, int element) {
		int count = 0;
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] >= element) {
				count++;
			}
		}
		return count;
	}

	// Q7
	public static int findThreeLargestElement(int[] arr) {
		int max = arr[0];
		int secondMax = arr[0];
		int thirdMax = arr[0];
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i] != max) { // Filters the max element which is found out in the above iteration
				if (arr[i] > secondMax) {
					secondMax = arr[i];
				}
			}
		}
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i] != secondMax && arr[i] != max) {
				if (arr[i] > thirdMax) {
					thirdMax = arr[i];
				}
			}
		}
		return thirdMax;
	}

	// Q8
	public static boolean isArraySorted(int[] arr) {
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i - 1] > arr[i]) {
				return false;
			}
		}
		return true;
	}

	// Q9
	public static int findDiffBetweenSum(int[] arr) {
		int sumOfEven = 0, sumOfOdd = 0;
		for (int i = 0; i < arr.length; ++i) {
			if (i % 2 == 0) {
				sumOfEven += arr[i];
			} else {
				sumOfOdd += arr[i];
			}
		}
		return Math.abs(sumOfOdd - sumOfEven);
	}

	// Q10
	public static int[] updateArray(int[] arr) {
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; ++i) {
			if (i % 2 == 0) {
				result[i] = arr[i] + 10;
			} else {
				result[i] = 2 * arr[i];
			}
		}
		return result;
	}

	// Q11
	public static int uniqueNumberInArray(int[] arr) {
		int unique = 0;
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i - 1] != arr[i]) {
				unique = arr[i - 1];
			}
		}
		return unique;
	}

	// Q12
	public static boolean isArrayPalindrome(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		int count = 0;
		while (i < j) {
			if (arr[i] != arr[j]) {
				break;
			} else {
				count++;
			}
			i++;
			j--;
		}
		if (count > 0) {
			return true;
		} else {
			return false;
		}
	}


	public static void main(String[] args) {
		findRollNumber(20);
//		twoSum(50);
//		reverseArray();
//		rotateAnArray(5);
//		rotateTheSameArray(5);
//		int[] arr = { 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1 };
//		int[] arr = { 0, 0, 0, 1, 1, 1 };
//		int[] result = sortingZeroOnesArrayUsingTwoPointers(arr);
//		int[] arr = { 2, 1, 1, 0, 0, 0, 1, 2, 1, 0, 0, 2, 0, 1 };
//		int[] result = sortColors(arr);
//		int[] result = sortColorsUsingDutchFlag(arr);
//		for (int i : result) {
//			System.out.print(i + " ");
//		}
//		int a[] = { 11, 33, 100, 54, 79, 33, 1 };
//		int b[] = { 26, 54, 69, 80, 90 };
//		int c[] = mergeSortedArrayInReverse(a, b);
//		int c[] = mergeSortedArray(a, b);
//		int a[] = { 1, 2, 3, 0, 0, 0 };
//		int b[] = { 2, 5, 6 };
//		int c[] = mergeSortedArrayInLeetCode(a, b);
//		for (int i : c) {
//			System.out.print(i + " ");
//		}
//		int[] result = nextGreatestElement(a);
//		for (int i : result) {
//			System.out.print(i + " ");
//		}
//		System.out.println(findProductOfElements(a));
//		System.out.println(findSecondLargestElement(a));
//		System.out.println(findSmallestElement(a));
//		System.out.println(findDuplicateElement(a));
//		int s[] = { 1, 2, 3, 4, 5, 6 };
//		System.out.println(findSmallestMissingPositiveElement(s));
//		System.out.println(countStrictlyGreater(s, 2));
//		System.out.println(findThreeLargestElement(s));
//		System.out.println(findSecondLargestElement(s));
//		System.out.println(isArraySorted(s));
//		System.out.println(findDiffBetweenSum(s));
//		int[] result = updateArray(s);
//		for (int i : result) {
//			System.out.print(i + " ");
//		}
//		int a[] = { 1, 1, 2, 2, 3, 3, 4, 5, 5 };
//		System.out.println(uniqueNumberInArray(a));
		int a[] = { 1, 2, 3, 4, 3, 2, 1 };
		System.out.println(isArrayPalindrome(a));
	}
}
