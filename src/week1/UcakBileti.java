package week1;

import java.util.Scanner;

public class UcakBileti {
	public static void main ( String[] args ) {
		int distance, age, type;

		System.out.println ( "Patika havayollarına hoş geldiniz!\n**********************************" );

		Scanner input = new Scanner ( System.in );
		System.out.print ( "Mesafeyi km türünden giriniz :" );
		distance = input.nextInt ();
		System.out.print ( "Yaşınızı giriniz :" );
		age = input.nextInt ();
		System.out.print ( "Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):" );
		type = input.nextInt ();

		// Geçerli veri kontrolü
		if ( distance <= 0 || age <= 0 || (type != 1 && type != 2) ) {
			System.out.println ( "Hatalı Giriş Yaptınız!" );
			return;

		}
		double total = (distance * 0.10);
		// Yaş indirimi
		if ( age < 12 ) {
			total -= (total * 0.50);

		} else if ( age >= 12 && age <= 24 ) {
			total -= (total * 0.10);

		} else if ( age > 65 ) {
			total -= (total * 0.30);

		}
		// Gidiş-Dönüş indirimi
		if ( type == 2 ) {
			total -= (total * 0.20);
		}

		System.out.println ( "Toplam Tutar:" + (type == 2 ? total * 2 : total) + "TL" );
	}
}
