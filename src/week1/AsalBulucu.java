package week1;

public class AsalBulucu {
	public static void main ( String[] args ) {
		for (int number = 2; number <= 100; number++) {
			boolean flag = false; // Kontrol değişkenimiz false başlıyor.

			// Asal sayılar sadece 1 ve kendilerine bölünebilir.
			// Sayının yarısından fazlası hiçbir zaman böleni olamaz, bu yüzden orada duruyoruz.
			for (int divisor = 2; divisor <= (number / 2); divisor++) {

				if ( number % divisor == 0 ) {
					flag = true; // Bölünen bulundu, bu yüzden flag true olacak.
					break; // Asal olamayacağı için döngüden çık
				}
			}
			if ( !flag ) {  // Eğer flag hala false ise, bu sayının asal olduğu anlamına gelir.
				System.out.println ( number + " bir asal sayıdır" );
			}
		}
	}
}
