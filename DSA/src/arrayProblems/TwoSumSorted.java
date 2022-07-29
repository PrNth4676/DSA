package arrayProblems;

public class TwoSumSorted {
	
	//BRUTE FORCE APPROACH
	public int[] returnTargetArray(int[] inputArray, int target) {
		int[] returnedArray = new int[2];
		int arrLength = inputArray.length;
		int firstIndex = 0;
		int min = inputArray[firstIndex];
		int max = inputArray[arrLength-1];
		int index = 0;
		while(min+max!=target || index!=arrLength-1) {
			if(min+max>target) {
				arrLength--;
				max = inputArray[arrLength-1];
			} else if(min+max<target) {
				firstIndex++;
				min = inputArray[firstIndex];
			}
			index++;
		}
		returnedArray[0] = min;
		returnedArray[1] = max;
		return returnedArray;
	}
	public static void main(String[] args) {
		int[] inputArray = {2,3,7,9,11};
		TwoSumSorted sumSorted = new TwoSumSorted();
		sumSorted.returnTargetArray(inputArray, 16);
	}
}
