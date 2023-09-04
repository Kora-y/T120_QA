package luckyUser;

import java.util.Scanner;

public class menu {
    Scanner scanner = new Scanner(System.in);

    void menu() {


        boolean cikis = true;
        do {

            System.out.println("1. Kayıt işlemi \n" +
                    "2. Kişi Listele \n" +
                    "3. Şanslı Kişiler \n" +
                    "4. Çıkış \n" +
                    "Seçiminiz : ");

            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
 registration.register();

                case 2:
                case 3:
                case 4:
                default:
            }

        } while (cikis);
    }
}
