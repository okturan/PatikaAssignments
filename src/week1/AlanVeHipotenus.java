package week1;

import java.util.Scanner;

public class AlanVeHipotenus {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );

        System.out.println ( "Üçgenin a kenarının uzunluğunu cm cinsinden giriniz" );
        double a = in.nextInt ();

        System.out.println ( "Üçgenin b kenarının uzunluğunu cm cinsinden giriniz" );
        double b = in.nextInt ();

        double hypotenuse = Math.sqrt ( a * a + b * b );
        System.out.println ( "Verdiğiniz ölçülere sahip üçgenin hipotenüsü = " + hypotenuse + "cm'dir");

        double u = (a + b + hypotenuse) / 2;
        double area = Math.sqrt ( u * (u - a) * (u - b) * (u - hypotenuse) );

        System.out.println ( "Bu üçgenin alanı ise = " + area + "cm²'dir");
    }
}
