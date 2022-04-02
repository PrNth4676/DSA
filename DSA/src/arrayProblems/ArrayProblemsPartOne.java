package arrayProblems;

public class ArrayProblemsPartOne {

	public int[] arrangeArrayToRHS(int[] input) {
		int[] arrangedArray = new int[input.length];
		for (int i = 0; i < input.length - 1; i++) {
			int max = input[i + 1];
			int j = i + 1;
			while (j < input.length - i) {
				if (input[j] >= max) {
					max = input[j];
				}
				j++;
			}
			arrangedArray[i] = max;
		}
		arrangedArray[input.length - 1] = -1;
		return arrangedArray;
	}

	public static void main(String[] args) {
		int[] input = { 16, 17, 4, 5, 3, 2 };
//		int[] input = { 6, 2, 6, 5, 3, 1 };
		ArrayProblemsPartOne one = new ArrayProblemsPartOne();
		one.arrangeArrayToRHS(input);
	}
}
