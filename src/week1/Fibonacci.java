package week1;

import java.util.Scanner;

public class Fibonacci {
	public static void main ( String[] args ) {
		Scanner input = new Scanner ( System.in );
		System.out.print ( "Fibonacci serisinin eleman sayısını giriniz: " );
		int n = input.nextInt ();

		int fib = 0; // İlk Fibonacci sayısı
		int ona = 1; // İkinci Fibonacci sayısı
		int cci;     // Hesaplanacak sonraki Fibonacci sayısı

		for (int i = 1; i <= n; i++) {
			System.out.print ( fib + " " );

			cci = fib + ona; // Fibonacci serisinin bir sonraki elemanını hesapla
			fib = ona; // Bir sonraki adımda kullanılmak üzere değerleri güncelle
			ona = cci;
		}
	}
}
