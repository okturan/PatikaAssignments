package week1;

import java.util.Scanner;

public class CiftVeDortKatlariniTopla {
    public static void main ( String[] args ) {
        int userNumber, total = 0;
        Scanner input = new Scanner ( System.in );

        do {
            System.out.println ( "Bir sayı giriniz: " );
            userNumber = input.nextInt ();

            // Yalnızca dördü kontrol ediyorum çünkü 4'e bölünüyorsa zaten çift sayıdır.
            if ( userNumber % 4 == 0 ) {
                total += userNumber;
            }

        } while ( userNumber % 2 == 0 ); // Tek sayı girilene kadar devam etsin.

        System.out.println ( "Toplam : " + total );
    }
}
