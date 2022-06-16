package arrayProblems;

public class WiggleSort {

	public int[] wiggleSort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (i % 2 == 0) {
				if (nums[i] > nums[i + 1]) {
					int temp = nums[i + 1];
					nums[i + 1] = nums[i];
					nums[i] = temp;
				}
			} else {
				if (nums[i] < nums[i + 1]) {
					int temp = nums[i + 1];
					nums[i + 1] = nums[i];
					nums[i] = temp;
				}
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] inputArray = { 4, 5, 1, 2, 6, 3 };
		WiggleSort sort = new WiggleSort();
		int[] returnedArray = sort.wiggleSort(inputArray);
		int i = 0;
		while (i < returnedArray.length) {
			System.out.println(returnedArray[i]);
			i++;
		}
	}
}
