package warmUpProblems;

import java.util.HashSet;
import java.util.Set;

public class InfyProblems {

	public static int countVowels(String name) {
		return name.toLowerCase().replaceAll("[^aeiou]", "").length();
	}

	public static int countUniqueCharacters(String value) {
		Set<Character> unique = new HashSet<Character>();
		for (char c : value.toCharArray()) {
			unique.add(c);
		}
		return unique.size();
	}

	public static String returnUniqueConsonants(String name) {
		return name.toLowerCase().replaceAll("[^bcdfghjklmnpqrstvwxyz]", "");
	}

	public static boolean whetherPrime(int number) {
		boolean isPrime = true;
		if (number <= 1)
			isPrime = true;
		for (int i = 2; i <= number / 2; ++i) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	// Q2
	public static boolean provideFreePass(String name) {
		int noOfVowels = countVowels(name);
		int noOfUniqueConsonants = countUniqueCharacters(returnUniqueConsonants(name));
		return (noOfVowels == noOfUniqueConsonants) ? true : false;
	}

	// Q4
	public static int sumOfPrimonacciNumbers(int min, int max) {
		int n1 = 1, n2 = 1, aux = 0, sum = 0;
		if (min == 1) {
			sum += min;
			System.out.print(min + " ");
		}
		while ((aux = n1 + n2) < min) {
			n1 = n2;
			n2 = aux;
		}
		while ((aux = n1 + n2) <= max) {
			if (whetherPrime(aux)) {
				System.out.print(aux + " ");
				sum += aux;
			}
			n1 = n2;
			n2 = aux;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Whether Free Pass ? : " + provideFreePass("Jack mustango"));
		System.out.println("Whether Free Pass ? : " + provideFreePass("Jon norponner"));
//		System.out.println(whetherPrime(18));
		System.out.println(sumOfPrimonacciNumbers(90, 100));
	}
}
