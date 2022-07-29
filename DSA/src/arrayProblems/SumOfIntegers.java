package arrayProblems;

import java.util.regex.Pattern;

public class SumOfIntegers {

	public int returnSumOfValues(int[] inputArray) {
		int sum = 0;
		for (int i = 0; i < inputArray.length; i++) {
			sum += inputArray[i];
		}
		return sum;
	}

	public int returnElementPresent(int[] inputArray, int key) {
		int value = 0;
		if (key < 0 || key >= inputArray.length) {
			value = -1;
		} else {
			for (int i = 0; i < inputArray.length; i++) {
				value = inputArray[key];
			}
		}
		return value;
	}

	public int noOfElementsPresent(int[] inputArray, int size) {
		int noOfMatchedElements = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] <= size) {
				noOfMatchedElements++;
			}
		}
		return noOfMatchedElements;
	}

	public int[] returnTheElementsPresent(int[] inputArray, int size) {
		int[] returnArray = new int[inputArray.length];
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] <= size) {
				returnArray[i] = inputArray[i];
			}
		}
		return returnArray;
	}

	public void printElementsInAlternate(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i = i + 2) {
			System.out.print(inputArray[i] + " ");
		}
	}

	public void returnElementEqualToIndex(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == i + 1) {
				System.out.print(inputArray[i] + " ");
			}
		}
	}

	public void isArrayPerfect(int[] inputArray) {
		int noOfIterations = inputArray.length / 2;
		int matchCount = 0;
		for (int i = 0; i < noOfIterations; i++) {
			if (inputArray[i] == inputArray[inputArray.length - (1 + i)]) {
				matchCount++;
			} else {
				System.out.println("IMPERFECT");
				break;
			}
		}
		if (matchCount == noOfIterations) {
			System.out.println("PERFECT");
		}
	}

	public void deleteElementsFromArray(int[] inputArray, int index) {
		int[] revisedArray = new int[inputArray.length - 1];
		for (int i = 0, j = 0; i < inputArray.length; i++) {
			if (j != index) {
				revisedArray[j] = inputArray[i];
				j++;
			}
		}
	}

	public void reduceArray(int[] inputArray) {
		while (inputArray.length != 1) {
			int max = inputArray[0];
			int min = inputArray[0];
			int minIndex = 0;
			int maxIndex = 0;
			for (int i = 1; i < inputArray.length; i++) {
				if (inputArray[i] > max) {
					max = inputArray[i];
					maxIndex = i;
				} else if (inputArray[i] < min) {
					min = inputArray[i];
					minIndex = i;
				}
			}
			int[] anotherArray = new int[inputArray.length - 2];
			for (int j = 0, k = 0; j < inputArray.length; j++) {
				if (j != maxIndex && j != minIndex) {
					anotherArray[k] = inputArray[j];
					k++;
				}
			}
			inputArray = anotherArray;
		}
	}

	public int[] sortTheArray(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				while (inputArray[i] >= inputArray[j]) {
					int temp = inputArray[j];
					inputArray[j] = inputArray[i];
					inputArray[i] = temp;
				}
			}
		}
		return inputArray;
	}

	public int[] printTheElementsUsingWhile(int[] inputArray) {
		int i = 0;
		while (i < inputArray.length) {
			int j = i + 1;
			while (j < inputArray.length) {
				while (inputArray[i] <= inputArray[j]) {
					int temp = inputArray[j];
					inputArray[j] = inputArray[i];
					inputArray[i] = temp;
				}
				j++;
			}
			i++;
		}
		return inputArray;
	}

	public int[] removeTwoGreatest(int[] inputArray) {
		int[] resultedArray = new int[inputArray.length - 2];
		int i = 0;
		while (i < inputArray.length) {
			int j = i + 1;
			while (j < inputArray.length) {
				while (inputArray[i] >= inputArray[j]) {
					int temp = inputArray[j];
					inputArray[j] = inputArray[i];
					inputArray[i] = temp;
				}
				j++;
			}
			i++;
		}
		for (int j = 0, k = 0; j < inputArray.length; j++) {
			if (k != inputArray.length - 1 && k != inputArray.length - 2) {
				resultedArray[k] = inputArray[j];
				k++;
			}
		}
		return resultedArray;
	}

	// Question 9
	public int findTheSumOfArray(int[] inputArray) {
		int sum = 0;
		int entry = 0;
		while (entry < inputArray.length) {
			sum += inputArray[entry];
			entry++;
		}
		return sum;
	}

	// Question 10 - Not Completed
	public void isNumberFascinating(int number) {
		String value = Integer.toString(number).concat(Integer.toString(number * 2))
				.concat(Integer.toString(number * 3));
		int integerValue = Integer.parseInt(value);
		int count = 0;
		while (integerValue != 0) {
			integerValue = integerValue / 10;
			count++;
		}
		String regex = "[1-9]{1}";
		int[] sample = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] inputArray = new int[count];
		int numberCounter = 0;
		for (int i = 0; i < count; i++) {
			inputArray[i] = (int) value.charAt(i);
			for (int j = 0; j < sample.length; j++) {
				if (inputArray[i] == sample[j]) {
					numberCounter++;
				} else {
					System.out.println("PERFECT");
					break;
				}
			}
			if (numberCounter != 1) {
				System.out.println("IMPERFECT");
			}
			;
		}
		System.out.println(Pattern.matches(regex, value));
	}

	// BONUS
	public int[] balancedArray(int[] inputArray) {
		int[] outputArray = new int[inputArray.length + 2];
		if (inputArray.length % 2 != 0) {
			System.out.println("Please enter an array of even length");
		} else {
			int iterator = inputArray.length / 2;
			int start = 0;
			int firstQuadrant = 0;
			int secondQuadrant = 0;
			while (start < iterator) {
				firstQuadrant += inputArray[start];
				start++;
			}
			while (iterator < inputArray.length) {
				secondQuadrant += inputArray[iterator];
				iterator++;
			}
			int diff = Math.abs(secondQuadrant - firstQuadrant);
			if (diff != 0) {
				for (int i = 1; i < outputArray.length - 1; i++) {
					outputArray[i] = inputArray[i - 1];
				}
				outputArray[0] = outputArray[outputArray.length - 1] = diff;
			}
		}
		return outputArray;
	}

	public static void main(String[] args) {
		SumOfIntegers integers = new SumOfIntegers();
		int[] inputArray = { 5, 8, 3, 10, 22 };
		System.out.format("Sum is : %s%n", integers.returnSumOfValues(inputArray));
		System.out.println("Value is : " + integers.returnElementPresent(inputArray, 3));
		System.out.format("Value present is %s%n", integers.noOfElementsPresent(inputArray, 21));
		integers.returnTheElementsPresent(inputArray, 22);
		integers.printElementsInAlternate(inputArray);
		int[] inputArrays = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		integers.returnElementEqualToIndex(inputArrays);
		integers.isArrayPerfect(inputArrays);
		integers.reduceArray(inputArray);
		integers.deleteElementsFromArray(inputArray, 1);
		integers.sortTheArray(inputArray);
		integers.printTheElementsUsingWhile(inputArray);
		integers.removeTwoGreatest(inputArray);
		integers.findTheSumOfArray(inputArray);
		integers.isNumberFascinating(100);
		int[] arrayForBalance = { 1, 2, 1, 2, 1, 3 };
		integers.balancedArray(arrayForBalance);
	}
}
