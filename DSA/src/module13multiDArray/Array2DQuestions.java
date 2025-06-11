package module13multiDArray;

import java.util.ArrayList;
import java.util.List;

public class Array2DQuestions {

	public static List<List<Integer>> createPascalTriangle(int noOfRows) {
		List<List<Integer>> tri = new ArrayList<>();
		for (int i = 0; i < noOfRows; ++i) {
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j <= i; ++j) {
				if (j == 0 || j == i)
					list.add(1);
				else {
					list.add((tri.get(i - 1).get(j) + tri.get(i - 1).get(j - 1)));
				}
			}
			tri.add(list);
		}
		return tri;
	}

	public static List<Integer> returnPascalTriangleRow(int noOfRows) {
		List<List<Integer>> tri = new ArrayList<>();
		for (int i = 0; i <= noOfRows; ++i) {
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j <= i; ++j) {
				if (j == 0 || j == i)
					list.add(1);
				else {
					list.add((tri.get(i - 1).get(j) + tri.get(i - 1).get(j - 1)));
				}
			}
			tri.add(list);
		}
		return tri.get(noOfRows);
	}

	public static void main(String[] args) {
		List<List<Integer>> answer = createPascalTriangle(5);
		for (List<Integer> list : answer) {
			System.out.println(list);
		}
		List<Integer> rows = returnPascalTriangleRow(0);
		for (Integer integer : rows) {
			System.out.print(integer);
		}
	}
}
