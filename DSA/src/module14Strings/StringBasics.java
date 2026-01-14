package module14Strings;

import java.util.Scanner;

public class StringBasics {

	public static void collectStringFromUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String str = scanner.next();
		System.out.print("Hi ");
		System.out.println(str);
		scanner.close();
	}

	public static boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'A')
			return true;
		if (ch == 'e' || ch == 'E')
			return true;
		if (ch == 'i' || ch == 'I')
			return true;
		if (ch == 'o' || ch == 'O')
			return true;
		if (ch == 'u' || ch == 'U')
			return true;
		return false;
	}

	/** It returns the index of the character in a string **/
	public static int indexOfChar(String str, char ch) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				return i;
			}
		}
		return -1; // char not found
	}

	public static void compareTo(String str1, String str2) {
		// It returns the difference in ASCII values of first non-matching character
		System.out.println(str1.compareTo(str2));
	}

	public static void compareToOwn(String str1, String str2) {
		int len = Math.min(str1.length(), str2.length());
		for (int i = 0; i < len; i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				System.out.println(str1.charAt(i) - str2.charAt(i));
				return;
			}
		}
		// If all characters are same in the min length
		System.out.println(str1.length() - str2.length());
	}

	public static void commonFunctionsOfString(String str) {
		// length()
		int length = str.length();
		System.out.println("Length of string : " + length);

		// charAt()
		for (int i = 0; i < length; i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println();

		// indexOf()
		char ch = 'a';
		int index = indexOfChar(str, ch);
		if (index != -1) {
			System.out.println("Character '" + ch + "' found at index: " + index);
		} else {
			System.out.println("Character '" + ch + "' not found in the string.");
		}

		// contains()
		boolean containsSubstr = str.contains("sub");
		System.out.println("String contains 'sub': " + containsSubstr);

		// startsWith() and endsWith()
		boolean startsWith = str.startsWith("pre");
		boolean endsWith = str.endsWith("post");
		System.out.println("String starts with 'pre': " + startsWith);
		System.out.println("String ends with 'post': " + endsWith);
	}

	/** Sub-String **/
	public static void printSubString(String str) {
		System.out.println(str.substring(2));
		System.out.println(str.substring(1, 4)); // It will print from 1st to (4-1)th index
	}

	/**
	 * @author Pratik
	 * @Method : It prints all the substrings of a string
	 **/
	public static void printAllSubString(String str) {
		for (int i = 0; i < str.length(); ++i) {
			for (int j = i + 1; j <= str.length(); ++j) {
				System.out.print(str.substring(i, j) + " ");
			}
			System.out.println();
		}
	}

	public static void numberToStringConversion() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = scanner.nextInt();
		
		String strNumber = ""; // implicit conversion
		strNumber += number;
		System.out.println("String value : " + strNumber);
		
		String str = Integer.toString(number); // explicit conversion
		System.out.println("String value : " + str);
		scanner.close();
	}
	
	/** It returns the total number of digits in the given number **/
	public static void returnTotalNoOfDigitsInString(int number) {
		int count = Integer.toString(number).length();
		System.out.println("Total number of digits in the string: " + count);
	}
	
	public static void plusOperatorInString() {
		String str1 = "Hello";
//		String str2 = "World";
		int str2 = 10;
		String str3 = str1 + " " + str2; // Concatenation
//		str1 += str2;
//		System.out.println(str1);
		System.out.println(str3);
		System.out.println("abc" + 10 + 20); // abc1020 - left to right evaluation where concatenation happens first
		// as the first operand is a string and following operands are converted to
		// string
		System.out.println(10 + 20 + "abc"); // 30abc - left to right evaluation where addition happens first
	}

	public static void main(String[] args) {
		// String is a char array
		char[] arr = { 'P', 'R', 'A', 'T', 'I', 'K' };
		for (char ele : arr) {
			System.out.print(ele);
		}
		System.out.println();
		// The above char array can be written using String variable
		String str = "Pratik";
		System.out.println(str);
//		collectStringFromUser();
		int lengthOfString = str.length();
		System.out.println(lengthOfString);

		compareTo("apple", "banana");
		compareToOwn("apple", "apricot");

		printAllSubString("abcd");
		plusOperatorInString();
		
//		numberToStringConversion();
//		returnTotalNoOfDigitsInString(123456);
	}
}
