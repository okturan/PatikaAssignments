package week2;

import java.util.Scanner;

public class RecursivePatternGenerator {
	public static void main ( String[] args ) {
		Scanner input = new Scanner ( System.in );

		System.out.print ( "Bir sayı giriniz: " );
		int number = input.nextInt ();

		printSymmetricSequence ( number );
	}

	public static void printSymmetricSequence ( int number) {
		System.out.print(number + " "); // Mevcut sayıyı yazdırır.

		if (number > 0) {
			printSymmetricSequence ( number - 5 ); // Sayıyı 5 azaltarak kendini çağırır.
			System.out.print ( number + " " ); // Geriye sardığında üst satırdaki metodu çağırdığındaki sayı kaç ise onu yazdırır.
		}
	}
}