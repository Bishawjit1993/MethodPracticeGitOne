package practice;

public class PracticeOne {
	public static void main(String[] args) {
		System.out.println("QUE-23:" + getFifthToTenthChar("Thisisastring"));
	}

/**
 * que-23: write a method that take one string input and return fifth to tenth character as a string.
 * parameter: String text
 * returnType: String
 * servingBucket: variable
 */
	public static String getFifthToTenthChar(String text) {
		String result = "";
		for (int i = 4; i <= 9; i++) {
			result = result + text.charAt(i);
		}
		return result;
	}
}
