package arrayProblems;

public class MaximumFrequencyCharacter {
	
	public char frequencyOfChar(char[] c) {
		int[] temp = new int[256];
		char max_char = c[0];
		int max_freq = 1;
		for(int i=1;i<c.length;i++) {
			temp[(int)c[i]]++;
			if(temp[(int)c[i]]>max_freq) {
				max_char=c[i];
			}
		}
		return max_char;
	}
	
	public char frequencyOfCharOptimized(char[] c) {
		int[] temp = new int[26];
		char max_char = c[0];
		int max_freq=1;
		for(int i=1;i<c.length;i++) {
			temp[c[i]-'a']++;
			if(temp[c[i]-'a']>max_freq) {
				max_char=c[i];
			}
		}
		return max_char;
	}
	

	public static void main(String[] args) {
		char[] inputChar = {'c','b','a','c'};
		MaximumFrequencyCharacter frequencyCharacter = new MaximumFrequencyCharacter();
		char outPut = frequencyCharacter.frequencyOfChar(inputChar);
		System.out.println(outPut);
		char optOut = frequencyCharacter.frequencyOfChar(inputChar);
		System.out.println(optOut);
	}
}