package arrayProblems;

public class ReverseArray {

	public char[] reverseTheInputArray(char[] originalText) {
		char[] reversedText = new char[originalText.length];
		for(int i=originalText.length-1;i>=0;i--) {
			reversedText[(originalText.length-1)-i]=originalText[i];
		}
		System.out.println(reversedText);
		return reversedText;
	}
	
	public static void main(String[] args) {
		//Original text is as below
		char[] inputArray= {'r','u','f','u','s'};
		ReverseArray reverseArray = new ReverseArray();
		reverseArray.reverseTheInputArray(inputArray);
	}
}
