package arrayProblems;

public class ArrayProblemsPartOne {

	public int[] arrangeArrayToRHS(int[] input) {
		int[] arrangedArray = new int[input.length];
		for (int i = 0; i < input.length - 1; i++) {
			int max = input[i + 1];
			int j = i + 1;
			while (j < input.length - i) {
				if (input[j] >= max) {
					max = input[j];
				}
				j++;
			}
			arrangedArray[i] = max;
		}
		arrangedArray[input.length - 1] = -1;
		return arrangedArray;
	}

	// Space Complexity is reduced by using the same input array
	public int[] arrangeArrayToRHSSpace(int[] input) {
		for (int i = 0; i < input.length - 1; i++) {
			int max = input[i + 1];
			int j = i + 1;
			while (j < input.length - i) {
				if (input[j] >= max) {
					max = input[j];
				}
				j++;
			}
			input[i] = max;
		}
		input[input.length - 1] = -1;
		return input;
	}

	// Using Math.max method to bring time complexity to O(n)
	public int[] arrangeArrayToFindMaxElement(int[] input) {
		int temp = input[input.length - 1];
		input[input.length - 1] = -1;
		for (int i = input.length - 2; i >= 0; i--) {
			int x = input[i];
			input[i] = Math.max(input[input.length - 1], temp);
			temp = x;
		}
		return input;
	}

	// Space Complexity is reduced by using the same input array
	public int[] arrangeArrayToRHSIncludingElement(int[] input) {
		for (int i = 0; i < input.length - 1; i++) {
			int max = input[i];
			int j = i + 1;
			while (j < input.length - i) {
				if (input[j] >= max) {
					max = input[j];
				}
				j++;
			}
			input[i] = max;
		}
		return input;
	}

	public int[] arrangeArrayToLHS(int[] input) {
		for (int i = input.length - 1; i > 0; i--) {
			int max = input[i - 1];
			int j = i - 1;
			while (j < i && j != -1) {
				if (input[j] >= max) {
					max = input[j];
				}
				j--;
			}
			input[i] = max;
		}
		input[0] = -1;
		return input;
	}

	//Not completely correct
	public int[] twoSum(int[] nums, int target) {
		int[] resultArr = new int[2];
		int index = 0;
		int max = nums[0];
		int length = nums.length;
		while (length != 1) {
			for (int i = 1; i < length; i++) {
				if (nums[i] > max) {
					max = nums[i];
					index=i;
				}
			}
			length--;
			if(target>max) {
				System.out.println(max);
				System.out.println(index);
				resultArr[1] = index;
				target -= max;
			} else {
				max=nums[0];
			}
		}
		for(int i=0;i<nums.length;i++) {
			if(target==nums[i]) {
				resultArr[0]=i;
			}
		}
		return resultArr;
	}

	public static void main(String[] args) {
		int[] input = { 16, 17, 4, 5, 3, 2 };
//		int[] input = { 6, 2, 6, 5, 3, 1 };
		ArrayProblemsPartOne one = new ArrayProblemsPartOne();
		one.arrangeArrayToRHS(input);
//		one.arrangeArrayToLHS(input);
//		one.arrangeArrayToRHSSpace(input);
//		one.arrangeArrayToFindMaxElement(input);
//		one.arrangeArrayToRHSIncludingElement(input);
		int[] nums = { 2, 7, 11, 15 };
		one.twoSum(nums, 9);
	}
}
