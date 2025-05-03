package module8Conditionals;

public class ConditionalBasics {

	// CHECK WHETHER EVEN OR ODD
	public static String isEven(int number) {
		if (number % 2 == 0) { // Here, == means comparison, = means assignment
			return "even";
		}
		return "odd";
	}

	// RETURN ABSOLUTE VALUE
	public static int returnAbsoluteValue(int number) {
		if (number < 0) {
			return -number;
		}
		return number;
	}

	// PROFIT OR LOSS
	public static void checkProfit(int costPrice, int sellingPrice) {
		if (costPrice == sellingPrice) {
			System.out.println("Neither Profit nor less");
		} else {
			if (costPrice > sellingPrice) {
				System.out.println("Loss with a value of : " + (costPrice - sellingPrice));
			} else {
				System.out.println("Profit with a value of : " + (sellingPrice - costPrice));
			}
		}
	}

	// AREA & PERIMETER
	public static void greaterInRectangle(int length, int breadth) {
		int area = length * breadth;
		int perimeter = 2 * (length + breadth);
		if (area == perimeter) {
			System.out.println("Area and Perimeter are same and is a Square");
		} else {
			if (area > perimeter) {
				System.out.println("Area " + "(" + area + ")" + " is greater than Perimeter " + "(" + perimeter + ")"
						+ " of the Rectangle");
			} else {
				System.out.println("Perimeter " + "(" + perimeter + ")" + " is greater than Area " + "(" + area + ")"
						+ " of the Rectangle");
			}
		}
	}

	// LOGICAL OPERATORS
	public static boolean isNumberThreeDigit(int number) {
		// Multiple Conditions
		if (number > 99 && number < 1000) {
			return true;
		}
		return false;
	}

	// Using While Method
//	public static boolean isNumberThreeDigit(int number) {
//		int count = 0;
//		while (number > 0) {
//			number /= 10;
//			count++;
//		}
//		return (count == 3) ? true : false;
//	}

	public static boolean isNumberDivisibleByThreeOrFive(int number) {
		if (number % 3 == 0 || number % 5 == 0) {
			return true;
		}
		return false;
//		return ((number % 3 == 0 || number % 5 == 0)) ? true : false; //Ternary Operator
	}

	public static int findGreatestAmongThem(int a, int b, int c) {
		if (a >= b && a >= c) {
			return a;
		} else if (b >= a && b >= c) {
			return b;
		} else {
			return c;
		}
	}

	public static int findSmallestAmongThem(int a, int b, int c) {
		if (a <= b) {
			if (a <= c) { // a < b < c
				return a;
			} else { // a > c > b
				return b;
			}
		} else { // a > b
			if (b <= c) { // a > c > b
				return b;
			} else { // a > b > c
				return c;
			}
		}
	}

	public static String findGradeOfStudent(int marks) {
		if (marks >= 81) {
			return "Very Good";
		} else if (marks >= 61) {
			return "Good";
		} else if (marks >= 41) {
			return "Average";
		} else {
			return "Fail";
		}
	}

	// Find where in the 2D-Plane based on the values of x and y axis
	public static String findWhereInQuadrant(int x_axis, int y_axis) {
		if (x_axis == 0) {
			if (y_axis == 0) {
				return "Origin";
			} else if (y_axis > 0) {
				return "Positive Y-axis";
			} else {
				return "Negative Y-axis";
			}
		} else if (x_axis > 0) {
			if (y_axis > 0) {
				return "First Quadrant";
			} else if (y_axis < 0) {
				return "Fourth Quadrant";
			} else {
				return "Positive X-axis";
			}
		} else {
			if (y_axis > 0) {
				return "Second Quadrant";
			} else if (y_axis < 0) {
				return "Third Quadrant";
			} else {
				return "Negative X-axis";
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Is Number Even : " + ConditionalBasics.isEven(23));
		System.out.println("Absolute value of number is : " + ConditionalBasics.returnAbsoluteValue(-23));
//		ConditionalBasics.checkProfit(10, 8);
//		ConditionalBasics.greaterInRectangle(10, 10);
		System.out.println("Is number 3 digit ? : " + ConditionalBasics.isNumberThreeDigit(120));
		System.out.println("Smallest Among them is : " + ConditionalBasics.findSmallestAmongThem(0, 1, 0));
		int marks = 91;
		System.out.println("Grade of Student having marks : " + marks + " will be : "
				+ ConditionalBasics.findGradeOfStudent(marks));
		System.out.println("Lies in : " + ConditionalBasics.findWhereInQuadrant(0, 0));
	}
}
