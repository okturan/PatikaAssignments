package week2;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorter {
	public static void main ( String[] args ) {
		Scanner input = new Scanner ( System.in );
		System.out.print ( "How many numbers do you want to input?: " );
		int arraySize = input.nextInt ();

		int[] array = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			System.out.print ( i + 1 + ". number: " );
			array[i] = input.nextInt ();
		}

		for (int i = 1; i < array.length; i++) {
			int currentPosition = i;
			int currentValue = array[i];

			while ( currentPosition > 0 && array[currentPosition - 1] > currentValue ) {
				array[currentPosition] = array[currentPosition - 1];
				currentPosition--;
			}

			array[currentPosition] = currentValue;
		}

		System.out.print ( "Sorted numbers: " + Arrays.toString ( array ) );
	}
}
