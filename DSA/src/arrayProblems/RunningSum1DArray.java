package arrayProblems;

public class RunningSum1DArray {
	
	public int[] runningSum(int[] nums) {
        int[] returnSums = new int[nums.length];
        int temp=0;
        for(int i=0;i<nums.length;i++) {
            returnSums[i]=nums[i]+temp;
            temp=returnSums[i];
        }
        return returnSums;
    }

	public static void main(String[] args) {
		RunningSum1DArray sum1dArray = new RunningSum1DArray();
		int[] inputSum = {1,2,3,4};
		int[] outputArray = sum1dArray.runningSum(inputSum);
		System.out.print("Running Sum values are : {");
		for (int i : outputArray) {
			System.out.print(" "+i+" ");
		}
		System.out.print("}");
	}

}
