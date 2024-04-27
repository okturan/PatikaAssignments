package week1;

import java.util.Scanner;

public class TipDonusumleri {
	public static void main ( String[] args ) {
		Scanner input = new Scanner ( System.in );

		// Kullanıcıdan tam sayı girişi iste
		System.out.print ( "Lütfen bir tam sayı giriniz: " );
		int integerInput = input.nextInt ();

		// Kullanıcıdan ondalıklı sayı girişi iste
		System.out.print ( "Lütfen bir ondalıklı sayı giriniz: " );
		double doubleInput = input.nextDouble ();

		// Tam sayıyı ondalıklı sayıya dönüştür
		double integerToDouble = (double) integerInput;

		// Ondalıklı sayıyı tam sayıya dönüştür
		int floatToInteger = (int) doubleInput;

		System.out.println ( "Tam sayının ondalıklı hali: " + integerToDouble );
		System.out.println ( "Ondalıklı sayının tam hali: " + floatToInteger );
		double loss = doubleInput - floatToInteger;
		System.out.println ( "Ondalıklı sayıdaki kayıp: " + loss );

		input.close ();
	}
}
