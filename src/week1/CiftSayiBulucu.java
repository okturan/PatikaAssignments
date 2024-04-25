package week1;

import java.util.Scanner;

public class CiftSayiBulucu {
    public static void main ( String[] args ) {
        int x;
        Scanner input = new Scanner ( System.in );

        System.out.print ( "Bir sayı giriniz: " );
        x = input.nextInt ();

        // Bundan sonra yalnızca çift sayı basılacağını bildiğimiz için ön bilgiyi burada veriyoruz.
        System.out.println ("Girdiğiniz sayıya kadar olan tüm çift sayılar: ");

        // 0'dan başlayarak girdiğimiz sayıya kadar her sayıyı işliyoruz.
        for (int i = 0; i <= x; i++) {

            // Bu sayılardan yalnızca 2'ye tam bölünebilenlerini print alıyoruz.
            if ( i % 2 == 0 ) {
                System.out.println ( i );
            }
        }
    }
}
