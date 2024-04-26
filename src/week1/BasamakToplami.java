package week1;

import java.util.Scanner;

public class BasamakToplami {
    public static void main ( String[] args ) {
        int n, total = 0;
        Scanner input = new Scanner ( System.in );

        System.out.print ( "Bir sayı giriniz: " );
        n = input.nextInt ();


        while (n > 0) {
            total += n % 10;  // n'nin son basamağını toplama ekler
            n /= 10;          // n'nin son basamağını kaldırır
        }

        System.out.println ( "Basamaklarının toplamı: " + total );
    }
}
