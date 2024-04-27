package week1;

import java.util.Scanner;

public class TersUcgen {
	public static void main ( String[] args ) {
		Scanner input = new Scanner ( System.in );

		System.out.println ( "Ters üçgeniniz kaç basamaklı olsun?: " );
		int step = input.nextInt ();

		while ( step > 0 ) { // Girilen basamaktan başlıyoruz. 1'e inene kadar döngü tekrarlıyor.

			// Her basamağın satırında o basamak kere yıldız basıyoruz.
			for (int star = step; star > 0; star--) {
				System.out.print ( "*" );
			}
			step--;
			System.out.println (); // Her basamağın sonunda alt satıra geçiyoruz.
		}
	}
}
