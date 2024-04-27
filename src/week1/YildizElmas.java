package week1;

import java.util.Scanner;

public class YildizElmas {
	public static void main ( String[] args ) {
		int n, middle;
		Scanner input = new Scanner ( System.in );

		// Kullanıcıdan 1'den büyük tek bir sayı alın. Sayı çift ya da 1 ise yeniden iste.
		do {
			System.out.print ( "1'den büyük bir tek sayı giriniz: " );
			n = input.nextInt ();
		} while ( n % 2 == 0 || n < 2 );

		// Elmasın orta noktasını hesapla. (0 indexli kabul ediyoruz)
		middle = n / 2;

		// Dış döngü her bir satır için çalışır.
		for (int lineNumber = 0; lineNumber < n; lineNumber++) {

			// Dikey mesafeyi hesapla
			int verticalDistance = Math.abs ( lineNumber - middle );

			// İç döngü her karakter için çalışır.
			for (int charIndex = 0; charIndex < n; charIndex++) {

				// Yatay Mesafeyi hesapla
				int horizontalDistance = Math.abs ( charIndex - middle );

				// Anlık pozisyon orta noktaya oranla kontrol edilir. Sınırlar dahilinde değilse boşluk basılır.
				if ( horizontalDistance + verticalDistance > middle ) {
					System.out.print ( "  " );
				} else {

					// Sınırlar dahiline girdiğinde yıldız basılır.
					System.out.print ( "* " );
				}
			}
			// Her satırdan sonra bir yeni satıra geç.
			System.out.println ();
		}
	}
}
