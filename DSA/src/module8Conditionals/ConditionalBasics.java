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

	public static void main(String[] args) {
		System.out.println("Is Number Even : " + ConditionalBasics.isEven(23));
		System.out.println("Absolute value of number is : " + ConditionalBasics.returnAbsoluteValue(-23));
//		ConditionalBasics.checkProfit(10, 8);
		ConditionalBasics.greaterInRectangle(10, 10);
	}
}
