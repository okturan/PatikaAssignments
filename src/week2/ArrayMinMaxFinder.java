package week2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMaxFinder {
	public static void main (String[] args) {
		int[] list = {0, 56, 1, 34, 0, 2, 12, 8, -2, 101, -3, 0, 5, -1, -33};
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int referenceNumber = input.nextInt();

		int minNumber = 0, maxNumber = 0; // minimum ve maksimum sayıları 0'dan başlatıyoruz.

		for (int i : list) {
			// Sıradaki eleman girilen sayıdan büyükse ve;
			// Maksimum sayıdan küçükse (Başlangıç değerinin 0 olduğu koşulu da dahil ediyoruz || ile)
			if ((i > referenceNumber) && (maxNumber == 0 || i < maxNumber)) {
				maxNumber = i; // Yeni maksimum sayımız bu olur.

				// Sıradaki eleman girilen sayıdan küçükse ve;
				// Minimum sayıdan büyükse (Başlangıç değerinin 0 olduğu koşulu da dahil ediyoruz || ile)
			} else if ((i < referenceNumber) && (minNumber == 0 || i > minNumber)) {
				minNumber = i; // Yeni minimum sayımız bu olur.
			}
		}
		// Arrayi konsola yazdırıyoruz:
		System.out.println("In the array of: " + Arrays.toString(list));
		// Sonrasında ternary operator ile max veya min hala 0 ise "not found" yorumunu yazıyoruz.
		System.out.println("The nearest number above " + referenceNumber + " is " + (maxNumber == 0 ? "not found" : maxNumber) + ".");
		System.out.println("The nearest number below " + referenceNumber + " is " + (minNumber == 0 ? "not found" : minNumber) + ".");
	}
}
