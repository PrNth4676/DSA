package arrayProblems;

public class ProductArray {
	
	public int[] productTheArray(int[] inputString) {
		int[] resultedArray = new int[inputString.length];
		if(inputString.length==0) {
			return inputString;
		} else if(inputString.length==1) {
			resultedArray[0] = inputString[0];
		} else {
			resultedArray[0] = inputString[0]*inputString[1];
			for(int i=1;i<inputString.length-1;i++) {
				resultedArray[i]=inputString[i-1]*inputString[i+1];
			}
			resultedArray[inputString.length-1] = inputString[inputString.length-2]*inputString[inputString.length-1];
		}
		return resultedArray;
	}

	public static void main(String[] args) {
		int[] inputArray = {1,2,3,4,5,6,7,8,9,10};
		ProductArray productArray = new ProductArray();
		int[] resultedArray = productArray.productTheArray(inputArray);
		int j=0;
		while(j<resultedArray.length) {
			System.out.print(resultedArray[j]+" ");
			j++;
		}
	}
}
