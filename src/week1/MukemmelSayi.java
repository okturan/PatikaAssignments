package week1;

import java.util.Scanner;

public class MukemmelSayi {
	public static void main ( String[] args ) {
		int n, total = 0;
		Scanner input = new Scanner( System.in );

		System.out.print ("Bir sayı giriniz: ");
		n = input.nextInt();

		// Sayımıza kadar tüm sayıları teker teker deniyoruz. Kendisi hariç.
		for ( int i = 1; i < n; i++ ) {
			if ( n % i == 0 ) { // Mod işlemi sonucu 0 ise tam sayı çarpanıdır.
				total += i; // Ekleyerek gidiyoruz.
			}
		}

		if ( total == n ) {
			System.out.println (n + " Mükkemmel bir sayıdır! 👌👌");
		} else {
			System.out.println (n + " mükemmel bir sayı değildir.");
		}
	}
}
