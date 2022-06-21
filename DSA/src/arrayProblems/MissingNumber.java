package arrayProblems;

public class MissingNumber {
	
	//Time Complexity - O(n)
	//Space Complexity - O(1)
	public int missingNo(int[] nums) {
		int rangeSum = 0;
        int numsSum = 0;
        for(int i=0;i<nums.length;i++){
            rangeSum += (i+1);
            numsSum += nums[i];
        }
        return rangeSum-numsSum;
	}
	
	//XOR Operation which prevents data-type overflow
	//Time Complexity - O(n)
	//Space Complexity - O(1)
	public int missingNoByXOR(int[] nums) {
		int rangeSum = 0;
        int numsSum = 0;
        for(int i=0;i<nums.length;i++){
            rangeSum ^= (i+1);
            numsSum ^= nums[i];
        }
        return rangeSum^numsSum;
	}
	
	public static void main(String[] args) {
		int[] nums= {3,0,1};
		MissingNumber number = new MissingNumber();
		number.missingNoByXOR(nums);
	}
}
