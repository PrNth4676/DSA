package module15StringBuilders;

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

	public static void main(String[] args) {
//		equalityOperators();
//		stringBuilderExample();
//		toggleCharactersInString("Hello");
//		insertAndDeleteInStringBuilder();
		StringBuilder builder = new StringBuilder("Hello");
		reverseStringBuilder(builder);
		reverseWordsInSentences("Hello World from Java");
	}
}
