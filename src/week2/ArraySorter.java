package week2;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorter {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many numbers do you want to input?: ");

		int arraySize = input.nextInt(); // Kullanıcıdan array elemanı sayısını alıyoruz
		int[] array = new int[arraySize]; // Bu sayıya göre yeni array oluşturuyoruz

		for (int i = 0; i < arraySize; i++) { // Arrayin elemanlarını sırayla dolaşıyoruz
			System.out.print(i + 1 + ". number: "); // Her eleman için kullanıcıdan giriş istiyoruz.
			array[i] = input.nextInt(); // Girdiyi arrayin elemanına atıyoruz
		}

		for (int i = 1; i < array.length; i++) { // Array'in ilk elemanını atlayarak işlemeye başlıyoruz
			int currentPosition = i; // Anlık işlenecek konum array'in 2. elemanından başlanarak atanır.
			int currentValue = array[i]; // Anlık işlenecek değer de konumun değerine atanır.

			/* Anlık konumdaki değerin bir gerisindeki değer, anlık değerden büyük olduğu sürece
			bu döngü çalışmaya devam edecek */
			while (currentPosition > 0 && array[currentPosition - 1] > currentValue) {

				// Anlık konumdaki değer bir solundakine atanır.
				array[currentPosition] = array[currentPosition - 1];

				/* Anlık konum 1 eksiltilir.
				Bu döngü ya konum 0 olana dek ya da bir önceki değer
				anlık alınan değerden küçük oluncaya kadar devam eder */
				currentPosition--;
			}

			// Bu konumun değerine döngünün en başındaki değer atanır.
			array[currentPosition] = currentValue;
		}

		System.out.print("Sorted numbers: " + Arrays.toString(array));
	}
}
