package arrayProblems;

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
			// Max and Min value and its respective indexes gets updated in the below for
			// loop
			for (int i = 1; i < inputArray.length; i++) {
				if (inputArray[i] > max) {
					max = inputArray[i];
					maxIndex = i;
				} else if (inputArray[i] < min) {
					min = inputArray[i];
					minIndex = i;
				}
			}
			// Creation of a new array which won't be containing max and min value
			int[] anotherArray = new int[inputArray.length - 2];
			for (int j = 0, k = 0; j < inputArray.length; j++) {
				if (j != maxIndex && j != minIndex) {
					anotherArray[k] = inputArray[j];
					k++;
				}
			}
			// Updating the original input array with the above array
			inputArray = anotherArray;
		}
		return inputArray;
	}

	public int kangarooJump(String input) {
//		String[] listValue = input.split(",");
//        int firstValue = Integer.parseInt(listValue[0]);
//        int lastValue = Integer.parseInt(listValue[1]);
		for (int i = 3, j = 7; i <= 1000; i += 3) {
//            firstValue+=i;
//            lastValue+=j;
			j += 7;
			if (i == j)
				return i;
		}
		return -1;
	}

	public int[][] transpose(int[][] matrix) {
		int[][] myList = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				myList[i][j] = matrix[j][i];
			}
		}
		return myList;
	}

	// BRUTE FORCE
	public int[] twoSum(int[] nums, int target) {
		int[] indexArray = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i != j) {
					if (nums[i] + nums[j] == target) {
						indexArray[0] = i;
						indexArray[1] = j;
						break;
					}
				}
			}
		}
		return indexArray;
	}

	public static void main(String[] args) {
		WarmUpProblems problems = new WarmUpProblems();
		int[] inputArray = { 3, 3 };
//		System.out.println(problems.sumOfArray(inputArray));
//		System.out.println(problems.printElementAtIndex(inputArray, 9));
//		System.out.println(problems.noOfElementsLess(inputArray, 7));
//		problems.printElementsInAlternate(inputArray);
//		System.out.println(problems.perfectArray(inputArray));
//		problems.removeElementFromArray(inputArray);
//		System.out.println(problems.isNumberFascinating(192));
//		problems.removeElementFromArray(inputArray);
//		problems.kangarooJump("200,100");
//		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
//		problems.transpose(matrix);
		problems.twoSum(inputArray, 6);
	}
}
