package week2;

import java.util.Arrays;

public class HarmonicMeanCalculator {
	public static void main ( String[] args ) {

		int[] arr = {2, 4, 5, 11, 14};
		double harmonic = 0;

		for (int n : arr) {
			harmonic += (double) 1 / n;
		}

		System.out.println ( "Harmonic mean of " + Arrays.toString ( arr ) + " is " + (arr.length / harmonic) );

	}
}
