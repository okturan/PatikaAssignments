package week1;

import java.util.Scanner;

public class KDVTutari {
    public static void main ( String[] args ) {
        // 1000 altı
        double KDV18 = 0.18;
        // 1000 üstü
        double KDV8 = 0.08;

        Scanner input = new Scanner ( System.in );

        System.out.print ( "Ürün tutarını giriniz: " );
        int tutar = input.nextInt ();

        if ( tutar <= 1000 ) {
            System.out.println ( "Ürünün KDV'siz fiyatı: " + (tutar - (tutar * KDV18)) );
            System.out.println ( "Ürünün yalnızca KDV'si: " + tutar * KDV18 );
        } else {
            System.out.println ( "Ürünün Kdv'siz fiyatı: " + (tutar - (tutar * KDV8)) );
            System.out.println ( "Ürünün yalnızca KDV'si: " + tutar * KDV8 );
        }

    }
}
