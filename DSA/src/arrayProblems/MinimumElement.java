package arrayProblems;

public class MinimumElement {

	public int findMinElement(int[] inputArray) {
		int min = inputArray[0];
		if(inputArray.length==0) {
			min=-1;
		} else {
			for(int i=1;i<inputArray.length;i++) {
				if(inputArray[i]<min) {
					min=inputArray[i];
				}
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		int[] inputArray = {2,1,3,4,5,6};
		MinimumElement element = new MinimumElement();
		System.out.println(element.findMinElement(inputArray));
	}

}
