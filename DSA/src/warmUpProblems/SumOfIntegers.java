package warmUpProblems;

public class SumOfIntegers {
	
	public static int sumOfIntegers(int[] inputIntegers) {
		int sum=0;
		for(int i=0;i<inputIntegers.length;i++) {
			sum+=inputIntegers[i];
		}
		return sum;
	}
	
	//Print the Element in Array when key is matched with index
	public static int printKeyElement(int[] inputIntegers,int key) {
		int element = 0;
		if(key>inputIntegers.length) {
			element = -1;
		} else {
			for(int i=0;i<inputIntegers.length;i++) {
				if(key==(i+1)) {
					element=inputIntegers[i];
				}
			}
		}
		return element;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = {1,2,3,4};
		System.out.println(SumOfIntegers.sumOfIntegers(inputArray));
		System.out.println(SumOfIntegers.printKeyElement(inputArray, 5));
	}
}
