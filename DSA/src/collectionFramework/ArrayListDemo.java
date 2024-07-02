package collectionFramework;

import java.util.ArrayList;

public class ArrayListDemo {

	// Declare ArrayList
//	ArrayList arrayList2 = new ArrayList(); //AL is Heterogenous list which will contain values from all types.
	public static ArrayList<String> arrayList = new ArrayList<String>(); // Here, Array List will only store String
																			// value with wrapper class set to String

	// ArrayList is derived from the list interface and hence we can also call List
	// to make arraylist
//	List list = new ArrayList();

	// Adding values to an array list
	public static void addElements(String element) {
		arrayList.add(element);
	}

	// Print elements present in an array list
	public static void printElements() {
		for (String string : arrayList) {
			System.out.println(string);
		}
	}

	// Print the size of an array list
	public static int sizeOfArrayList() {
		return arrayList.size();
	}

	public static void main(String[] args) {
		ArrayListDemo.addElements("Hello");
		ArrayListDemo.printElements();
		System.out.println(ArrayListDemo.sizeOfArrayList() + " : Size of Array List");
	}
}
