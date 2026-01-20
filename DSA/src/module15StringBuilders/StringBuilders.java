package module15StringBuilders;

public class StringBuilders {
	
	
	public static void equalityOperators() {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
//		String str1 = "Hello";
//		String str2 = "Hello";

		// == operator checks for reference equality
		if (str1 == str2) {
			// This will be printed since str1 and str2 point to the same string literal in the string pool
			System.out.println("str1 and str2 reference the same object.");
		} else {
			// This will be printed since str1 and str2 are different objects due to 'new' keyword
			System.out.println("str1 and str2 reference different objects.");
		}

		// .equals() method checks for value equality
		if (str1.equals(str2)) {
			System.out.println("str1 and str2 have the same value.");
		} else {
			System.out.println("str1 and str2 have different values.");
		}
	}

	public static void main(String[] args) {
		equalityOperators();
	}
}
