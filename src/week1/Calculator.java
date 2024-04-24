package week1;

import java.util.Scanner;

public class Calculator {
    public static void main ( String[] args ) {
        double n1, n2;
        byte operand;

        Scanner input = new Scanner ( System.in );

        System.out.print ( "İlk sayıyı giriniz: " );
        n1 = input.nextDouble ();

        System.out.print ( "İkinci sayıyı giriniz: " );
        n2 = input.nextDouble ();

        System.out.println ( "Yapılacak işlem için seçim yapınız:" );
        System.out.println ( "Toplama işlemi için 1\nÇıkarma işlemi için 2\nÇarpma işlemi için 3\nBölme işlemi için 4" );
        operand = input.nextByte ();

        switch (operand) {
            case 1:
                System.out.println ( n1 + " + " + n2 + " = " + (n1 + n2) );
                break;
            case 2:
                System.out.println ( n1 + " - " + n2 + " = " + (n1 - n2) );
                break;
            case 3:
                System.out.println ( n1 + " * " + n2 + " = " + (n1 * n2) );
                break;
            case 4:
                System.out.println ( n1 + " / " + n2 + " = " + (n1 / n2) );
                break;
        }

    }
}
