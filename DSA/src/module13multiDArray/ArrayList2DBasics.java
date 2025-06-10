package module13multiDArray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2DBasics {

	public static void main(String[] args) {

		// Declaration
		List<List<Integer>> array2DList = new ArrayList<>(); // This will create an empty ArrayList where each element
																// is an ArrayList
		int size = 4;
		List<List<Integer>> sizeArray2DList = new ArrayList<>(size); // This will create an empty ArrayList of size 4
																		// where each element is an ArrayList
		int arraySize = 3;
		List<List<Integer>> sizeArray2DList2 = new ArrayList<>(size);
		for (int i = 0; i < size; ++i) {
			sizeArray2DList2.add(new ArrayList<>(arraySize));
		}

		// Initialization
		List<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);

		List<Integer> b = new ArrayList<>();
		b.add(40);
		b.add(50);
		b.add(60);

		List<Integer> c = new ArrayList<>();

		List<Integer> d = new ArrayList<>();
		d.add(70);
		d.add(80);

		array2DList.add(a);
		array2DList.add(b);
		array2DList.add(c);
		array2DList.add(d);

		// Fetch elements using For-Each Loop
		for (List<Integer> l : array2DList) {
			for (Integer i : l) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		// Fetch elements using Get Function in For Loop
		for (int i = 0; i < array2DList.size(); ++i) {
			List<Integer> x = array2DList.get(i);
			for (int j = 0; j < x.size(); ++j) {
				System.out.print(x.get(j) + " ");
			}
			System.out.println();
		}
	}
}
