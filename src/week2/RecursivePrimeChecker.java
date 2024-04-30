package week2;

import java.util.Scanner;

public class RecursivePrimeChecker {
	public static void main ( String[] args ) {
		Scanner input = new Scanner ( System.in );

		System.out.print ( "Asal sayı kontrolü için bir sayı giriniz: " );
		int number = input.nextInt ();

		// Metodu ilk olarak asal kontrolü için asgari gereklilik olan 2 ile çağırıyoruz.
		String answer = isPrime ( number, 2 ) ? "dır." : " değildir.";

		System.out.println ( number + " asal bir sayı" + answer );
	}

	public static boolean isPrime ( int number, int divisor ) {
		// Metodun sonlanabilmesini sağlayan koşullar:
		if ( number <= 2 ) {
			return number == 2; // Girilen sayı 2 ise true, 2 ve altı her sayı için false döner.
		} else if ( number % divisor == 0 ) { // Sayımız tam bölünebiliyorsa zaten asal değildir.
			return false;

		// Bölenin karesi sayımızdan büyükse, bu sayının böleni olmadığı anlamına gelir
		// çünkü olası tüm küçük bölenler zaten kontrol edilmiştir.
		} else if ( divisor * divisor > number ) {
			return true;

		// Yukarıdaki koşullar sağlanamıyorsa her seferinde daha da derinleşerek böleni 1 artırıyoruz.
		} else {
			return isPrime ( number, divisor + 1 );
		}
	}
}

