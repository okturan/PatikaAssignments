package week1;

import java.util.Scanner;

public class Kombinasyon {
    public static void main ( String[] args ) {
        double n, r, result, nFactorial, rFactorial, rnFactorial;
        Scanner input = new Scanner ( System.in );

        do {
            System.out.print ( "N için sayısal değer giriniz: " );
            n = input.nextInt ();

            System.out.print ( "R için sayısal değer giriniz: " );
            r = input.nextInt ();

            // Kombinasyon hesaplarken N > R olması zorunluluğu olduğundan aksi durumda tekrardan değer alıyoruz.
            if ( n <= r ) {
                System.out.println ( "Lütfen N sayısına R sayısından büyük bir değer giriniz." );
            }

        // N'in değeri R'den küçük olduğu müddetçe aynı şeyi tekrarlıyoruz.
        } while ( n <= r );

        // 1'den başlayarak N'e kadar her sayıyı çarpıyoruz. 1*2*3*4..
        nFactorial = 1;
        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }

        // Aynı işlem R için
        rFactorial = 1;
        for (int i = 1; i <= r; i++) {
            rFactorial *= i;
        }

        // Aynı işlem N-R için
        rnFactorial = 1;
        for (int i = 1; i <= (n - r); i++) {
            rnFactorial *= i;
        }

        // C(n,r) = n! / (r! * (n-r)!) formülüne göre sonucu hesaplıyoruz.
        result = nFactorial / (rFactorial * rnFactorial);

        System.out.println ( "C(n,r) = " + result );
    }
}
