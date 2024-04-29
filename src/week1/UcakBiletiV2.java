package week1;

import java.util.Scanner;

public class UcakBiletiV2 {
	public static void main ( String[] args ) {
		Scanner input = new Scanner ( System.in );
		int distance, age, travelType;
		double costPerKm = 0.1, totalCost;

		System.out.println ( "Patika havayollarına hoş geldiniz!\n**********************************" );

		do {
			System.out.print ( "Gideceğiniz mesafeyi KM cinsinden giriniz: " );
			distance = input.nextInt ();

			// Mesafe sıfır veya negatifse hata mesajı gösteriliyor.
			if ( distance <= 0 ) {
				System.out.println ( "Hatalı veri girdiniz!" );
			}
		} while ( distance <= 0 );

		do {
			System.out.print ( "Yaşınızı giriniz: " );
			age = input.nextInt ();

			// Yaş sıfır veya negatifse hata mesajı gösteriliyor.
			if ( age <= 0 ) {
				System.out.println ( "Hatalı veri girdiniz!" );
			}
		} while ( age <= 0 );

		do {
			System.out.println ( "Yolculuk tipinizi seçiniz:\n" + "1. Tek Yön\n" + "2. Gidiş-Dönüş\n" );
			System.out.print ( "Seçiminiz: " );
			travelType = input.nextInt ();

			// Seçilen yolculuk tipi geçerli değilse hata mesajı gösteriliyor.
			if ( travelType != 1 && travelType != 2 ) {
				System.out.println ( "Hatalı veri girdiniz!" );
			}
		} while ( travelType != 1 && travelType != 2 );

		// Toplam maliyet hesaplanıyor.
		totalCost = distance * costPerKm;

		// Yaşa göre indirimler uygulanıyor.
		if ( age < 12 ) {
			totalCost *= 0.5;
		} else if ( age < 24 ) {
			totalCost *= 0.9;
		} else if ( age > 65 ) {
			totalCost *= 0.7;
		}

		// Gidiş-dönüş seyahatler için ek indirim uygulanıyor.
		if ( travelType == 2 ) {
			totalCost *= 0.8;
			totalCost *= 2; // Gidiş dönüş olduğu için ikiyle çarpılıyor
		}

		System.out.println ( "Toplam tutar: " + totalCost + " ₺" );
	}
}
