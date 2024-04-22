package week1;

import java.util.Scanner;

public class Manav {
    public static void main ( String[] args ) {
        double pearWeight, appleWeight, tomatoWeight, bananaWeight, eggplantWeight;
        double pearPrice = 2.14, applePrice = 3.67, tomatoPrice = 1.11, bananaPrice = 0.95, eggplantPrice = 5.0;
        double pear, apple, tomato, banana, eggplant;

        Scanner input = new Scanner ( System.in );

        System.out.print ( "Kaç kilo armut alacaksınız?: " );
        pearWeight = input.nextDouble ();
        pear = pearPrice * pearWeight;
        System.out.println ( pearWeight + " kilo armut " + pear + " liradır" );

        System.out.print ( "Kaç kilo elma alacaksınız?: " );
        appleWeight = input.nextDouble ();
        apple = applePrice * appleWeight;
        System.out.println ( appleWeight + " kilo elma " + apple + " liradır" );

        System.out.print ( "Kaç kilo domates alacaksınız?: " );
        tomatoWeight = input.nextDouble ();
        tomato = tomatoPrice * tomatoWeight;
        System.out.println ( tomatoWeight + " kilo domates " + tomato + " liradır" );

        System.out.print ( "Kaç kilo muz alacaksınız?: " );
        bananaWeight = input.nextDouble ();
        banana = bananaPrice * bananaWeight;
        System.out.println ( bananaWeight + " kilo muz " + banana + " liradır" );

        System.out.print ( "Kaç kilo patlıcan alacaksınız?: " );
        eggplantWeight = input.nextDouble ();
        eggplant = eggplantPrice * eggplantWeight;
        System.out.println ( eggplantWeight + " kilo patlıcan " + eggplant + " liradır" );

        double total = pear + apple + tomato + banana + eggplant;

        System.out.println ( "Toplam ücret " + total + " liradır" );

    }
}
