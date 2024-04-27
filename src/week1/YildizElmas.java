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

		// Elmasın orta noktasını hesapla.
		middle = ((n - 1) / 2) + 1;

		// Dış döngü her bir satır için çalışır.
		for (int lineNumber = 1; lineNumber <= n; lineNumber++) {
			// İç döngü satırdaki her bir karakter için çalışır.
			for (int charIndex = 1; charIndex <= n; charIndex++) {
				// Eğer mevcut konum, hesaplanan elmas alanının dışındaysa "-" bas.
				if ( middle > n - (Math.abs ( charIndex - middle ) + Math.abs ( lineNumber - middle )) ) {
					System.out.print ( "- " );
				} else {
					// Diğer durumlarda "*" bas.
					System.out.print ( "* " );
				}
			}
			// Her satırdan sonra bir yeni satıra geç.
			System.out.println ();
		}
	}
}
