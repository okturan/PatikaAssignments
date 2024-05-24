package week5.wordfrequencycounter;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter or paste any text. I will show you which word was used the most!");
		String text = input.nextLine();

		// Creating a HashMap and fill it with "word : count" pairs
		HashMap<String, Integer> frequencyMap = FrequencyCounter.wordCounter(text);

		// Calling the method that displays the word with most uses and how many.
		FrequencyCounter.displayMostFrequent(frequencyMap);
	}
}
