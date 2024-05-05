package week2;

import java.util.Scanner;

public class PalindromicWordChecker {

	static boolean isPalindrome (String str) {
		StringBuilder reverse = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse.append(str.charAt(i));
		}
		return str.contentEquals(reverse);
	}

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a word or phrase to check if it's a palindrome: ");
		String word = input.nextLine();
		System.out.println(word + (isPalindrome(word) ? " is a palindrome." : " is not a palindrome."));
	}
}
