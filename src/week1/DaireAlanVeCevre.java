package week1;

import java.util.Scanner;

public class DaireAlanVeCevre {
    public static void main ( String[] args ) {
        double pi = 3.14;

        Scanner input = new Scanner ( System.in );

        System.out.print ( "Dairenin yarıçapını giriniz: " );
        int r = input.nextInt ();

        double area = pi * r * r;
        System.out.println ( "Dairenin alanı: " + area );
        double circumference = 2 * pi * r;
        System.out.println ( "Dairenin çapı: " + circumference );

        System.out.print ( "Dairenin diliminin açısını giriniz:" );
        int a = input.nextInt ();
        double sliceArea = (pi * (r * r) * a) / 360;
        System.out.println ( "Bu dilimin alanı: " + sliceArea );

    }
}
