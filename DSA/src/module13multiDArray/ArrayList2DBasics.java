package module13multiDArray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2DBasics {

	public static void main(String[] args) {

		// Initialization
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
	}
}
