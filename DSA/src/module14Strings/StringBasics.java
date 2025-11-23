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
		
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(5));
		
		int lengthOfString = str.length();
		System.out.println(lengthOfString);
	}
}
