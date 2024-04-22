package week1;

import java.util.Scanner;

public class Taksimetre {
    public static void main ( String[] args ) {
        double rate = 2.2;
        int minimumFare = 20;
        int initialFare = 10;

        Scanner input = new Scanner ( System.in );

        System.out.print ( "Kaç KM gidileceğini girin: " );
        int distance = input.nextInt ();

        double fare = distance * rate;
        fare += initialFare;

        if ( fare <= minimumFare ) {
            System.out.println ( "Tutar " + minimumFare + " liradır" );
        } else {
            System.out.println ( "Tutar " + fare + " liradır" );
        }

    }
}
