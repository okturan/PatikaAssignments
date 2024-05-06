package week2;

public class RepeatingEvenNumberFinder {
	public static void main(String[] args) {
		int[] list = {4, 1, 8, 16, 7, 4, 8, 8, 8, -2, -4, -4, 16};

		// Use a boolean array to track if a number has been printed
		boolean[] printed = new boolean[list.length];

		// Loop through each element in the array
		for (int i = 0; i < list.length; i++) {
			// Continue if the number is odd, zero, or already printed
			if (list[i] % 2 != 0 || printed[i]) {
				continue;
			}

			// Flag to check if the current number has duplicates and is even
			boolean isDuplicate = false;

			// Compare the current element with all following elements
			for (int j = i + 1; j < list.length; j++) {
				// Check if the two elements are the same and even
				if (list[i] == list[j] && list[j] % 2 == 0) {
					isDuplicate = true;
					printed[j] = true;  // Mark this number as printed to avoid repetition
				}
			}

			// If duplicates were found and the number is even, print it
			if (isDuplicate) {
				System.out.print(list[i] + " ");
				printed[i] = true;  // Mark this number as printed to avoid repetition
			}
		}
	}
}
