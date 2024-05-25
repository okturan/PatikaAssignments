package week5.wordfrequencycounter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
	public static HashMap<String, Integer> wordCounter (String text) {

		// Separating each word with a space to create a list of words.
		// In the future should implement uppercase lowwercase support.
		String[] wordList = text.replaceAll("[^\\p{L}\\s]", " ").toLowerCase().split("\\s+");
		System.out.println(Arrays.toString(wordList));
		HashMap<String, Integer> frequencyMap = new HashMap<>();

		// Iterating over the array of words and checking if a name already exists to increase the count.
		for (String word : wordList) {

			if (frequencyMap.containsKey(word)) {
				int currentCount = frequencyMap.get(word); // Declared this variable for ease of reading.
				frequencyMap.put(word, currentCount + 1);
			} else {
				frequencyMap.put(word, 1);
			}
		}
		return frequencyMap;
	}

	// Iterating through the hashmap to check for the most frequent word.
	public static void displayMostFrequent (HashMap<String, Integer> frequencyMap) {
		String mostFrequentWord = "";
		int maxCount = 0;

		for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
			if (entry.getValue() > maxCount) {
				mostFrequentWord = entry.getKey();
				maxCount = entry.getValue();
			}
		}

		System.out.println("Most frequent word is : " + mostFrequentWord);
		System.out.println("It was used " + maxCount + " times!");
	}
}
