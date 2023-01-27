package arrayProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WarmUpProblems {

	public int sumOfArray(int[] inputArr) {
		int sum = 0;
		for (int i = 0; i < inputArr.length; i++) {
			sum += inputArr[i];
		}
		return sum;
	}

	public int printElementAtIndex(int[] inputArr, int index) {
		for (int i = 0; i < inputArr.length; i++) {
			if (i == index) {
				return inputArr[i];
			}
		}
		return 0;
	}

	public int noOfElementsLess(int[] inputArr, int element) {
		int noOfElements = 0;
		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i] <= element) {
				noOfElements++;
			}
		}
		return noOfElements;
	}

	public void printElementsInAlternate(int[] inputArr) {
		for (int i = 0; i < inputArr.length; i += 2) {
			System.out.println(inputArr[i]);
		}
	}

	public String perfectArray(int[] inputArray) {
		int length = inputArray.length;
		for (int i = 0; i < (length / 2); i++) {
			if (inputArray[i] != inputArray[(length - 1) - i]) {
				return "IMPERFECT";
			}
		}
		return "PERFECT";
	}

	public int[] removeElementFromArray(int[] inputArray) {
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
		return inputArray;
	}

	public String isNumberFascinating(int num) {
		/*
		 * int multiplyByTwo = num*2; int multiplyByThree = num*3; int[] numToArray =
		 * new int[9]; for(int i=0;i<numToArray.length;i++) { numToArray[i]=num%100; num
		 * = num/10; }
		 */
		String number = Integer.toString(num);
		number = number.concat(Integer.toString(num * 2));
		number = number.concat(Integer.toString(num * 3));
		String regex = "[0-9]{1}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(number);
		if (m.matches()) {
			return "FASCINATING";
		} else {
			return "NOT FASCINATING";
		}
	}

	public static void main(String[] args) {
		WarmUpProblems problems = new WarmUpProblems();
		int[] inputArray = { 1, 2, 3, 4, 5 };
//		System.out.println(problems.sumOfArray(inputArray));
//		System.out.println(problems.printElementAtIndex(inputArray, 9));
//		System.out.println(problems.noOfElementsLess(inputArray, 7));
//		problems.printElementsInAlternate(inputArray);
//		System.out.println(problems.perfectArray(inputArray));
//		problems.removeElementFromArray(inputArray);
		System.out.println(problems.isNumberFascinating(192));
//		problems.removeElementFromArray(inputArray);
	}
}
