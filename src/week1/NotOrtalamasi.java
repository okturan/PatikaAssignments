package week1;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main ( String[] args ) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner ( System.in );

        System.out.print ( "Matematik notunuzu giriniz: " );
        mat = input.nextInt ();

        System.out.print ( "Fizik notunuzu giriniz: " );
        fizik = input.nextInt ();

        System.out.print ( "Kimya notunuzu giriniz: " );
        kimya = input.nextInt ();

        System.out.print ( "Turkce notunuzu giriniz: " );
        turkce = input.nextInt ();

        System.out.print ( "Tarih notunuzu giriniz: " );
        tarih = input.nextInt ();

        System.out.print ( "Muzik notunuzu giriniz: " );
        muzik = input.nextInt ();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6.0;

        System.out.println ( "Not ortalamanız: " + sonuc );

        System.out.println ( sonuc >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı" );

    }
}
