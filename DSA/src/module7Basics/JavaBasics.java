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

	public static void main(String[] args) {
		JavaBasics basics = new JavaBasics();
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
		double radius = 7;
		System.out.println("Area of a Circle with radius " + radius + " is : " + basics.findAreaOfCircle(radius));
		System.out.println("Volume of a Sphere with radius " + radius + " is : " + basics.findVolumeOfSphere(radius));
	}
}
