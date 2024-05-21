package week5;

import java.util.Scanner;

public class TryCatchPractice {
	static Scanner input = new Scanner(System.in);
	private static final int[] array = {1, 5, 15, 20, 25, 30, 35, 40, 45, 50};

	public static void main (String[] args) {
		System.out.print("Input an index number: ");
		int index = input.nextInt();
		System.out.println(getElementAtIndex(index)); // Calling method and printing result
	}

	public static String getElementAtIndex(int index) {
		try {
			int element = array[index]; // Attempting to access array element
			return "Element at index: " + element; // Returning element if valid
		} catch (ArrayIndexOutOfBoundsException e) { // Catching out-of-bounds exception
			return "Error: Invalid index. Please enter a valid index."; // Returning error message
		}
	}
}