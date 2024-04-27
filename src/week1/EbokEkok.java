package week1;

import java.util.Scanner;

public class EbokEkok {
	public static void main ( String[] args ) {
		int n, k, ebob = 0, ekok;
		Scanner input = new Scanner ( System.in );

		System.out.print ( "n için bir değer giriniz: " );
		n = input.nextInt ();

		System.out.print ( "k için bir değer giriniz: " );
		k = input.nextInt ();

		int i = 1;
		while ( i <= n ) {
			/*
			n'ye kadar sırayla her sayıyı iki değerimize de bölüyoruz.
			İkisinden de kalan 0 ise ortak bölendir. Son atanan değer ise en büyük ortak bölendir.
			*/
			if ( n % i == 0 && k % i == 0 ) {
				ebob = i;
			}
			i++;
		}

		// Formüle göre EKOK hesaplıyoruz.
		ekok = (n * k) / ebob;
		System.out.println ( n + " ve " + k + " sayılarının en büyük ortak böleni = " + ebob );
		System.out.println ( n + " ve " + k + " sayılarının en küçük ortak katı = " + ekok );
	}
}
