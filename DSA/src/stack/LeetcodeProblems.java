package stack;

import java.util.Stack;

public class LeetcodeProblems {

	public static boolean balancedBracket(String brackets) {
		char open = '(';
		char closed = ')';
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < brackets.length(); i++) {
			if (brackets.charAt(i) == open) {
				stack.push(open);
			} else if (brackets.charAt(i) == closed && !stack.isEmpty()) {
				stack.pop();
			} else if (stack.isEmpty()) {
				return false;
			}
		}
		if (stack.size() != 0) {
			return false;
		} else {
			return true;
		}
	}

	public static int[] consecutiveSubsequence(int[] arr) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if (stack.isEmpty() || stack.peek() != arr[i]) {
				stack.push(arr[i]);
			} else if (stack.peek() == arr[i]) {
				if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
					stack.pop();
				}
			}
		}
		int[] result = new int[stack.size()];
		for (int i = (result.length - 1); i >= 0; i--) {
			result[i] = stack.pop();
		}
		return result;
	}

	// Important Question : Next Greater Element
	// Time Complexity : O(n^2)
	// Space Complexity : O(1)
	public static int[] nextGreaterElement(int[] arr) {
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = (i + 1); j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					result[i] = arr[j];
					break;
				} else {
					result[i] = -1;
				}
				if (i == (arr.length - 1)) {
					result[i] = -1;
				}
			}
		}
		return result;
	}

	public static int[] nextGreaterElementUsingStack(int[] arr) {
		int l = arr.length;
		int[] result = new int[l];
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(arr[l - 1]);
		result[l - 1] = -1;
		// POP - ANSWER - PUSH
		for (int i = (l - 2); i >= 0; i--) {
			// When the element in array is greater than the top element in stack
			// and continue to do so, till the condition is true
			while (stack.size() > 0 && stack.peek() < arr[i]) {
				// Why ? : We are popping, because at any point in time, we want the stack to
				// contain the greatest Element
				stack.pop(); // POP
			}
			if (stack.isEmpty()) // When stack gets empty and it got empty because the biggest element in the
									// while loop cleared all smaller elements
				result[i] = -1; // ANS
			else
				// When the element in array is smaller than the top element in stack
				// Then, store the top element in the resultant array
				result[i] = stack.peek(); // ANS
			// Push the element under consideration into the stack
			stack.push(arr[i]); // PUSH
		}
		return result;
	}

	// Traverse in Forward // 5 2 4 6 3 5
	public static int[] nextSmallerElementUsingStack(int[] arr) {
		int l = arr.length;
		int[] result = new int[l];
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(arr[l - 1]);
		result[l - 1] = -1;
		// POP - ANSWER - PUSH
		for (int i = (l - 2); i >= 0; i--) {
			while (stack.size() > 0 && stack.peek() >= arr[i]) {
				stack.pop(); // POP
			}
			if (stack.isEmpty())
				result[i] = -1; // ANS
			else
				result[i] = stack.peek(); // ANS
			stack.push(arr[i]); // PUSH
		}
		return result;
	}

	// Traverse in Forward // 5 2 4 6 3 5
	public static int[] nextSmallerElementIndexUsingStack(int[] arr) {
		int l = arr.length;
		int[] result = new int[l];
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(l - 1);
		result[l - 1] = -1;
		// POP - ANSWER - PUSH
		for (int i = (l - 2); i >= 0; i--) {
			while (stack.size() > 0 && arr[stack.peek()] > arr[i]) {
				stack.pop(); // POP
			}
			if (stack.isEmpty()) {
				result[i] = -1; // ANS
			} else {
				result[i] = stack.peek(); // ANS
			}
			stack.push(i); // PUSH
		}
		return result;
	}

	public static int[] previousGreaterElementUsingStack(int[] arr) {
		int l = arr.length;
		int[] result = new int[l];
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(arr[0]);
		result[0] = -1;
		// POP - ANSWER - PUSH
		for (int i = 1; i < l; i++) {
			while (stack.size() > 0 && stack.peek() < arr[i]) {
				stack.pop(); // POP
			}
			if (stack.isEmpty())
				result[i] = -1; // ANS
			else
				// When the element in array is smaller than the top element in stack
				// Then, store the top element in the resultant array, as the top element in
				// stack is the greater than element in array
				result[i] = stack.peek(); // ANS
			stack.push(arr[i]); // PUSH
		}
		return result;
	}

	// Traverse in Forward // 5 2 4 6 3 5
	public static int[] previousSmallerElementUsingStack(int[] arr) {
		int l = arr.length;
		int[] result = new int[l];
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(arr[0]);
		result[0] = -1;
		// POP - ANSWER - PUSH
		for (int i = 1; i < l; i++) {
			while (stack.size() > 0 && stack.peek() > arr[i]) {
				stack.pop(); // POP
			}
			if (stack.isEmpty())
				result[i] = -1; // ANS
			else
				result[i] = stack.peek(); // ANS
			stack.push(arr[i]); // PUSH
		}
		return result;
	}

	// Traverse in Forward // 5 2 4 6 3 5
	public static int[] previousSmallerElementIndexUsingStack(int[] arr) {
		int l = arr.length;
		int[] result = new int[l];
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		result[0] = -1;
		// POP - ANSWER - PUSH
		for (int i = 1; i < l; i++) {
			while (stack.size() > 0 && arr[stack.peek()] > arr[i]) {
				stack.pop(); // POP
			}
			if (stack.isEmpty())
				result[i] = -1; // ANS
			else
				result[i] = stack.peek(); // ANS
			stack.push(i); // PUSH
		}
		return result;
	}

	public static int returnIndexOfArray(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}

	// Good Question
	public static int[] stockPriceSpan(int[] arr) {
		int l = arr.length;
		int[] result = new int[l];
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		result[0] = 0;
		// POP - ANSWER - PUSH
		for (int i = 1; i < l; i++) {
			while (stack.size() > 0 && stack.peek() < arr[i]) {
				stack.pop(); // POP
			}
			if (stack.isEmpty())
				result[i] = 1; // ANSWER
			else
				result[i] = i - returnIndexOfArray(arr, stack.peek()); // ANS
			stack.push(arr[i]); // PUSH
		}
		return result;
	}

	public static int largestRectangularArea(int[] heights) {
		int l = heights.length;
		Stack<Integer> stack = new Stack<Integer>();
		int[] nse = new int[l];
		int[] pse = new int[l];
		// Calculate nse
		stack.push(l - 1);
		for (int i = l - 2; i >= 0; i--) {
			while (stack.size() > 0 && heights[stack.peek()] >= heights[i]) {
				stack.pop();
			}
			if (stack.size() == 0)
				nse[i] = l;
			else {
				nse[i] = stack.peek();
			}
			stack.push(i);
		}
		// Emptying the stack for re-use
		while (stack.size() > 0)
			stack.pop();
		// Calcuate pse
		stack.push(0);
		pse[0]=-1;
		for (int i = 1; i < l; i++) {
			while (stack.size() > 0 && heights[stack.peek()] >= heights[i]) {
				stack.pop();
			}
			if (stack.size() == 0)
				pse[i] = -1;
			else {
				pse[i] = stack.peek();
			}
			stack.push(i);
		}
		//Calculate Max Area of Rectangle
		int maxArea=0;
		for(int i=0;i<l;i++) {
			int area = heights[i]*(nse[i]-pse[i]-1);
			if(maxArea<area) {
				maxArea=area;
			}
		}
		return maxArea;
	}
	
	public static int getMinValue(int value) {
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> minimum = new Stack<Integer>();
		if(stack.size()==0) {
			stack.push(value);
			minimum.push(value);
		} else {
			stack.push(value);
			if(minimum.peek()<value) {
				minimum.push(minimum.peek());
			} else {
				minimum.push(value);
			}
		}
		return minimum.peek();
	}
	

	public static void main(String[] args) {
//		System.out.println(LeetcodeProblems.balancedBracket("()())"));
//		int[] inputArr = { 1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2 };
//		int[] resultArr = LeetcodeProblems.consecutiveSubsequence(inputArr);
//		for (int i : resultArr) {
//			System.out.print(i + " ");
//		}
//		int[] inputArr = { 1, 5, 3, 2, 1, 6, 3, 4 };
//		int[] inputArr = { 100, 80, 60, 70, 60, 75, 85 };
//		int[] resultsArr = LeetcodeProblems.nextGreaterElement(inputArr);
//		int[] resultsArr = LeetcodeProblems.nextGreaterElementUsingStack(inputArr);
//		for (int i : resultsArr) {
//			System.out.print(i + " ");
//		}
//		int[] indexArr = LeetcodeProblems.stockPriceSpan(inputArr);
//		for (int i : indexArr) {
//			System.out.print(i + " ");
//		}
//		int[] inputArr = { 5, 2, 4, 6, 3, 5 };
//		int[] nseArr = LeetcodeProblems.previousSmallerElementIndexUsingStack(inputArr);
//		int[] nseArr = LeetcodeProblems.nextSmallerElementIndexUsingStack(inputArr);
//		for (int i : nseArr) {
//			System.out.print(i + " ");
//		}
		int[] heights = {2,1,5,6,2,3};
//		System.out.println("Maxmium Area : "+LeetcodeProblems.largestRectangularArea(heights));
		for (int i : heights) {
			System.out.println(LeetcodeProblems.getMinValue(i));
		}
	}
}
