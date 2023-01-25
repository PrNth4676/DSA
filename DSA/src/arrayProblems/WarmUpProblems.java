package arrayProblems;

public class WarmUpProblems {

	public int sumOfArray(int[] inputArr) {
		int sum = 0;
		for (int i = 0; i < inputArr.length; i++) {
			sum += inputArr[i];
		}
		return sum;
	}

	public int printElementAtIndex(int[] inputArr, int index) {
		for (int i = 0; i < inputArr.length; i++) {
			if (i == index) {
				return inputArr[i];
			}
		}
		return 0;
	}
	
	public int noOfElementsLess(int[] inputArr,int element) {
		int noOfElements=0;
		for(int i=0;i<inputArr.length;i++) {
			if(inputArr[i]<=element) {
				noOfElements++;
			}
		}
		return noOfElements;
	}
	
	public void printElementsInAlternate(int[] inputArr) {
		for(int i=0;i<inputArr.length;i+=2) {
			System.out.println(inputArr[i]);
		}
	}	

	public String perfectArray(int[] inputArray) {
		int length = inputArray.length;
		for(int i=0;i<(length/2);i++) {
			if(inputArray[i]!=inputArray[(length-1)-i]) {
				return "IMPERFECT";
			} 
		}
		return "PERFECT";
	}
	
	
	public static void main(String[] args) {
		WarmUpProblems problems = new WarmUpProblems();
		int[] inputArray = { 1, 2, 3, 2, 1 };
//		System.out.println(problems.sumOfArray(inputArray));
//		System.out.println(problems.printElementAtIndex(inputArray, 9));
//		System.out.println(problems.noOfElementsLess(inputArray, 7));
//		problems.printElementsInAlternate(inputArray);
		System.out.println(problems.perfectArray(inputArray));
	}
}
