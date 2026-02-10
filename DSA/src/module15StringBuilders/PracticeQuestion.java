package module15StringBuilders;

import java.util.Arrays;

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

	// Q5 : Convert a string to integer without using inbuilt functions
	public static int stringToInteger(String str) {
		int result = 0;
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				result = result * 10 + (ch - '0');
			} else {
				throw new IllegalArgumentException("Invalid character in input string: " + ch);
			}
		}
		return result;
	}

	public static int[] stringToIntegerArray(String str) {
		int result = 0;
		int[] resultArray = new int[str.length()];
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				resultArray[i] = result * 10 + (ch - '0');
			} else {
				throw new IllegalArgumentException("Invalid character in input string: " + ch);
			}
		}
		return resultArray;
	}

	// Q6 : Concatenate the reverse of a string to the original string
	public static void concatReverseOfString(String str) {
		String reverseString = new StringBuilder(str).reverse().toString();
		System.out.println(str + reverseString);
	}

	// Q7 : Find the second largest digit in a string consisting of digits from '0'
	// to '9'
	public static int findSecondLargest(String str) {
		int[] intArray = stringToIntegerArray(str);
		int n = intArray.length;
		int max = intArray[0];
		int secondMax = intArray[0];
		for (int i = 1; i < n; ++i) {
			if (intArray[i] > max) {
				max = intArray[i];
			}
		}
		for (int i = 1; i < n; ++i) {
			if (intArray[i] != max) { // Filters the max element which is found out in the above iteration
				if (intArray[i] > secondMax) {
					secondMax = intArray[i];
				}
			}
		}
		return secondMax;
	}

	// Q9 : Check whether anagram or not
	public static boolean whetherAnagram(String string1, String string2) {
		if (string1.length() != string2.length()) {
			System.out.println("Strings are not of same length and cannot be anagrams");
			return false;
		}
		char[] firstString = string1.toCharArray();
		char[] secondString = string2.toCharArray();
		Arrays.sort(firstString);
		Arrays.sort(secondString);
		if (Arrays.equals(firstString, secondString)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		updateInOddPositions("Pratik");
		countConsonants("Pratik");
		isPalindrome("madam");
		reverseHalfOfString("abracadabra");
		stringToInteger("123456");
		stringToIntegerArray("123456");
		concatReverseOfString("pratik");
		System.out.println(findSecondLargest("123859"));
		System.out.println(whetherAnagram("madam", "adamm"));
	}
}
