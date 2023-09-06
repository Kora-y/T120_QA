package solvedQuestions.P01;

import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);
    static void menu() {
        System.out.println("Seçmek istediğiniz Geometrik şekli giriniz : \n" +
                "1. Çember \n" +
                "2. Dikdörtgen\n" +
                "3. Kare \n" +
                "4. Cikis\n" +
                "Seciminiz: ");
        int secim = scanner.nextInt();

        switch (secim) {
            case 1: {
                    cemberOlustur();
            }
            case 2: {
                dikdortgenOlustur();
            }
            case 3:
                kareOlustur();
            case 4:
                System.exit(0);
            default: {
                System.out.println("Yanlış değer girdiniz");
                menu();
            }
        }
    }

    private static void kareOlustur() {
        System.out.println("Karenin kenar  uzunluğunu giriniz");
        double kenarUzunlugu = scanner.nextDouble();
        Kare kare = new Kare(kenarUzunlugu,kenarUzunlugu);
        System.out.println(kare);
        menu();
    }

    private static void dikdortgenOlustur() {
        System.out.println("Uzun Kenar giriniz : ");
        double uzunKenar = scanner.nextDouble();
        System.out.println("Kısa Kenar giriniz");
        double kisaKenar = scanner.nextDouble();
        Dikdortgen dikdortgen = new Dikdortgen(uzunKenar,kisaKenar);
        System.out.println(dikdortgen);
        menu();
    }

    private static void cemberOlustur() {
        System.out.println("Çemberin yarı çapını giriniz : ");
        double yariCap = scanner.nextDouble();
        Cember cember = new Cember(yariCap);
        System.out.println(cember);
        menu();
    }
}
