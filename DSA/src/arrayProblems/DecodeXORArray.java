package arrayProblems;

public class DecodeXORArray {

	//BRUTE FORCE METHOD HAVING TIME COMPLEXITY - O(n)
	public int[] decode(int[] encoded, int first) {
		int[] originalArray = new int[encoded.length+1];
		originalArray[0]=first;
		for(int i=1;i<originalArray.length;i++) {
			originalArray[i] = encoded[i-1]^originalArray[i-1];
		}
		return originalArray;
	}

	public static void main(String[] args) {
		int[] encoded = {1,2,3};
		DecodeXORArray xorArray = new DecodeXORArray();
		xorArray.decode(encoded, 1);
	}
}
