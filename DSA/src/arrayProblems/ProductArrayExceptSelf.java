package arrayProblems;

public class ProductArrayExceptSelf {

	// BRUTE FORCE TECHNIQUE
	public int[] productExceptSelf(int[] inputArr) {
		int[] returnedArray = new int[inputArr.length];
		for (int index = 0; index < inputArr.length; index++) {
			int lhsTotal = 1;
			int rhsTotal = 1;
			if (index != inputArr.length - 1) {
				for (int i = index + 1; i < inputArr.length; i++) {
					rhsTotal = rhsTotal * inputArr[i];
				}
			}
			if (index != 0) {
				for (int i = 0; i < index; i++) {
					lhsTotal = lhsTotal * inputArr[i];
				}
			}
			returnedArray[index] = rhsTotal * lhsTotal;
		}
		return returnedArray;
	}

	// O(n) Time Complexity and O(1) Space Complexity
	public int[] productExceptSelfOptimized(int[] inputArr) {
		int[] returnedArray = new int[inputArr.length];
		returnedArray[0] = 1;
		int R = 1;
		for (int i = 1; i < inputArr.length; i++) {
			returnedArray[i]=returnedArray[i-1]*inputArr[i-1];
		}
		for (int j=inputArr.length-2;j>=-1;j--) {
			returnedArray[j+1] = returnedArray[j+1]*R;
			R = R*inputArr[j+1];
		}
		return returnedArray;
	}

	public static void main(String[] args) {
//		int[] inputArray = { 1, 2, 3, 4 };
		int[] inputArray = {-1,1,0,-3,3};
		ProductArrayExceptSelf exceptSelf = new ProductArrayExceptSelf();
//		exceptSelf.productExceptSelf(inputArray);
		exceptSelf.productExceptSelfOptimized(inputArray);
	}
}
