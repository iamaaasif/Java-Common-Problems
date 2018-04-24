

import java.util.Scanner;

/**
 * @author Abdullah Al Asif
 *
 */
public class AnagramCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word to check anagram or not :");
		String word = scanner.nextLine();
		if (isAnagram(word)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}

	}

	public static boolean isAnagram(String word) {
		// a a b a a
		char[] newWord = word.toCharArray();
		// System.out.println(newWord.length);
		for (int i = 0; i < newWord.length; i++) {
			if (newWord[i] == newWord[(newWord.length - 1) - i]) {
				return true;
			}

		}
		return false;

	}
}