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
	
	//When we try to store value beyond the range of the data-type then, overflow can happen.
	
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
	
	public int singleNumber(int[] nums) {
		int xorSum=0;
		for(int i=0;i<nums.length;i++) {
			xorSum^=nums[i];
		}
		return xorSum;
	}
	
	public static void main(String[] args) {
//		int[] nums= {3,0,1};
		int[] nums= {2,2,1};
		MissingNumber number = new MissingNumber();
//		number.missingNoByXOR(nums);
//		number.missingNo(nums);
		number.singleNumber(nums);
	}
}
