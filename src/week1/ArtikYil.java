package week1;

import java.util.Scanner;

public class ArtikYil {
    public static void main ( String[] args ) {
        int year;

        Scanner input = new Scanner ( System.in );

        System.out.print ( "Yıl giriniz: " );
        year = input.nextInt ();

        /* Eğer yıl hem 4'e tam bölünüyor hem de 100'e bölümünden kalan 0 ise Artık yıldır.
           Bir de bundan bağımsız olarak 400'e tam bölünüyorsa da artık yıldır.
        */
        if ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ) {
            System.out.println ( year + " bir artık yıldır." );
        } else {

            // Bu kriterlerin hiçbirine uymuyorsa artık yıl değildir.
            System.out.println ( year + " bir artık yıl değildir." );
        }
    }
}
