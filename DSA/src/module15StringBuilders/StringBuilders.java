package module15StringBuilders;

import java.util.Arrays;

public class StringBuilders {

	public static void equalityOperators() {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
//		String str1 = "Hello";
//		String str2 = "Hello";

		// == operator checks for reference equality
		if (str1 == str2) {
			// This will be printed since str1 and str2 point to the same string literal in
			// the string pool
			System.out.println("str1 and str2 reference the same object.");
		} else {
			// This will be printed since str1 and str2 are different objects due to 'new'
			// keyword
			System.out.println("str1 and str2 reference different objects.");
		}

		// .equals() method checks for value equality
		if (str1.equals(str2)) {
			System.out.println("str1 and str2 have the same value.");
		} else {
			System.out.println("str1 and str2 have different values.");
		}
	}

	public static void stringBuilderExample() {
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");
		System.out.println(sb.toString()); // Outputs: Hello World
		System.out.println(sb.length()); // Outputs: 11
		System.out.println(sb.capacity()); // Outputs: 21 (default capacity is 16 + length of initial string i.e.,
											// 5[Hello])
		StringBuilder sb2 = new StringBuilder(10);
		System.out.println(sb2.length()); // Outputs: 0
		System.out.println(sb2.capacity()); // Outputs: 10 (default capacity set to 10 as its explicitly defined)
//		System.out.println(sb.reverse()); // Outputs: dlroW olleH

		// Modifying characters at specific positions which is not possible with String
		// as its Immutable
		sb.setCharAt(0, 'h'); // Changes 'H' to 'h'
		sb.setCharAt(6, 'w'); // Changes 'W' to 'w'
		System.out.println(sb); // Outputs: hello world
	}

	// Toggle Characters in a String
	public static void toggleCharactersInString(String inputString) {
		StringBuilder toggledString = new StringBuilder(inputString);
		for (int i = 0; i < toggledString.length(); ++i) {
			char letter = toggledString.charAt(i);
			int asciiValue = (int) letter;
			if (asciiValue <= 90) { // Capital Letters
				asciiValue += 32;
			} else if (asciiValue >= 97) { // Small Letters
				asciiValue -= 32;
			}
			letter = (char) asciiValue;
			toggledString.setCharAt(i, letter);
		}
		System.out.println(toggledString);
	}

	// Alternative Approach using Character class methods
	public static void toggleCharactersInStringAlternative(String inputString) {
		StringBuilder toggledString = new StringBuilder(inputString);
		for (int i = 0; i < toggledString.length(); ++i) {
			char letter = toggledString.charAt(i);
			if (Character.isUpperCase(letter)) {
				letter = Character.toLowerCase(letter);
			} else if (Character.isLowerCase(letter)) {
				letter = Character.toUpperCase(letter);
			}
			toggledString.setCharAt(i, letter);
		}
		System.out.println(toggledString);
	}

	// Appending different types to StringBuilder
	public static void appendToStringBuilder(StringBuilder sb, String str) {
		sb.append(str);
		System.out.println(sb);
		sb.append(35);
		System.out.println(sb);
		sb.append("*");
		System.out.println(sb);
		int[] arr = { 1, 2, 3, 4, 5 };
		sb.append(arr); // Appending array reference where the address will be printed
		System.out.println(sb);
	}

	// Inserting and Deleting in StringBuilder
	public static void insertAndDeleteInStringBuilder() {
		StringBuilder sb = new StringBuilder("HelloWorld");
		sb.insert(5, " "); // Inserting space at index 5
		System.out.println(sb); // Outputs: Hello World
		sb.delete(5, 6); // Deleting the space we just added
		System.out.println(sb); // Outputs: HelloWorld
		sb.deleteCharAt(4); // Deleting character at index 4 ('o')
		System.out.println(sb); // Outputs: HellWorld
		System.out.println(sb.charAt(4)); // Outputs: o
	}

	// Reverse a StringBuilder without using built-in reverse() method
	public static void reverseStringBuilder(StringBuilder sb) {
		// Reverse without using built-in reverse() method
		int left = 0;
		int right = sb.length() - 1;
		while (left < right) {
			// Swap characters at left and right indices
			char temp = sb.charAt(left);
			sb.setCharAt(left, sb.charAt(right));
			sb.setCharAt(right, temp);
			left++;
			right--;
		}
		System.out.println(sb); // Outputs: olleH
	}

