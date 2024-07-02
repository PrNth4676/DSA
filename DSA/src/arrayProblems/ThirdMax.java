package arrayProblems;

import java.util.ArrayList;
import java.util.List;

public class ThirdMax {

	public int thirdMax(int[] nums) {
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return 0;
	}

	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> comms = new ArrayList<Integer>();
		int len = nums.length;
		for (int j = 0; j < len; j++) {
			for (int i = 1; i <= len; i++) {
				if (nums[j] != i) {
					comms.add(nums[j]);
				} else {
					continue;
				}
			}
		}
		return comms;
	}

	public static void main(String[] args) {
		ThirdMax max = new ThirdMax();
		int[] nums = { 3, 2, 1 };
//		max.thirdMax(nums);
		max.findDisappearedNumbers(nums);
	}
}
