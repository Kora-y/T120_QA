package solvedQuestions;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        /*
        Soru-28)
            Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
            Örnek:
            Sayı: 1238
            Sayının Tersi: 8321
            İpucu:  Loop kullanabilirsiniz.
         */

        Scanner  scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz : ");

        int girilenSayi1 = scanner.nextInt();

        String temp = girilenSayi1 + "";
        String terscevirilmisYazi = "";

        for (int i = temp.length()-1 ;  0 <= i ; i--) {

            terscevirilmisYazi += temp.charAt(i);
        }

        System.out.println(Integer.parseInt(terscevirilmisYazi));
    }
}
