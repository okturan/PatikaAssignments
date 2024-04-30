package week2;

import java.util.Scanner;

public class RecursivePowerCalculator {
	public static void main ( String[] args ) {
		int base, exponent;
		Scanner input = new Scanner ( System.in );

		System.out.print ( "Taban sayısını giriniz: " );
		base = input.nextInt ();

		System.out.print ( "Kuvveti giriniz: " );
		exponent = input.nextInt ();

		System.out.println ( base + "^" + exponent + " = " + calculatePower ( base, exponent ) );
	}

	public static int calculatePower ( int base, int exponent ) {
		if ( exponent == 0 ) {
			return 1;
		}

		/*
		Recursive mantığını ben de zar zor oturtabildiğim için işbu yorum hem kendim hem de başkaları için yazılmıştır:

		- Taban sayısını kendisiyle çarpmaya başlıyoruz. Üssümüz verilen sayıyla başlıyor.
		- Metod kendini her tekrardan çağırdığında üs olarak aldığı değişken 1 azalıyor.
		- 2 üzeri 4 diyecek olalım:
		Main içinden çağırdığımız üs metodu şöyle dönecek:

		metod(2, 4-1)
		  |
		  V
		  2 * metod(2, 3-1)
				|
				V
				2 * metod(2, 2-1)
					  |
					  V
					  2 * metod(2, 1-1 yani 0)
							|
							V
							2 * 1 (demin metodu 0'la çağırdığımız için yukarıdaki if bloğu 1 veriyor)

	    - Metodumuz toplamda 5 kere çağrıldı ve sonuncunun return'ü 1 olduğu için çarpıma etki etmedi.
	    - Bu metodlar zincirleme çalıştığı için sonuncudaki return 1'i alarak önceki çağrıdaki 2 ile çarparak geri döner.
	    - Main çağrısına kadar geri geri devam eder ve sonucu println çağrımızın içine yansıtır.
	    - Yani aslında gerçek sırasıyla yapılan işlem 1 * 2 * 2 * 2 * 2 oluyor.
	    - Okuduysanız teşekkürler, saygılar.
		 */
		return base * calculatePower ( base, exponent - 1 );
	}
}
