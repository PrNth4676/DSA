<<<<<<< HEAD
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
=======
package arrayProblems;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		int noOfZeroes = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				noOfZeroes += 1;
			}
		}
		for (int j = 1; j <= noOfZeroes; j++) {
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] == 0) {
					int temp = nums[i];
					if (temp < 0) {
						if (nums[i + 1] < nums[i] || nums[i + 1] > nums[i]) {
							nums[i] = nums[i + 1];
							nums[i + 1] = temp;
						}
					} else {
						if (nums[i + 1] < nums[i]) {
							nums[i] = nums[i + 1];
							nums[i + 1] = temp;
						} else {
							nums[i] = nums[i + 1];
							nums[i + 1] = temp;
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		MoveZeroes zeroes = new MoveZeroes();
		int[] nums = { 45192, 0, -659, -52359, -99225, -75991, 0, -15155, 27382, 59818, 0, -30645, -17025, 81209, 887,
				64648 };
		zeroes.moveZeroes(nums);
	}
}
>>>>>>> refs/remotes/origin/main
