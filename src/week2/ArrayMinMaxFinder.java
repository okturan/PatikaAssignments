package week2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMaxFinder {
	public static void main ( String[] args ) {
		int[] list = {0, 56, 1, 34, 0, 2, 12, 8, -2, 101, -3, 0, 5, -1, -33};
		Scanner input = new Scanner ( System.in );

		System.out.print ( "Enter a number: " );
		int referenceNumber = input.nextInt ();

		int minNumber = 0, maxNumber = 0;

		for (int i : list) {
			if ( i > referenceNumber ) {
				if ( maxNumber == 0 || i < maxNumber ) {
					maxNumber = i;
				}
			} else if ( i < referenceNumber ) {
				if ( minNumber == 0 || i > minNumber ) {
					minNumber = i;
				}
			}
		}

		System.out.println ( "In the array of: " + Arrays.toString ( list ) );
		System.out.println ( "The nearest number above " + referenceNumber + " is "
							 + (maxNumber == 0 ? "not found" : maxNumber) + "." );
		System.out.println ( "The nearest number below " + referenceNumber + " is "
							 + (minNumber == 0 ? "not found" : minNumber) + "." );
	}
}
