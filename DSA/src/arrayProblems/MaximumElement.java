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
		int[] inputArray = {2,1,3,4,5,6};
		MaximumElement element = new MaximumElement();
		System.out.println(element.findMaxElement(inputArray));
	}
}
