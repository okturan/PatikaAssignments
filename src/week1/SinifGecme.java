package week1;

import java.util.Scanner;

public class SinifGecme {
    public static void main ( String[] args ) {
        int math, physics, turkish, chemistry, music, total = 0, counter = 0, result;
        Scanner input = new Scanner ( System.in );

        System.out.print ( "Matematik notunuzu giriniz: " );
        math = input.nextInt ();
        if ( math >= 0 && math <= 100 ) {
            total += math;
            counter++;
        }

        System.out.print ( "Fizik notunuzu giriniz: " );
        physics = input.nextInt ();
        if ( physics >= 0 && physics <= 100 ) {
            total += physics;
            counter++;
        }

        System.out.print ( "Türkçe notunuzu giriniz: " );
        turkish = input.nextInt ();
        if ( turkish >= 0 && turkish <= 100 ) {
            total += turkish;
            counter++;
        }

        System.out.print ( "Kimya notunuzu giriniz: " );
        chemistry = input.nextInt ();
        if ( chemistry >= 0 && chemistry <= 100 ) {
            total += chemistry;
            counter++;
        }

        System.out.print ( "Müzik notunuzu giriniz: " );
        music = input.nextInt ();
        if ( music >= 0 && music <= 100 ) {
            total += music;
            counter++;
        }
        result = total / counter;

        String message = ( result >= 55) ? "Ortalamanız " + result + ". Geçtiniz." : "Ortalamanız " + result + ". Kaldınız.";
        System.out.println (message);
    }
}
