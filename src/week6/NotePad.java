package week6;

import java.io.*;
import java.util.Scanner;

public class NotePad {

	private static final String filePath = "./src/week6/note.txt";

	public static void main (String[] args) {
		readFromFile();
		writeToFile();
	}

	public static void readFromFile () {
		try {
			FileReader fileReader = new FileReader(filePath);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			System.out.println(bufferedReader.readLine());

		} catch (IOException e) {
			System.out.println("File not found");
		}
	}

	public static void writeToFile () {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter note:");
		String note = input.nextLine();

		try (FileWriter fileWriter = new FileWriter(filePath);
			 PrintWriter printWriter = new PrintWriter(fileWriter)) {
			printWriter.println(note);
			System.out.println("Note saved successfully.");
		} catch (IOException e) {
			System.out.println("An error occurred while writing to the file: " + e.getMessage());
		}
	}
}