	public static void reverseStringBuilder(StringBuilder sb, int i, int j) {
		// Reverse without using built-in reverse() method
		while (i <= j) {
			// Swap characters
			char temp = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j)); // Replace char at 'i' with char at 'j'
			sb.setCharAt(j, temp);
			i++;
			j--;
		}
	}

	// Reverse Words In Sentences
	public static void reverseWordsInSentences(String sentence) {
		int i = 0, j = 0, n = sentence.length();
		StringBuilder builder = new StringBuilder(sentence);
		while (j < n) {
			if (builder.charAt(j) != ' ') {
				j++;
			} else {
				reverseStringBuilder(builder, i, j - 1);
				i = j + 1;
				j = i;
			}
		}
		// Reverse the Last Word
		reverseStringBuilder(builder, i, j - 1);
		System.out.println(builder);
	}

	// Sorting a String and in StringBuilder lexicographically i.e., dictionary
	// order
	public static void sortString(String str) {
		char[] letters = str.toCharArray();
		// Sort using sort function of Array
		Arrays.sort(letters);
		for (char c : letters) {
			System.out.print(c);
		}
		System.out.println();
	}

	public static void sortStringBuilder(String str) {
		StringBuilder builder = new StringBuilder(str);
		char[] letters = builder.toString().toCharArray();
		// Sort using sort function of Array
		Arrays.sort(letters);
		for (char c : letters) {
			System.out.print(c);
		}
		System.out.println();
	}

	public static void isAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			System.out.println("Not Anagrams");
			return;
		}
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		// Method 1 : Using Arrays.equals() method
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}
		// Method 2 : Finding first non-matching character and verifying if not an
		// anagram
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				System.out.println("First non-matching character: " + arr1[i] + " and " + arr2[i]);
				System.out.println("Since mismatch found, hence not an anagram");
				break;
			}
		}
	}

	// Finding the most occurring character in a string with only lowercase letters
	public static void mostOccuringCharacter(String str) {
		char[] letters = str.toCharArray();
		Arrays.sort(letters); // Sorting the Array
		int[] frequency = new int[26]; // Assuming only lowercase letters where a=0th index, b=1, c=2 ... z=25
		// Calculating Frequency
		for (char c : letters) {
			// Getting the ASCII value offset i.e., 'a' = 97
			int charIndex = c - 'a';
			// Incrementing frequency count for character c by incrementing at its index
			frequency[charIndex]++;
		}
		// Finding Maximum Frequency
		int maxFreq = -1;
		for (int freq : frequency) {
			if (freq > maxFreq) {
				maxFreq = freq;
			}
			// It can also be written as maxFreq = Math.max(maxFreq, freq);
//			maxFreq = Math.max(maxFreq, freq);
		}
		System.out.println("Maximum Occurrence is: " + maxFreq + " with character(s): " + letters[maxFreq - 1]);
	}

	// Checking if two strings are Isomorphic or not
	public static void isIsomorphic(String str1, String str2) {
		if (str1.length() != str2.length()) {
			System.out.println("Not Isomorphic");
			return;
		}
		// One-to-One mapping of characters are only allowed
		char[] a = new char[128];
		for (int i = 0; i < str1.length(); ++i) {
			char c = str1.charAt(i);
			char d = str2.charAt(i);
			int index = (int) c;
			if (a[index] == '\0') {
				a[index] = d;
			} else {
				// If character is already present in the index
				if (a[index] != d) {
					System.out.println("Not Isomorphic");
					return;
				}
			}
		}
		// To check the other way around i.e., str1 with str2
		// Empty the char array for re-use
		for (int i = 0; i < 128; ++i) {
			a[i] = '\0';
		}
		for (int i = 0; i < str1.length(); ++i) {
			char c = str2.charAt(i);
			char d = str1.charAt(i);
			int index = (int) c;
			if (a[index] == '\0') {
				a[index] = d;
			} else {
				// If character is already present in the index
				if (a[index] != d) {
					System.out.println("Not Isomorphic");
					return;
				}
			}
		}
		System.out.println("Isomorphic");
		return;
	}

	// Removing leading zeros from a string
	public static String removeLeadingZeros(String str) {
		int i = 0;
		while (i < str.length() && str.charAt(i) == '0') {
			i++;
		}
		return str.substring(i);
	}

	// Finding the maximum of two numbers represented as strings
	public static String returnMax(String a, String b) {
		String s = removeLeadingZeros(a);
		String t = removeLeadingZeros(b);
		if (s.length() > t.length())
			return a;
		if (s.length() < t.length())
			return b;
		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) != t.charAt(i)) {
				if (s.charAt(i) > t.charAt(i))
					return a;
				else
					return b;
			}
		}
		return a; // If both are equal
	}

	// Finding the maximum numbers from an array of strings containing numbers
	public static void returnMaxValue(String[] str) {
		double maxValue = Double.parseDouble(str[0]);
		for (int i = 1; i < str.length; ++i) {
			double value = Double.parseDouble(str[i]);
			if (value > maxValue) {
				maxValue = value;
			}
		}
		System.out.println("Maximum Value is: " + maxValue);
	}

	// Alternative Approach without using built-in parsing functions
	public static void returnMaxValueAlternative(String[] str) {
		String maxValue = str[0];
		for (int i = 1; i < str.length; ++i) {
			maxValue = returnMax(maxValue, str[i]);
		}
		System.out.println("Maximum Value is: " + maxValue);
	}

	// Compressing a string by replacing consecutive duplicate characters with the
	// character followed by the count of duplicates
	public static String returnCompressedString(String str) {
		StringBuilder compressedString = new StringBuilder();
		char[] letters = str.toCharArray();
		int i = 0, j = 0, length = 0;
		while (j < letters.length) {
			if (letters[i] == letters[j]) {
				j++; // If the letters are equal then just iterate
			} else {
				length = (j - i);
				compressedString.append(letters[i]);
				if (length > 1) {
					compressedString.append(length);
				}
				i = j;
			}
		}
		// Append the last letter
		compressedString.append(letters[i]);
		compressedString.append(j - i);
		System.out.println(compressedString.toString());
		return compressedString.toString();
	}

	public static void main(String[] args) {
//		equalityOperators();
//		stringBuilderExample();
//		toggleCharactersInString("Hello");
//		insertAndDeleteInStringBuilder();
		StringBuilder builder = new StringBuilder("Hello");
		reverseStringBuilder(builder);
		reverseWordsInSentences("I am Pratik Nath");
		sortString("pratik");
		sortStringBuilder("pratik");
		isAnagram("listen", "silent");
		mostOccuringCharacter("abaaacrmnrra");
		isIsomorphic("egg", "add");
		String[] str = { "3143654457474785686865", "-2718", "0025", "0.577" };
//		returnMaxValue(str);
//		returnMaxValueAlternative(str);
		returnCompressedString("aaaabbcddefgg");
	}
}
