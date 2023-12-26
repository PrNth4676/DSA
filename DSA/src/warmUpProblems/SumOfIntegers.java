package warmUpProblems;

public class SumOfIntegers {
	
	public static int sumOfIntegers(int[] inputIntegers) {
		int sum=0;
		for(int i=0;i<inputIntegers.length;i++) {
			sum+=inputIntegers[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = {1,2,3,4};
		System.out.println(SumOfIntegers.sumOfIntegers(inputArray));
	}
}
