package week1;

import java.util.Scanner;

public class EnBuyukEnKucukSayi {
	public static void main ( String[] args ) {
		Scanner input = new Scanner ( System.in );
		System.out.print ( "Kaç sayı gireceksiniz? : " );
		int number = input.nextInt ();

		// Sayı adedi olarak 0 girilmesin.
		if ( number <= 0 ) {
			System.out.println ( "Lütfen geçerli bir sayı adedi giriniz." );
		}

		System.out.print ( "1. sayıyı giriniz: " );
		int firstNumber = input.nextInt ();
		// min ve max değişkenlerini döngüden önce başlatalım ki min değerinin karşılaştırılabilecek bir referansı olsun.
		int max = firstNumber;
		int min = firstNumber;

		// 2. sayıdan itibaren döngü başlar
		for (int i = 2; i <= number; i++) {
			System.out.print ( i + ". sayıyı giriniz: " );
			int currentNumber = input.nextInt ();

			// Her döngüde anlık sayı max ile karşılaştırılır. Büyükse yeni max o olur.
			if ( currentNumber > max ) {
				max = currentNumber;
			}

			// Her döngüde anlık sayı min ile karşılaştırılır. Küçükse yeni min o olur.
			if ( currentNumber < min ) {
				min = currentNumber;
			}
		}

		System.out.println ( "En büyük sayı: " + max );
		System.out.println ( "En küçük sayı: " + min );

	}
}
