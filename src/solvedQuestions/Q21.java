package solvedQuestions;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        // bir aydaki gün sayısını bulmak için bir program yazın
        // Örnek : bir ay girin  :2
        // bir yıl girin  :  2016
        // Şubat 2016'da 29 gün vardır

        /* ipucu:
            Switch Case kullanarak çözebiliriz. Şubat ayı senelere göre farklılık gösterir.
            Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!
            Artık yıl ile ilgili olarak NOT düşeyim değerli arkadaşlar!

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir ay giriniz : ");
        int girilenAy = scanner.nextInt();
        System.out.println("Lütfen bir yıl giriniz : ");
        int girilenyil = scanner.nextInt();



        switch (girilenAy) {
            case 1 :
                System.out.println("Ocak" + girilenyil + "'da 31 gün vardır");
                break;
            case 2:
                if (artikyilhesaplama(girilenyil)) {
                    System.out.println("Şubat " + girilenyil + "'da 29 gün vardır");
                } else {
                    System.out.println("Şubat " + girilenyil + "'da 28 gün vardır");
                }
                break;
            case 3:
                System.out.println("Mart" + girilenyil + "'da 31 gün vardır");
                break;
            case 4:
                System.out.println("Nisan" + girilenyil + "'da 30 gün vardır");
                break;
            case 5:
                System.out.println("Mayıs" + girilenyil + "'da 31 gün vardır");
                break;
            case 6:
                System.out.println("Haziran" + girilenyil + "'da 30 gün vardır");
                break;
            case 7:
                System.out.println("Temmuz" + girilenyil + "'da 31 gün vardır");
                break;
            case 8:
                System.out.println("Ağustos" + girilenyil + "'da 31 gün vardır");
                break;
            case 9:
                System.out.println("Eylül" + girilenyil + "'da 30 gün vardır");
                break;
            case 10:
                System.out.println("Ekim" + girilenyil + "'da 31 gün vardır");
                break;
            case 11:
                System.out.println("Kasım" + girilenyil + "'da 30 gün vardır");
                break;
            case 12:
                System.out.println("Aralık" + girilenyil + "'da 31 gün vardır");
                break;
            default:
                System.out.println("Geçersiz ay girişi");
                break;
        }

    }

    public static boolean artikyilhesaplama(int girilenyil) {
        String sonikiSayi = girilenyil + "";
      boolean flag = false;
        if (!(sonikiSayi.substring(sonikiSayi.length()-2).equals("00")) && girilenyil % 4 == 0) {
            flag = true ;
        } else if (sonikiSayi.substring(sonikiSayi.length()-2).equals("00") && girilenyil % 400 == 0 ) {
            flag = true;
        }
        else {
            flag = false;
        }





        return flag;
    }
}
