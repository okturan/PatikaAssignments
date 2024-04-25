package week1;

import java.util.Scanner;

public class CiftSayiBulucu {
    public static void main ( String[] args ) {
        int inputNumber;
        Scanner input = new Scanner ( System.in );

        System.out.print ( "Bir sayı giriniz: " );
        inputNumber = input.nextInt ();

        // Bundan sonra yalnızca çift sayı basılacağını bildiğimiz için ön bilgiyi burada veriyoruz.
        System.out.println ( "Girdiğiniz sayıya kadar olan tüm çift sayılar: " );

        // 0'dan başlayarak girdiğimiz sayıya kadar her sayıyı işliyoruz.
        for (int i = 0; i <= inputNumber; i++) {

            // Bu sayılardan yalnızca 2'ye tam bölünebilenlerini print alıyoruz.
            if ( i % 2 == 0 ) {
                System.out.println ( i );
            }

        }

        //Bonus içerik. Patika ödevinde istenen fonksiyonu sonradan ekliyorum:
        int total = 0, counter = 0;
        for (int i = 0; i <= inputNumber; i++) {
            if ( i % 3 == 0 && i % 4 == 0 ) {
                total += i;
                counter++;
            }
        }
        System.out.println ( "Girdiğiniz sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması: " + total / counter );
    }
}
