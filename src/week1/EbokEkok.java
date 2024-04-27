package week1;

import java.util.Scanner;

public class EbokEkok {
	public static void main ( String[] args ) {
		int n1, n2, ebob, ekok;
		Scanner input = new Scanner ( System.in );

		System.out.print ( "n1 için bir değer giriniz: " );
		n1 = input.nextInt ();

		System.out.print ( "n2 için bir değer giriniz: " );
		n2 = input.nextInt ();

		int dividend = n1;
		int divisor = n2;
		int remainder = 1;

		// Öklid algoritmasına göre ebob bulunması:

		while ( remainder != 0 ) { // Kalan 0 olana kadar bu döngü çalışacak
			remainder = dividend % divisor; // İki sayının birbirine bölümünden kalan bulunur.
			dividend = divisor; // Bu seferki bölen sayı sonraki döngü için bölünen olarak atanır.
			divisor = remainder; // Kalan sayı sonraki döngü için bölen olarak atanır.
		}

		ebob = dividend;

		// Formüle göre EKOK hesaplıyoruz.
		ekok = (n1 * n2) / ebob;
		System.out.println ( n1 + " ve " + n2 + " sayılarının en büyük ortak böleni = " + ebob );
		System.out.println ( n1 + " ve " + n2 + " sayılarının en küçük ortak katı = " + ekok );
	}
}
