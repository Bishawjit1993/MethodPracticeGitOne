package practice;

import java.util.ArrayList;

public class PracticeOne {
	public static void main(String[] args) {
		System.out.println("QUE-23:" + getFifthToTenthChar("Thisisastring"));
		System.out.println("QUE-24:" + getAllWord("this is a string"));
		System.out.println("QUE-26:" + getCount("this is a string", "a"));
		System.out.println("QUE-27:" + getCharacterCount("This is a string", 'a'));
		System.out.println("QUE-28:" + getTrueFalse("this is ", "This"));
		System.out.println("QUE-29:" + getConsonantCount("this is a string"));
		System.out.println("QUE-30:" + getVowelCount("This is a string"));
	}
	/**
	 * que-30: write a method that take one string input and return the count of all vowels.
	 * parameter: String text
	 * returnType: int
	 * servingBucket: variable
	 */
	public static int getVowelCount(String text) {
		int count = 0;
		text = text.toLowerCase();
		String vowel = "aeiou";
		for (int i = 0; i < text.length(); i++) {
			String textOne = String.valueOf(text.charAt(i));
			if (vowel.contains(textOne)) {
				count = count + 1;
			}
		}
		return count;
	}
	/**
	 * que-29: write a method that take one string input and return the count of all consonant.
	 * parameter: String text
	 * returnType: int
	 * servingBucket: variable
	 */
	public static int getConsonantCount(String text) {
		int count = 0;
		text = text.toLowerCase();
		String consonant = "abcdfghjklmnpqrstvwxyz";
		for (int i = 0; i < text.length(); i++) {
			String textOne = String.valueOf(text.charAt(i));
			if (consonant.contains(textOne)) {
				count = count + 1;
			}
		}
		return count;
	}
	/**
	 * que-28: write a method that take one string & one word input and return true if that sentence contains given word otherwise return false.
	 * parameter: String text, String word
	 * returnType: boolean
	 * servingBucket: variable
	 */
	public static boolean getTrueFalse(String text, String word) {
		boolean result = false;
		text = text.toLowerCase();
		word = word.toLowerCase();
		String[] wordArray = text.split(" ");
		for (int i = 0; i < wordArray.length; i++) {
			if (wordArray[i].matches(word)) {
				result = true;
			}
		}
		return result;
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
			if (text.charAt(i) == character) {
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
