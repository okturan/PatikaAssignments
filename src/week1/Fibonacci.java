package week1;

import java.util.Scanner;

public class Fibonacci {
	public static void main ( String[] args ) {
		Scanner input = new Scanner ( System.in );
		int n, fib = 0, ona = 1, cci;

		// Kullanıcıdan Fibonacci serisinin uzunluğunu girmesini iste
		System.out.print ( "Fibonacci seriniz kaç elemanlı olsun?: " );
		n = input.nextInt ();

		// İlk iki Fibonacci sayısını yazdır
		System.out.print ( fib + ", " + ona );

		// Fibonacci serisini hesapla ve yazdır
		for (int i = 0; i < n; i++) {
			cci = fib + ona; // Sonraki Fibonacci sayısını hesapla
			System.out.print ( ", " + cci ); // Sonraki sayıyı yazdır
			fib = ona; // Bir sonraki adımda kullanılmak üzere değerleri güncelle
			ona = cci;
		}
	}
}
