package arrayProblems;

public class ConcatenationArray {
	
	public int[] getConcatenation(int[] nums) {
        int[] returnedArray = new int[nums.length*2];
        int length = (returnedArray.length-nums.length);
        for(int i=0;i<nums.length;i++){
            returnedArray[i] = returnedArray[length+i] = nums[i];
        }
        return returnedArray;
    }

	public static void main(String[] args) {
		int[] inputArray = {1,2,1};
		ConcatenationArray array = new ConcatenationArray();
		array.getConcatenation(inputArray);
	}
}
