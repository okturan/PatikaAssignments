package week2;

import java.util.Arrays;

public class RepeatingNumberFrequencyFinder {
	public static void main (String[] args) {
		int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

		// Tüm elemanların frekanslarını takip etmek için bir boolean dizi kullanılır.
		boolean[] isCounted = new boolean[list.length];
		System.out.println(Arrays.toString(isCounted));

		System.out.println("Dizi: " + Arrays.toString(list));
		System.out.println("Tekrar eden sayılar:");

		// Ana döngü, tüm elemanları gezinir.
		for (int i = 0; i < list.length; i++) {
			if (isCounted[i]) { // Eğer bu eleman önceden işaretlendiyse sıradaki sayıya atla.
				continue;
			}

			int count = 1;  // İlk sayımızı başlatıyoruz çünkü mevcut eleman tek başına da olsa 1 sayılmalı.

			// İç döngü, mevcut eleman ile aynı olan diğer tüm elemanları sayar.
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] == list[j]) {
					count++;      // Aynı elemanı bulduğumuzda sayımı artır.
					isCounted[j] = true; // Bu elemanı saydık, tekrar saymayı önlemek için işaretle.
				}
			}

			// Mevcut elemanın kaç kere bulunduğunu yazdır.
			System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
			isCounted[i] = true; // Mevcut elemanı saydık, tekrar saymayı önle.
		}
	}
}
