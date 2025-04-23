package module9Loops;

public class LoopsBasics {

	public static void understandIncrements(int number) {
		int pre = ++number; // Increment will happen during execution
		System.out.println(pre);
		int post = number++; // Increment will happen post execution i.e., after the line's execution, the
								// number will be 12 from 11.
		System.out.println(post);
	}

	public static void printHelloWorld(int n) {
		// Here, int i=1 is the declaration/condition which happens once
		// i<=n is the condition till which the loop will run which is checked in every
		// iteration. If the condition is true, only then the execution goes inside the
		// loop
		// i++ means the value of i will be incremented, post the loop run and i=i+1
		int i = 1;
		for (i = 1; i <= n; i++) {
			// Here, i will be 1 2 3 4[at 4, the condition will be false and hence, will not
			// enter into loop.
			System.out.println("Hello World! " + i);
		}
		System.out.println(i);
	}

	public static void printDivisibleBy3Or5(int limit) {
		for (int i = 1; i <= limit; ++i) {
			if (i % 3 == 0 || i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void printMultiplicationTableTill10(int number) {
		// Here, iteration will be happening for each step of which only conditioned
		// will run
//		for (int i = number; i <= (number * 10); ++i) {
//			if (i % number == 0)
//				System.out.print(i + " ");
//		}
		// Efficient Code - where we are iterating by nth step
		for (int i = number; i <= (number * 10); i = i + number) {
			System.out.print(i + " ");
		}
	}

	// Print the AP upto 'n' no of terms
	public static void arithematicProgression(int noOfTerms) {
		// Here, increment is happening by 2 terms
		// We need to go till 2*n-1th term
//		for(int i=1;i<2*noOfTerms-1;i=i+2) { //1 3 5 7 9
//			System.out.print(i+" ");
//		}
//		System.out.println();
		for (int i = 1; i < 3 * noOfTerms + 1; i = i + 3) { // 1 4 7 10 13
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void geometricProgression(int noOfTerms) {
		int a = 3;
		for (int i = 0; i < noOfTerms; i++) {
			System.out.print(a + " ");
			a *= 4;
		}
	}

	// BREAK - Get-out from the entire Iterations
	public static void whetherComposite(int number) {
		int x = 0; // Default value is 0, which is prime
		for (int i = 2; i < number; i++) {
			if (number % i == 0) { // 'i' is a factor of 'n'
				System.out.println(number + " : Number is composite");
				x = 1; // Value is set to 1, when composite
				break;
			}
		}
		if (number == 1) {
			System.out.println("Neither Prime nor Composite");
		} else if (x == 0) {
			System.out.println(number + " : Number is prime");
		}
	}

	// CONTINUE - Skip from a particular Iterations
	public static void printOddNumbers() {
		for (int i = 1; i <= 100; i++) {
//			if(i%2!=0) System.out.print(i+" ");
			// The above line can also be written using continue statement
			if (i % 2 == 0)
				continue;
			System.out.print(i + " ");
		}
		// Another example
		int x = 4, y = 0;
		while (x >= 0) {
			x--;
			y++;
			if (x == y)
				continue; // It means do nothing when the condition is true
			else
				System.out.println(x + " " + y);
		}
	}

	public static void whileLoop() {
		int i = 1; // Initialization
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		// For loop can also be written as while loop similar expression
		for (; i <= 20;) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		// Do-while loop - Print First and then check condition
		// This comes handy, when we want to do at-least one iteration, even-if the
		// condition is false
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= 30);
	}

	public static int fetchNoOfDigits(int number) {
		int count = 0;
//		while (number >= 1) { //It won't work for negative number
		while (number != 0) {
			number /= 10;
			count++;
		}
		return count;
	}

	public static int sumOfDigits(int number) {
		int sum = 0;
		while (number != 0) {
			sum += number % 10; // % gives the last digit of a number
			number /= 10; // It will give the number except the last digit
		}
		return sum;
	}

	public static int sumOfNaturalNumbers(int no) {
		int sum = 0;
		for (int i = 1; i <= no; i++) {
			sum += i;
		}
		return sum;
	}

	public static void multiplicationTable(int no) {
		for (int i = no; i <= no * 10; i = i + no) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static int findGCD(int a, int b) {
		int gcd = 1;
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0)
				gcd = i;
		}
		return gcd;
	}

	public static boolean isPalindrome(String message) {
		int l = message.length();
		int count = 0;
		for (int i = 0; i < l / 2; i++) {
			if (message.charAt(i) == message.charAt(l - 1)) {
				count++;
				continue;
			} else
				break;
		}
		return (count > 0) ? true : false;
	}

	public static void fibonacciSeries(int terms) {
		int first = 0, second = 1, third = 0;
		System.out.print(first + " " + second + " ");
		for (int i = 2; i < terms; ++i) {
			third = first + second;
			System.out.print(third + " ");
			first = second;
			second = third;
		}
		System.out.println();
	}

	public static void main(String[] args) {
//		LoopsBasics.understandIncrements(10);
//		LoopsBasics.printHelloWorld(3);
//		LoopsBasics.printDivisibleBy3Or5(10);
//		LoopsBasics.printMultiplicationTableTill10(5);
//		LoopsBasics.arithematicProgression(10);
//		LoopsBasics.geometricProgression(10);
//		LoopsBasics.whetherComposite(1);
//		LoopsBasics.printOddNumbers();
//		LoopsBasics.whileLoop();
//		System.out.println("Number of digits are : " + LoopsBasics.fetchNoOfDigits(123));
//		System.out.println("Sum of digits are : " + LoopsBasics.sumOfDigits(123));
//		System.out.println("Sum of Natural Numbers are : " + LoopsBasics.sumOfNaturalNumbers(5));
//		LoopsBasics.multiplicationTable(17);
//		System.out.println("GCD of two numbers are : " + LoopsBasics.findGCD(6, 3));
//		System.out.println("Whether Palindrome : " + isPalindrome("MADADADAM"));
		fibonacciSeries(10);
	}
}
