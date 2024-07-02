package arrayProblems;

public class ReverseArray {

	public char[] reverseTheInputArray(char[] originalText) {
		char[] reversedText = new char[originalText.length];
		for (int i = originalText.length - 1; i >= 0; i--) {
			reversedText[(originalText.length - 1) - i] = originalText[i];
		}
		return reversedText;
	}

	public boolean isVowel(char c) {
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U');
	}

	public void reverseVowels(char[] s) {

		int len = s.length;
		int i = 0, j = len - 1;

		while (i < j) {
			while (i < len && !isVowel(s[i])) {
				i++;
			}
			while (j >= 0 && !isVowel(s[j])) {
				j--;
			}
			// SWAP
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		// Original text is as below
//		char[] inputArray = { 'r', 'u', 'f', 'u', 's' };
		ReverseArray reverseArray = new ReverseArray();
//		reverseArray.reverseTheInputArray(inputArray);
		char[] inputs = { 'l', 'e', 'e', 't', 'c', 'o', 'd', 'e' };
		reverseArray.reverseVowels(inputs);
	}
}
