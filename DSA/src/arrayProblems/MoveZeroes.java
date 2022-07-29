package arrayProblems;

public class MoveZeroes {

	public int[] moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]>nums[i+1]) {
        		int temp = nums[i];
        		nums[i]=nums[i+1];
        		nums[i+1]=temp;
        		i=-1;
        	}
        }
        return nums;
    }
	
	public static void main(String[] args) {
		int inputNums[] = {0,1,0,3,12};
		MoveZeroes zeroes = new MoveZeroes();
		int output[] = zeroes.moveZeroes(inputNums);
		for(int i=0;i<output.length;i++) {
			System.out.println(output[i]);
		}
	}
}
