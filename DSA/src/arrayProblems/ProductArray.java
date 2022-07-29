package arrayProblems;

public class ProductArray {
	
	public int[] productTheArray(int[] inputString) {
//		int[] resultedArray = new int[inputString.length];
		if(inputString.length==0) {
			return inputString;
		} else if(inputString.length==1) {
			inputString[0] = inputString[0];
			return inputString;
		} else {
			int temp = 0;
			int otherTemp = 0;
			for(int i=0;i<inputString.length-1;i++) {
				temp = inputString[i];
				if(i==0) {
					inputString[i]=temp*inputString[i+1];
					otherTemp = temp;
				} else if(i==1){
					inputString[i]=otherTemp*inputString[i+1];
				} else {
					temp = inputString[i+1];
					inputString[i]=temp*inputString[i+1];
				}
			}
			//For last element
			inputString[inputString.length-1] = inputString[inputString.length-2]*inputString[inputString.length-1];
		}
		return inputString;
	}
	
	
	public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

	public static void main(String[] args) {
		int[] inputArray = {0,2,1,5,3,4};
		ProductArray productArray = new ProductArray();
//		productArray.buildArray(inputArray)
		int[] resultedArray = productArray.productTheArray(inputArray);
		int j=0;
		while(j<resultedArray.length) {
			System.out.print(resultedArray[j]+" ");
			j++;
		}
	}
}
