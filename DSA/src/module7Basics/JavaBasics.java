package module7Basics;

public class JavaBasics {

	// VARIABLES
	int i = 5; // Declaration and Initialization - The value of i is 5
	int j = 7;

	// UPDATING THE VARIABLES
	public int updateVariable(int old, int newValue) {
		// Here, newValue is assigned to the old variable
		return old = newValue;
	}

	public int updateVariableBySum(int old, int newValue) {
		// Here, newValue is added with the old and then is assigned to the old variable
		return old += newValue;
	}

	public int updateVariableByDiff(int old, int newValue) {
		return old -= newValue;
	}

	public int updateVariableByDiv(int old, int newValue) {
		return old /= newValue; // Any values beyond the decimal(.) is removed as its an integer variable
	}

	// To store the decimal value we have to use double or float Data-types
	public double updateVariableByDiv(double old, double newValue) {
		return old /= newValue;
	}

	// INCREMENT AND DECREMENT OPERATIONS

	// Area of a Circle
	public double findAreaOfCircle(double radius) {
		return Math.round(Math.PI * Math.pow(radius, 2));
	}

	// Volume of a Sphere
	public double findVolumeOfSphere(double radius) {
		return Math.round(((double) 4 / 3) * Math.PI * Math.pow(radius, 3));
	}

	// Simple Interest
	public double findSI(double principal, double rate, double time) {
		return (principal * rate * time) / 100;
	}

	// Power of a number
	public double findPowerOfNumber(double number, int power) {
		return Math.pow(number, power);
	}

	// Modulus Operator
	public double findModOfNumber(double numerator, double denominator) {
		// Let a = numerator & b = denominator
		// Property 1: If a < b then mod will always return a
		// Property 2: a %(-b) = a % b
		// Property 3: (-a) % b = -(a % b)
		return (numerator % denominator);
	}

	// TYPE CASTING
	public double returnHalfOfNumber(int number) {
		return (double) number / 2; // Typecasted up to Double to get the values in decimal
	}

	public void divideOperation() {
		double x = 5 / 2;
		// Here, x will be printed as 2.0.
		// Reason : 5/2 operation will result in 2 as both are integers.
		// Post that, the result of division(RHS) gets assigned to the variable x (LHS)
		// which is double.
		System.out.println(x); // Hence, x becomes 2.0
		System.out.println("Division of int/int will result in an integer : " + 5 / 2); // int/int
		System.out.println("Division of double/double will result in an integer : " + 5.0 / 2.0); // double/double
		System.out.println("Division of double/int will result in an integer : " + 5.0 / 2); // double/int
		System.out.println("Division of int/double will result in an integer : " + 5 / 2.0); // int/double
	}

	// Char Data Type
	public void playWithChar(char ch) {
		// a b c d .. z - ASCII Values : a = 97, b = 98, ... z = 122 i.e., (a+25)
		// A B C D .. Z - ASCII Values : A = 65, B = 66, ... z = 90 i.e., (A+25)
		// 0 1 2 3 .. 9
		// ! @ # $ .. *
		System.out.println("ASCII Value of Character : " + ch + " is : " + (int) ch);
	}

	public boolean compareNumbers(int a, int b) {
		if (a == b) {
			return false;
		} else {
			if (a > b) {
				return false;
			}
			return true;
		}
	}

	public static void main(String[] args) {
		JavaBasics basics = new JavaBasics();
		double radius = 7;
		double principalAmount = 7000;
		double rate = 12;
		double time = 2;
		System.out.println("Hello World!"); // Prints a new line after the end of message
		System.out.println("The value of variable i is : " + basics.i);
		System.out.println("The sum of the variables are : " + (basics.i + basics.j));
		System.out.println(
				"The value of variable " + basics.i + " will be updated to : " + basics.updateVariable(basics.i, 10));
		System.out.println("The value of variable " + basics.i + " will be updated to : "
				+ basics.updateVariableBySum(basics.i, 10));
		System.out.println("The value of variable " + basics.i + " will be updated to : "
				+ basics.updateVariableByDiff(basics.i, 20));
		System.out.println("The value of variable " + basics.i + " will be updated to : "
				+ basics.updateVariableByDiv(basics.i, 10.0));
		System.out.println("Area of a Circle with radius " + radius + " is : " + basics.findAreaOfCircle(radius));
		System.out.println("Volume of a Sphere with radius " + radius + " is : " + basics.findVolumeOfSphere(radius));
		System.out.println("Simple Interest for an amount of " + principalAmount + " over a time period of " + time
				+ " at the rate of " + rate + " % is : " + basics.findSI(principalAmount, rate, time));
		System.out.println("The matured amount on the principal amount of " + principalAmount + " will be : "
				+ (principalAmount + basics.findSI(principalAmount, rate, time)));
//		Scanner scanner = new Scanner(System.in); // Here, "in" means the system will take input from either Keyboard or
//													// Mouse
//		System.out.print("Enter the number : ");
//		double number = scanner.nextDouble();
//		System.out.print("Enter the power : ");
//		int power = scanner.nextInt();
//		System.out.println("The number " + number + " raised to power " + power + " is : "
//				+ basics.findPowerOfNumber(number, power));
//		scanner.close(); // Closing the scanner to avoid program running indefinitely.
//		System.out.println("The Modulus value is " + basics.findModOfNumber(10, 8));
//		System.out.println("Half of the number is : " + basics.returnHalfOfNumber(7));
//		basics.divideOperation();
//		basics.playWithChar('&');
//		double a = 7 / 22 * (3.14 + 2) * 3 / 5;
//		System.out.println(a); // The value is zero because the RHS operation is in int where division will
		// result in 0
		System.out.println("Two are Equal ? : " + basics.compareNumbers(8, 10));
	}
}
