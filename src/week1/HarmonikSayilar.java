package week1;

import java.util.Scanner;

public class HarmonikSayilar {
    public static void main ( String[] args ) {
        double n, result = 0;
        Scanner input = new Scanner ( System.in );
        System.out.print ( "Bir sayı giriniz: " );
        n = input.nextInt ();

        for (int i = 1; i <= n; i++) {
            // Sayımıza kadar her değeri 1'e bölüyoruz. 1'le başlayaran 1/sayımız olana kadar ekliyoruz.
            result += 1.0 / i;
        }
        System.out.println ( n + " sayısının harmonik seri sonucu = " + result );
    }
}
