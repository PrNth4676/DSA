package module12Arrays;

public class ArrayQuestions {

	static int[] marks = { 10, 25, 37, 40, 100, 25, 17 };

	public static void findRollNumber(int mark) {
		for (int i = 0; i < marks.length; ++i) {
			if (marks[i] < mark) {
				System.out.println("Roll No is : " + i);
			}
		}
	}

	

	public static void main(String[] args) {
		findRollNumber(20);
	}
}
