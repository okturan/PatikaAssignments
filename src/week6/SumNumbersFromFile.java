package week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumNumbersFromFile {

	public static void main (String[] args) {
		String filePath = "./src/week6/numbers.txt";
		int totalSum = 0;

		try {
			// Create a FileReader to read the file
			FileReader fileReader = new FileReader(filePath);

			// Wrap the FileReader with a BufferedReader for efficient reading
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			// Read each line from the file until the end
			while ((bufferedReader.readLine()) != null) {
				// Step 7: Convert the line to an integer and add it to the total sum
				int currentNumber = Integer.parseInt(bufferedReader.readLine());
				totalSum += currentNumber;
			}
		} catch (IOException ioException) {
			System.err.println("Error while reading the file: " + ioException.getMessage());
		}
		System.out.println("Total: " + totalSum);
	}
}
