package week1;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );

        System.out.print ( "Kullanıcı adınızı giriniz: " );
        String username = input.nextLine ();

        System.out.print ( "Şifrenizi giriniz: " );
        String password = input.nextLine ();

        if ( username.equals ( "patika" ) && password.equals ( "deneme123" ) ) {
            System.out.println ( "Başarıyla giriş yaptınız" );
        } else {
            System.out.println ( "Şifrenizi hatalı girdiniz.\nŞifrenizi Değiştirmek isterseniz 1'e\nDeğiştirmek istemezseniz 2'ye basınız." );
            byte choice = input.nextByte ();
            input.nextLine ();
            if ( choice == 1 ) {
                System.out.print ( "Yeni şifrenizi giriniz: " );
                String newPassword = input.nextLine ();

                if ( newPassword.equals ( "deneme123" ) ) {
                    System.out.println ( "Şifre oluşturulamadı, lütfen başka şifre giriniz." );
                } else {
                    System.out.println ( "Şifre oluşturuldu." );
                }

            } else {
                System.out.println ( "Güle güle!" );
            }

        }
    }
}
