package module12Arrays;

import java.util.ArrayList;

public class ArrayListBasics {

	// Integer is Wrapper Class
	public static ArrayList<Integer> intList; // Declaration of an ArrayList

	// Initialization Values
	public static void setCapacityOfArrayList(int capacity) {
		intList = new ArrayList<Integer>(capacity);
	}

	// Assigning Values
	public static void setElementsInArrayList(int index, int element) {
		intList.add(index, element);
	}

	// Assigning Values without assigning index
	public static void setElementsInArrayList(int element) {
		intList.add(element); // This will add element at the end of the array
	}

	// Update Values
	public static void updateElementInArray(int index, int element) {
		intList.set(index, element);
	}

	// Remove Values
	public static void removeElementInArray(int index) {
		intList.remove(index);
	}

	// Print Elements of Array
	public static void printElementsOfArrayList() {
//		for (Integer element : intList) {
//			System.out.print(element+" ");
//		}
		// It can also be printed as below
//		System.out.println(intList);
		// It can also be printed using get method
		for (int i = 0; i < intList.size(); ++i) {
			System.out.print(intList.get(i) + " ");
		}
	}

	public static void main(String[] args) {
		setCapacityOfArrayList(5);
		setElementsInArrayList(0, 10);
		setElementsInArrayList(1, 20); // Not declaring a value in sequence will cause Exception
		setElementsInArrayList(2, 30);
		printElementsOfArrayList();
	}
}
