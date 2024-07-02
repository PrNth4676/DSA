package arrayProblems;

public class MaximumElement {
	
	public int findMaxElement(int[] inputArray) {
		int max = inputArray[0];
		if(inputArray.length==0) {
			max=-1;
		} else {
			for(int i=1;i<inputArray.length;i++) {
				if(inputArray[i]>max) {
					max=inputArray[i];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
//		int[] inputArray = {2,1,3,4,5,6};
		int[] inputArray = {3, -2, -6, -1, 9, 13, 17, 15, 14, 9, 5};
		MaximumElement element = new MaximumElement();
		System.out.println("Maximum Element is : "+element.findMaxElement(inputArray));
	}
}
