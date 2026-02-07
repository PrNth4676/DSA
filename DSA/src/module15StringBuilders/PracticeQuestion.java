package module15StringBuilders;

public class PracticeQuestion {

	// Q1 : Update in Odd Positions
	public static void updateInOddPositions(String str) {
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < str.length(); ++i) {
			if (i % 2 != 0) {
				sb.setCharAt(i, '#');
			}
		}
		System.out.println(sb.toString());
	}

	// Q2 : Count no of consonants present in a String
	public static void countConsonants(String str) {
		int count = 0;
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		StringBuilder builder = new StringBuilder(str);
		for (int i = 0; i < builder.length(); ++i) {
			char ch = builder.charAt(i);
			if (Character.isLetter(ch)) {
				boolean isVowel = false;
				for (char vowel : vowels) {
					if (ch == vowel) {
						isVowel = true;
						break;
					}
				}
				if (!isVowel) {
					count++;
				}
			}
		}
		System.out.println("Number of consonants: " + count);
	}

	// Q3 : Check whether a String is Palindrome or not
	public static void isPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		String reversedStr = sb.reverse().toString();
		if (str.equals(reversedStr)) {
			System.out.println(str + " is a palindrome.");
		} else {
			System.out.println(str + " is not a palindrome.");
		}
	}

	// Q4 : Reverse 2nd-half of the string
	public static void reverseHalfOfString(String str) {
		if (str.length() % 2 != 0) {
			System.out.println("Please Enter an even-sized String");
			return;
		}
		// Split the String in half
		int mid = str.length() / 2;
		String firstHalf = str.substring(0, mid);
		String secondHalf = str.substring(mid);

		// Reverse the secondHalf of the string using StringBuilder
		String reverseSecondHalf = new StringBuilder(secondHalf).reverse().toString();
		System.out.println("String modified to : " + (firstHalf + reverseSecondHalf));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		updateInOddPositions("Pratik");
		countConsonants("Pratik");
		isPalindrome("madam");
		reverseHalfOfString("abracadabra");
	}
}
