package stack;

import java.util.Scanner;
import java.util.Stack;

public class BasicsOfStack {
	public static Stack<Integer> stack = new Stack<Integer>(); // Declaration of Stack
	public static Stack<Integer> reverseStack = new Stack<Integer>(); // Declaration of Stack

	// O(1)
	// It adds the element at the first of the stack
	public static void addElementsToStack(int val) {
		stack.push(val);
	}

	// O(1)
	// It shows the element at the top of the stack
	public static int peekElementFromStack() {
		return stack.peek();
	}

	// O(1)
	// It removes the element at the top of the stack
	public static int removeElementFromStack() {
		return stack.pop();
	}

	// Printing the first element of the stack
	public static int fetchElementOfStack(int elementIndex) {
		for (int i = elementIndex; i < stack.size(); i++) {
			removeElementFromStack();
		}
//		//It can also be written using while loop
//		while(stack.size()>elementIndex) {
//			removeElementFromStack();
//		}
		return peekElementFromStack();
	}

	// Printing elements of the stack in LIFO Order
	// Time Complexity : O(n)
	public static void printElementsOfStack() {
		Stack<Integer> integers = new Stack<Integer>();
		while (stack.size() > 0) {
			integers.push(stack.pop());
		}
		while (integers.size() > 0) {
			int x = integers.pop();
			System.out.println(x);
			stack.push(x);
		}
//		int[] arr = new int[stack.size()];
//		//To store the elements in reverse order of the stack which will store the element in correct order in array.
//		for(int i=(arr.length-1);i>=0;i--) {
//			arr[i]=stack.pop();
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]+" ");
//			stack.push(arr[i]);
//		}
	}

	public static void printElementsOfStackInReverseUsingRecursion(Stack<Integer> integers) {
		if (integers.size() == 0)
			return; // BASE CONDITION
		int top = integers.pop();
		System.out.println(top + " ");
		printElementsOfStackInReverseUsingRecursion(integers);
		stack.push(top);
	}

	public static void printElementsOfStackInCorrectUsingRecursion(Stack<Integer> integers) {
		if (integers.size() == 0)
			return; // BASE CONDITION
		int top = integers.pop();
		printElementsOfStackInCorrectUsingRecursion(integers);
		System.out.println(top + " ");
		stack.push(top);
	}

	// Enter values to stack after asking from User
	public static void putElementsToStack() {
		Scanner scanner = new Scanner(System.in);
		int noOfElement;
		System.out.println("Enter the no of elements : ");
		noOfElement = scanner.nextInt();
		for (int i = 0; i < noOfElement; i++) {
			System.out.print("Enter the elements : ");
			int val = scanner.nextInt();
			stack.push(val);
		}
		System.out.println("Elements in Stack are : " + stack);
		scanner.close();
	}

	// Move/Copy elements of stack from one to another in reverse order
	public static void copyStackToNewReverseOrder() {
		while (stack.size() > 0) {
			reverseStack.push(stack.pop());
		}
		System.out.println("Elements stored in New Stack in Reverse Order are : " + reverseStack);
	}

	// Move/Copy elements of stack from one to another in same order
	public static void copyStackToNewSameOrder() {
		Stack<Integer> sameStack = new Stack<Integer>();
		while (reverseStack.size() > 0) {
			sameStack.push(reverseStack.pop());
		}
		System.out.println("Elements stored in New Stack in Same Order are : " + sameStack);
	}

	// Insert element at bottom in Stack
	public static void insertElementAtBeginning(int element) {
		Stack<Integer> tempStack = new Stack<Integer>();
		while (stack.size() > 0) {
			tempStack.push(stack.pop());
		}
		stack.push(element);
		while (tempStack.size() > 0) {
			stack.push(tempStack.pop());
		}
		System.out.println("Elements stored in Stack are : " + stack);
	}

	// Insert element at any particular index in Stack
	public static void insertElementAtIndex(int element, int index) {
		Stack<Integer> tempStack = new Stack<Integer>();
		while (stack.size() > (index - 1)) {
			tempStack.push(stack.pop());
		}
		stack.push(element);
		while (tempStack.size() > 0) {
			stack.push(tempStack.pop());
		}
		System.out.println("Elements stored in Stack are after entering element at index : " + stack);
	}

	// Delete element at bottom in Stack
	public static void deleteElementAtBeginning() {
		Stack<Integer> tempStack = new Stack<Integer>();
		while (stack.size() > 0) {
			tempStack.push(stack.pop());
		}
		while (tempStack.size() > 0) {
			stack.push(tempStack.pop());
		}
		System.out.println("Elements stored in Stack after deleting the first element : " + stack);
	}

	// Delete element at any particular index in Stack
	public static void deleteElementAtIndex(int element, int index) {
		Stack<Integer> tempStack = new Stack<Integer>();
		while (stack.size() > (index - 1)) {
			tempStack.push(stack.pop());
		}
		stack.push(element);
		while (tempStack.size() > 0) {
			stack.push(tempStack.pop());
		}
		System.out.println("Elements stored in Stack are after entering element at index : " + stack);
	}

	// Reverse a Stack using Iterative Solution
	public static void reverseStack() {
		Stack<Integer> tempStack = new Stack<Integer>();
		Stack<Integer> reverseStack = new Stack<Integer>();
		while (stack.size() > 0) {
			tempStack.push(stack.pop());
		}
		while (tempStack.size() > 0) {
			reverseStack.push(tempStack.pop());
		}
		while (reverseStack.size() > 0) {
			stack.push(reverseStack.pop());
		}
		System.out.println(stack);
	}

	public static void pushAtButtom(Stack<Integer> st, int element) {
		if (st.size() == 0) {
			st.push(element); //BASE CONDITION
			return;
		}
		int top = st.pop();
		pushAtButtom(st, element); //CALL
		st.push(top); //TODO
	}

	// Reverse a Stack using Recursive Solution
	public static void reverseStackUsingRecursion(Stack<Integer> st) {
		if (st.size() == 1)
			return; // BASE CONDITION
		int top = st.pop();
		reverseStackUsingRecursion(st); //CALL
		pushAtButtom(st, top); //TODO
	}
	
	//Stack UnderFlow - If stack is empty and we are performing operation like pop and peek
	//Stack OverFlow - If stack is full and we are performing operation like push. This will happen when the memory of the machine is full
	
	//Array Implementation of Stacks
	

	public static void main(String[] args) {
		BasicsOfStack.putElementsToStack();
		BasicsOfStack.reverseStackUsingRecursion(stack);
//		BasicsOfStack.printElementsOfStack();
//		BasicsOfStack.printElementsOfStackInCorrectUsingRecursion(stack);
//		BasicsOfStack.reverseStack();
//		BasicsOfStack.deleteElementAtBeginning();
//		BasicsOfStack.insertElementAtIndex(9, 2);
//		BasicsOfStack.insertElementAtBeginning(5);
//		BasicsOfStack.copyStackToNewReverseOrder();
//		BasicsOfStack.copyStackToNewSameOrder();
//		BasicsOfStack.addElementsToStack(2);
//		BasicsOfStack.addElementsToStack(4);
//		System.out.println("Size of Stack is : " + stack.size());
//		System.out.println(BasicsOfStack.peekElementFromStack());
//		// To print all the elements in stack in Java,
//		System.out.println(stack);
////		BasicsOfStack.removeElementFromStack();
////		System.out.println(stack);
//		System.out.println(fetchElementOfStack(2)); //Here, we are trying to fetch the second element from stacks
//		System.out.println(fetchElementOfStack(1)); //Here, we are trying to fetch the first element from stacks
//		System.out.println(stack.isEmpty());

	}
}
