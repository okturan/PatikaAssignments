package week1;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );

        System.out.print ( "Doğum yılınızı giriniz: " );
        int year = input.nextInt ();

        System.out.print ( "Çin Zodyağı Burcunuz: " ); // Burç ne çıkacaksa çıksın öncesinde girizgah cümlesini basar.

        switch (year % 12) { // Doğum yılının 12'ye bölümünden kalanı hesaplayarak Çin zodyağı burcunu bulur.
            case 0:
                System.out.println ( "Maymun" );
                break;
            case 1:
                System.out.println ( "Horoz" );
                break;
            case 2:
                System.out.println ( "Köpek" );
                break;
            case 3:
                System.out.println ( "Domuz" );
                break;
            case 4:
                System.out.println ( "Fare" );
                break;
            case 5:
                System.out.println ( "Öküz" );
                break;
            case 6:
                System.out.println ( "Kaplan" );
                break;
            case 7:
                System.out.println ( "Tavşan" );
                break;
            case 8:
                System.out.println ( "Ejderha" );
                break;
            case 9:
                System.out.println ( "Yılan" );
                break;
            case 10:
                System.out.println ( "At" );
                break;
            case 11:
                System.out.println ( "Koyun" );
                break;
        }


    }
}
