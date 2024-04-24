package week1;

import java.util.Scanner;

public class EtkinlikOnerici {
    public static void main ( String[] args ) {
        int temp;

        Scanner input = new Scanner ( System.in );

        System.out.print ( "Lütfen günün sıcaklığını celcius cinsinden giriniz: " );
        temp = input.nextInt ();

        if ( temp < 5 ) {
            System.out.println ( "Kayak yapmayı öneririm." );
        } else if ( temp < 15 ) {
            System.out.println ( "Sinemaya gitmeyi öneririm." );
        } else if ( temp < 25 ) {
            System.out.println ( "Pikniğe gitmeyi öneririm." );
        } else {
            System.out.println ( "Yüzmeyi öneririm." );
        }
    }
}
