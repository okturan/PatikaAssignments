package week1;

import java.util.Scanner;

public class DortVeBesKuvvetleri {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );
        System.out.print ( "Bir sayı giriniz: " );
        int userNumber = input.nextInt ();

        // 1'den alınan sayıya kadar tüm sayılar sırayla işlenir.
        for (int num = 1; num <= userNumber; num++) {

            // Başlangıç kuvvet değerini bir alıyoruz.
            int powerOf = 1;
            // Sonrasında 4'e gelene kadar her döngüde kendisiyle çarpıyoruz.
            for (int num2 = 1; num2 <= 4; num2++) {
                powerOf *= num;
            }
            // Çıkan sonuc sayının kendisiyle 4 kere çarpılmışı yani kuvveti çıkar.
            System.out.println ( num + "⁴" + " = " + powerOf );
        }

        for (int num = 1; num <= userNumber; num++) {
            int powerOf = 1;

            for (int num2 = 1; num2 <= 5; num2++) {
                powerOf *= num;
            }
            System.out.println ( num + "⁵" + " = " + powerOf );
        }
    }
}
