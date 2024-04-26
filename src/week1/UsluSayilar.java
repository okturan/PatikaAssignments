package week1;

import java.util.Scanner;

public class UsluSayilar {
    public static void main ( String[] args ) {
        int n, k, total = 1;
        Scanner input = new Scanner ( System.in );

        System.out.println ( "Taban sayısını giriniz: " );
        n = input.nextInt ();

        System.out.println ( "Kuvveti giriniz: " );
        k = input.nextInt ();

        // Kuvvete gelene kadar i defa n çarpım işlemine girecek.
        for (int i = 1; i <= k; i++) {
            total *= n;
        }

        System.out.println ( n + "^" + k + " = " + total );
    }
}
