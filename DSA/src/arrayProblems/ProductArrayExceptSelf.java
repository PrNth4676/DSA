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

	public static void main(String[] args) {
		int[] inputArray = { 1, 2, 3, 4 };
		ProductArrayExceptSelf exceptSelf = new ProductArrayExceptSelf();
		exceptSelf.productExceptSelf(inputArray);
	}
}
