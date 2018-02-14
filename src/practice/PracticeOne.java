package practice;

import java.util.ArrayList;

public class PracticeOne {
	public static void main(String[] args) {
		System.out.println("QUE-23:" + getFifthToTenthChar("Thisisastring"));
		System.out.println("QUE-24:" + getAllWord("this is a string"));
	}
	/**
	 * que-24: write a method that take one string input and return a list of all words.
	 * parameter: String text
	 * returnType: ArrayList<String>
	 * servingBucket: list
	 */
	public static ArrayList<String> getAllWord(String text){
		ArrayList<String> allWord = new ArrayList<String>();
		String[] wordArray = text.split(" ");
		for(int i = 0; i < wordArray.length; i++) {
			allWord.add(wordArray[i]);
		}
		return allWord;
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
