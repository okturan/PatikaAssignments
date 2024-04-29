package week2;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main ( String[] args ) {
		Scanner scanner = new Scanner ( System.in );

		System.out.print ( "Palindrom kontrolü için bir sayı giriniz: " );
		int number = scanner.nextInt ();

		// Palindrom durumuna göre uygun mesajı belirle ve yazdır.
		String answer = isPalindrome ( number ) ? "dır." : " değildir.";

		System.out.println ( number + " palindromik bir sayı" + answer );

	}

	public static boolean isPalindrome ( int originalNumber ) {
		int reversedNumber = 0, workingNumber = originalNumber; // Sayıyı ters çevirmek için değişkenler
		while ( workingNumber > 0 ){
			reversedNumber *= 10; // İlk döngüde işlevsiz. Basamağı sola kaydırmak için 10 ile çarp
			reversedNumber += workingNumber % 10; // Son basamağı reversedNumber'a ekle
			workingNumber = workingNumber / 10; // Son basamağı kaldır
		}
		return originalNumber == reversedNumber;
	}
}
