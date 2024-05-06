package week2;

import java.util.Arrays;

public class HarmonicMeanCalculator {
	public static void main ( String[] args ) {

		int[] array = {2, 4, 5, 11, 14};
		double harmonic = 0;


		for (int n : array) { // Array içerisindeki her elemanı sırayla işliyoruz
			harmonic += (double) 1 / n; // harmonic değişkenine her sırayla + 1/eleman sonucunu ekliyoruz.
		}

		// Eleman sayısı / harmonik toplam = harmonik ortalama
		System.out.println ("Harmonic mean of " + Arrays.toString (array) + " is " + (array.length / harmonic) );

	}
}
