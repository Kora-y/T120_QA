package solvedQuestions;

import java.util.Scanner;

public class C01_Atm {
    static String kartNo = "123456";
    static String sifre = "1234";
    static Scanner scanner = new Scanner(System.in);

    static double bakiye = 50000;

    public static void main(String[] args) {
        /*

        Kullanıcıdan giriş için kart numarasi ve şifre isteyin,eğer herhangi birini yanlış girerse tekrar isteyin
        Kart numarası aralarda boşluk ile girerse de eğer doğruysa kabul edin
        Kart numarası ve şifre doğrulanırsa kullanıcının yapabileceği işlemleri ekrana yazdırın

        Menü listesinde bakiye sorgula,para yatırma,para çekme , para gönderme , şifre değiştirme
        ve çıkış işlemleri olacaktır

        para çekme ve para gönderme işleminde mevcut bakiyeden büyük para çekilemez

        para gönderme işleminde istenen iban TR ile başlamalı ve totalde 26 karakter olmalı,eğer değilse menü ekranına geri dönsün
        Şifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra , şifre değişiklik işlemini yapmalı

         */
        giris();
    }

    public static void giris() {
        System.out.println("Kart numarası giriniz : ");
        String kKartNo = scanner.nextLine();
        System.out.println("Sifrenizi giriniz : ");
        String kSifre = scanner.nextLine().replaceAll(" ","");
        if (kKartNo.equals(kartNo) && sifre.equals(kSifre)) {
            menu();
        } else {
            System.out.println("Hatalı giris yaptınız!");
            giris();
        }

    }

    public static void menu() {

        System.out.println("*******Nutella Bank*******\n+" +
                "1. BAKİYE SORGULAMA\n" +
                "2 . PARA YATIRMA\n" +
                "3.PARA ÇEKME\n" +
                "4.PARA GÖNDERME\n" +
                "5.ŞİFRE DEĞİŞTİRME\n" +
                "6.CIKIS\n" +
                "SECİM : ");
        int secim = scanner.nextInt();
        switch (secim) {
            case 1: {
                bakiyeSorgula();
            }
            case 2: {
                System.out.println("Yatırmak istediğiniz miktarı giriniz : ");
                double miktar = scanner.nextDouble();
                paraYatirma(miktar);
            }
            case 3: {

            }
            case 4: {

            }
            case 5: {

            }
            case 6: {

            }
        }


    }

    public static void bakiyeSorgula() {
        System.out.println("Bakiye : " + bakiye + "$");
        menu();
    }

    public static void paraYatirma(double miktar) {
        bakiye += miktar;
        System.out.println("Yeni bakiyeniz : " + bakiye);
    }
}
