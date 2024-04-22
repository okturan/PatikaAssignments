package week1;

import java.util.Scanner;

public class BMI {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );

        System.out.print ( "Ağırlğınızı kilogram cinsinden giriniz: " );
        double weight = input.nextDouble ();

        System.out.print ( "Boyunucu metre cinsinden giriniz: " );
        double height = input.nextDouble ();

        double BMI = weight / (height * height);
        System.out.println ( "Vücut Kitle İndeksiniz: " + BMI );
    }
}
