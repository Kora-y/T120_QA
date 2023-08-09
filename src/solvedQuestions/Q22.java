package solvedQuestions;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        /*
        Soru 22-)
                 Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
                  Giriş :
                   30 ve 40

                    Beklenen Çıktı:
                    30 ve 40 için EBOB= 10
                    30 ve 40 için EKOK= 120
         */

        menu();


    }

    public static void ebobBulma() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz : ");
        int girilenSayi1 = scanner.nextInt();
        System.out.println("Lütfen ikinci bir sayi giriniz : ");
        int girilenSayi2 = scanner.nextInt();

        int enKucugu;
        int temp = 0;
        if (girilenSayi1 < girilenSayi2) {
            enKucugu = girilenSayi1;
        } else {
            enKucugu = girilenSayi2;
        }


        for (int i = 1; i <= enKucugu; i++) {
            if ((girilenSayi1 % i == 0) && (girilenSayi2 % i == 0)) {
                temp = i;
            }

        }
        System.out.println(temp);

    }

    public static void ekokBulma() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz : ");
        int girilenSayi1 = scanner.nextInt();
        System.out.println("Lütfen ikinci bir sayi giriniz : ");
        int girilenSayi2 = scanner.nextInt();

        int enBuyugu;
        int temp = 0;
        if (girilenSayi1 > girilenSayi2) {
            enBuyugu = girilenSayi1;
        } else {
            enBuyugu = girilenSayi2;
        }
        for (int i = enBuyugu; i <= girilenSayi2 * girilenSayi1; i++) {
            if (i % girilenSayi1 == 0 && i % girilenSayi2 == 0) {
                temp = i;
                break;
            }
        }

        System.out.println(temp);


    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("Lütfen hangi işlemi yapmak istediğiniz seçin : ");
        System.out.println(" 1 - EBOB BULMA");
        System.out.println(" 2 - EKOK BULMA");
        System.out.println("--------------------------------");
        int secim = scanner.nextInt();
        if (secim == 1) {
            ebobBulma();
        } else if (secim == 2) {
            ekokBulma();
        }
    }

}
