package arrayProblems;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSorted {

	// BRUTE FORCE APPROACH
	public int[] returnTargetArray(int[] inputArray, int target) {
		int[] returnedArray = new int[2];
		int arrLength = inputArray.length;
		int firstIndex = 0;
		int min = inputArray[firstIndex];
		int max = inputArray[arrLength - 1];
		int index = 0;
		while (min + max != target || index != arrLength - 1) {
			if (min + max > target) {
				arrLength--;
				max = inputArray[arrLength - 1];
			} else if (min + max < target) {
				firstIndex++;
				min = inputArray[firstIndex];
			}
			index++;
		}
		returnedArray[0] = min;
		returnedArray[1] = max;
		return returnedArray;
	}

	//CORRECT APPROACH
	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		int diff = 0;
		for (int i = 0; i < nums.length; i++) {
			diff = target - nums[i];
			if (map.containsKey(diff) && map.get(diff) != i) {
				return new int[] { i, map.get(diff) };
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int[] inputArray = { 2, 3, 7, 9, 11 };
		TwoSumSorted sumSorted = new TwoSumSorted();
//		int returnedArray[] = sumSorted.returnTargetArray(inputArray, 13);
		int returnedArray[] = sumSorted.twoSum(inputArray, 13);
		for (int i : returnedArray) {
			System.out.println(i);
		}
	}
}
