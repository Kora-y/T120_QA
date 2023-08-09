package solvedQuestions;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {

        System.out.println("Lütfen faktöriyeli alınacak bir sayı girin : ");
        Scanner scanner = new Scanner(System.in);

        int girilenSayi1 = scanner.nextInt();

        System.out.println(faktorHesaplama(girilenSayi1));
    }



    public static int faktorHesaplama(int girdi1) {
        int faktoriyel = 1;
        for (int i = 1; i <= girdi1 ; i++) {
            faktoriyel = faktoriyel * i;
        }
        return faktoriyel;
    }
}

