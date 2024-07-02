package arrayProblems;

public class SortedArrays {

	public void sortTheArrays(int[] nums1, int m, int[] nums2, int n) {
		for (int i = m; i < m + n; i++) {
			nums1[i] = nums2[i-n];
		}
	}

	public static void main(String[] args) {
		int[] firstArray = { 1};
		int[] secondArray = { 1 };
		SortedArrays sortedArrays = new SortedArrays();
		sortedArrays.sortTheArrays(firstArray, 1, secondArray, 1);
	}
}
