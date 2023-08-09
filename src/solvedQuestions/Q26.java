package solvedQuestions;

import java.util.Scanner;

public class Q26 {

     /*
    Soru 26-)
            Sayının Mükemmel sayı olup olmadığını kontrol eden kodu yazalım.
            NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse,
            bu tür sayılar Mükemmel Sayı olabilir.
            Örnek:
            Giriş :6
            Çıkış: 6 Mükemmel Sayıdır
            Giriş :7
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir tam sayı giriniz : ");

        int girilenSayi1 = scanner.nextInt();

        int pozitifBolenler = 0;

        boolean flag = false;
        for (int i = 1; i < girilenSayi1; i++) {


          if (girilenSayi1 % i == 0) { pozitifBolenler += i;}

          if (girilenSayi1 == pozitifBolenler) {flag = true;}
        }


        if (flag) {
            System.out.println("Sayı mükemmel sayıdır.");
        }
        else {
            System.out.println("Sayı mükemmel sayı değildir.");
        }
    }





}
