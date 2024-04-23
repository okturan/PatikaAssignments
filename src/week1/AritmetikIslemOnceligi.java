package week1;

import java.util.Scanner;

public class AritmetikIslemOnceligi {
    public static void main ( String[] args ) {
        int a, b, c, result;
        Scanner input = new Scanner ( System.in );

        System.out.print ( "Birinci sayıyı giriniz: " );
        a = input.nextInt ();

        System.out.print ( "İkinci sayıyı giriniz: " );
        b = input.nextInt ();

        System.out.print ( "Üçüncü sayıyı giriniz: " );
        c = input.nextInt ();

        result = a + (b * c) - b;

        System.out.println ( "İşlem sonucu: " + result );
    }
}
