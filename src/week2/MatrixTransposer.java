package week2;

public class MatrixTransposer {
	public static void main ( String[] args ) {
		int[][] matrix = {{4, 9, 20}, {10, 1, 102}, {66, 33, 11}};
		matrixPrinter ( matrix );
		int[][] matrixTransposed = new int[matrix[0].length][matrix.length];

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				matrixTransposed[col][row] = matrix[row][col];
			}
		}
		matrixPrinter ( matrixTransposed );
	}
	public static void matrixPrinter ( int[][] array ) {
		for (int[] row : array) {
			for (int element : row) {
				System.out.print ( element + "\t" );
			}
			System.out.println ();
		}
		System.out.println ();
	}
}
