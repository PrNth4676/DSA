package regexProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersToWords {

	public String numberInWords(int num) {
		String worded = null;
		switch (num) {
		case 0:
			worded = "zero";
			break;
		case 1:
			worded = "one";
			break;
		case 2:
			worded = "two";
			break;
		case 3:
			worded = "three";
			break;
		case 4:
			worded = "four";
			break;
		case 5:
			worded = "five";
			break;
		case 6:
			worded = "six";
			break;
		case 7:
			worded = "seven";
			break;
		case 8:
			worded = "eight";
			break;
		case 9:
			worded = "nine";
			break;
		case 46:
			worded = "point";
		}
		return worded;
	}

	public void showResult(String input) {
		Pattern pattern = Pattern.compile("\\d{1}+\\.{1}\\d+");
		Matcher matcher = pattern.matcher(input);
		String output,value = null;
		while (matcher.find()) {
			value = matcher.group();
		}
		String[] numerals = value.split("\\.");
		output = numberInWords(Integer.parseInt(numerals[0]))+" ";
		output += numberInWords((int) value.charAt(1))+" ";
		int postDecimal = Integer.parseInt(numerals[1]);
		for (int i = numerals[1].length() - 1; i >= 0; i--) {
			int secondVal = postDecimal / (int) Math.pow(10, i);
			output += numberInWords(secondVal)+" ";
			postDecimal = postDecimal % (int) Math.pow(10, i);
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		NumbersToWords sampleText = new NumbersToWords();
		sampleText.showResult("The value is 0.9876");
	}
}
