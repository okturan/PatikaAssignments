package week2;

import java.util.Scanner;

public class RecursiveFibonacci {
	public static void main ( String[] args ) {
		Scanner input = new Scanner ( System.in );
		System.out.print ( "Fibonacci serisinin kaçıncı elemanını görmek istersiniz?: " );
		int n = input.nextInt ();

		System.out.println ( Fibonacci ( n ) );
	}
	public static int Fibonacci ( int n ) {
		if ( n == 0) {
			return 0;
		} else if ( n == 1 ) {
			return 1;
		}

		return Fibonacci ( n - 1 ) + Fibonacci ( n - 2 );
	}
}
