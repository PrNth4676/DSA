package warmUpProblems;

import java.util.ArrayList;
import java.util.List;

public class WarmUpProblemOne {

	public static int sumOfIntegers(int[] inputIntegers) {
		int sum = 0;
		for (int i = 0; i < inputIntegers.length; i++) {
			sum += inputIntegers[i];
		}
		return sum;
	}

	// Print the Element in Array when key is matched with index
	public static int printKeyElement(int[] inputIntegers, int key) {
		int element = 0;
		if (key > inputIntegers.length) {
			element = -1;
		} else {
			for (int i = 0; i < inputIntegers.length; i++) {
				if (key == (i + 1)) {
					element = inputIntegers[i];
				}
			}
		}
		return element;
	}

	// Print the number of elements which are less than or equal to given element N
	public static int elementEqualToN(int[] sortedInput, int N) {
		int count = 0;
		for (int i = 0; i < sortedInput.length; i++) {
			if (sortedInput[i] <= N) {
				count += 1;
			}
		}
		return count;
	}

	// Print the Alternate Elements by position index in an array
	public static void printAlternateElements(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i += 2) {
			System.out.print(inputArray[i] + " ");
		}
	}

	// Return the List whose value is equal to that of its index value
	public static List<Integer> returnElementsEqualingToIndex(int[] inputArray) {
		List<Integer> returnedElement = new ArrayList<Integer>();
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == (i + 1)) {
				returnedElement.add(i + 1);
			}
		}
		return returnedElement;
	}

	// PERFECT ARRAY
	public static String isArrayPerfect(int[] inputArr) {
		int len = inputArr.length;
		int count = 0;
		for (int i = 0; i < len / 2; i++) {
			if (inputArr[i] == inputArr[len - (i + 1)]) {
				count++;
				continue;
			}
		}
		if (count == len / 2) {
			return "PERFECT";
		} else {
			return "NOT PERFECT";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = { 1, 2, 3, 4, 8, 10, 11 };
		System.out.println(WarmUpProblemOne.sumOfIntegers(inputArray));
		System.out.println(WarmUpProblemOne.printKeyElement(inputArray, 5));
		System.out.println(WarmUpProblemOne.elementEqualToN(inputArray, 9));
		WarmUpProblemOne.printAlternateElements(inputArray);
		List<Integer> returnedList = WarmUpProblemOne.returnElementsEqualingToIndex(inputArray);
		for (Integer i : returnedList) {
			System.out.println(i);
		}
		int[] secInputArr = { 1, 2, 3, 4, 3, 2, 1 };
		System.out.println(WarmUpProblemOne.isArrayPerfect(secInputArr));
	}
}
