package practice;

import java.util.ArrayList;

public class PracticeOne {
	public static void main(String[] args) {
		System.out.println("QUE-23:" + getFifthToTenthChar("Thisisastring"));
		System.out.println("QUE-24:" + getAllWord("this is a string"));
		System.out.println("QUE-26:" + getCount("this is a string", "a"));
		System.out.println("QUE-27:" + getCharacterCount("This is a string", 'a'));
	}
	/**
	 * que-27: write a method that take one string & one character input and return the count of that given word.
	 * parameter: String text, Char character
	 * returnType: int
	 * servingBucket: variable
	 */
	public static int getCharacterCount(String text, char character) {
		int count = 0;
		text = text.toLowerCase();
		character = Character.toLowerCase(character);
		for (int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == character) {
				count = count + 1;
			}
		}
		return count;
	}
	/**
	 * que-26: write a method that take one string & one word input and return the count of that given word.
	 * parameter: String textOne, String textTwo
	 * returnType: int
	 * servingBucket: variable
	 */
	public static int getCount(String textOne, String textTwo) {
		int count = 0;
		String[] wordArray = textOne.split(" ");
		for (int i = 0; i < wordArray.length; i++) {
			if (wordArray[i].equalsIgnoreCase(textTwo)) {
				count = count + 1;
			}
		}
		return count;
	}

	/**
	 * que-24: write a method that take one string input and return a list of all words.
	 * parameter: String text
	 * returnType: ArrayList<String>
	 * servingBucket: list
	 */
	public static ArrayList<String> getAllWord(String text) {
		ArrayList<String> allWord = new ArrayList<String>();
		String[] wordArray = text.split(" ");
		for (int i = 0; i < wordArray.length; i++) {
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
