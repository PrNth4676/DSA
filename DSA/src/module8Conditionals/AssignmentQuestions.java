package module8Conditionals;

public class AssignmentQuestions {

	// Q1
	public static String isEven(int number) {
		return ((number % 2 == 0) ? "even" : "odd"); // Done using Ternary Operation
	}

	// Q2
	public static Double returnAbsoluteValue(double number) {
		if (number < 0) { // For negative numbers
			return number * -1.0;
		} else { // For positive numbers
			return number;
		}
	}

	// Q3
	public static String transactionResult(int costPrice, int sellPrice) {
		if (costPrice == sellPrice) {
			return "Break-Even";
		} else {
			if (costPrice > sellPrice) {
				return "Loss";
			}
			return "Profit";
		}
	}

	// Q4
	public static String whetherLeapYear(long year) {
		boolean isLeap = false;
		if (year % 4 == 0) {
			// if the year is century
			if (year % 100 == 0) {
				// if year is divided by 400
				// then it is a leap year
				if (year % 400 == 0)
					isLeap = true;
				else
					isLeap = false;
			}
			// if the year is not century
			else
				isLeap = true;
		} else
			isLeap = false;
		if (isLeap) {
			return "Leap Year";
		} else {
			return "Not a Leap Year";
		}
	}

	// Q5
	public static void findGreatestAmongThree(int a, int b, int c) {
		if (a > b) { // a > b
			if (a > c) { // a > b > c
				System.out.println("A is greatest a : " + a + " b : " + b + " c : " + c);
			} else { // c > a > b
				System.out.println("C is greatest a : " + a + " b : " + b + " c : " + c);
			}
		} else { // a < b
			if (b > c) { // b > a > c
				System.out.println("B is greatest a : " + a + " b : " + b + " c : " + c);
			} else { // c > b > a
				System.out.println("C is greatest a : " + a + " b : " + b + " c : " + c);
			}
		}
	}

	// Q6
	public static String triangleType(int a, int b, int c) {
		String triangleType = null;
		if (a + b < c || b + c < a || a + c < b) {
			triangleType = "Not a Triangle";
		} else {
			if (a == b && b == c) {
				triangleType = "Equilateral";
			} else if (a == b || b == c || a == c) {
				triangleType = "Isosceles";
			} else {
				triangleType = "Scalene";
			}
		}
		return triangleType;
	}

	// Q7
	public static int findLeastAmongThree(int a, int b, int c) {
		if (a <= b) { // b > a
			if (a <= c) { // c > b > a
				return a; // a is smallest
			} else { // b > a > c
				return c;
			}
		} else { // a > b
			if (c <= b) { // a > b > c
				return c;
			} else { // c > a > b
				return b;
			}
		}
	}

	public static void main(String[] args) {
//		System.out.println("The number is : " + AssignmentQuestions.isEven(2));
//		System.out.println("Absolute value of the number is : " + AssignmentQuestions.returnAbsoluteValue(-5.9));
//		System.out.println("Transaction Result is : "+AssignmentQuestions.transactionResult(10, 10));
//		AssignmentQuestions.findGreatestAmongThree(100, 10, 12);
//		System.out.println("Triangle Type : " + AssignmentQuestions.triangleType(10, 10, 5));
//		System.out.println("Smallest Number is : " + AssignmentQuestions.findLeastAmongThree(5, 0, 1));
	}
}
