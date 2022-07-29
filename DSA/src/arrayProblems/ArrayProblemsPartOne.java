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
	
	//Space Complexity is reduced by using the same input array
	public int[] arrangeArrayToRHSSpace(int[] input) {
		for (int i = 0; i < input.length - 1; i++) {
			int max = input[i + 1];
			int j = i + 1;
			while (j < input.length - i) {
				if (input[j] >= max) {
					max = input[j];
				}
				j++;
			}
			input[i] = max;
		}
		input[input.length - 1] = -1;
		return input;
	}
	
	
	//Using Math.max method to bring time complexity to O(n)
	public int[] arrangeArrayToFindMaxElement(int[] input) {
		int temp = input[input.length-1];
		input[input.length-1]=-1;
		for(int i=input.length-2;i>=0;i--) {
			int x = input[i];
			input[i] = Math.max(input[input.length-1], temp);
			temp = x;
		}
		return input;
	}
	
	//Space Complexity is reduced by using the same input array
		public int[] arrangeArrayToRHSIncludingElement(int[] input) {
			for (int i = 0; i < input.length - 1; i++) {
				int max = input[i];
				int j = i + 1;
				while (j < input.length - i) {
					if (input[j] >= max) {
						max = input[j];
					}
					j++;
				}
				input[i] = max;
			}
			return input;
		}
	
	
	public int[] arrangeArrayToLHS(int[] input) {
		for (int i = input.length - 1; i > 0; i--) {
			int max = input[i - 1];
			int j = i - 1;
			while (j < i && j!=-1) {
				if (input[j] >= max) {
					max = input[j];
				}
				j--;
			}
			input[i] = max;
		}
		input[0] = -1;
		return input;
	}

	public static void main(String[] args) {
		int[] input = { 16, 17, 4, 5, 3, 2 };
//		int[] input = { 6, 2, 6, 5, 3, 1 };
		ArrayProblemsPartOne one = new ArrayProblemsPartOne();
//		one.arrangeArrayToRHS(input);
		one.arrangeArrayToLHS(input);
//		one.arrangeArrayToRHSSpace(input);
//		one.arrangeArrayToFindMaxElement(input);
//		one.arrangeArrayToRHSIncludingElement(input);
	}
}
