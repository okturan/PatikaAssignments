package week2;

public class MatrixTransposer {
	public static void main (String[] args) {
		int[][] matrix = {{4, 9}, {10, 1}, {66, 33}}; // Örnek Matrisimiz. İç dizilere satır diyeceğiz.
		matrixPrinter (matrix); // Matrisimizi görsellik adına önce ekrana yazdırıyoruz

		// Yeni bir dizi oluşturuyoruz ama bu sefer satır sayısı asıl matrisin ilk satırındaki eleman sayısına eşit.
		// Sütun sayısı ise asıl matrisin satır sayısına eşit.
		int[][] matrixTransposed = new int[matrix[0].length][matrix.length];

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {

				// Sırayla her elemanın satır ve sütun indislerini tersine çeviriyoruz
				matrixTransposed[col][row] = matrix[row][col];
			}
		}
		matrixPrinter (matrixTransposed); // Tekrardan baskı alıyoruz
	}

	// Bu metod yalnızca matrisimizin ekrana gösterilmesine yarıyor. Matris transpose işlemi burada gerçekleşmiyor.
	public static void matrixPrinter (int[][] array) {
		for (int[] row : array) {
			for (int element : row) {
				System.out.print (element + "\t");
			}
			System.out.println ();
		}
		System.out.println ();
	}
}
