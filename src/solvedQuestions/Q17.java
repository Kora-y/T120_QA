package solvedQuestions;
import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 3 harfli bir isim giriniz: ");
        String isim1 = scanner.next();

        if (isim1.length() != 3) {
            System.out.println("Lütfen 3 harfli bir isim giriniz.");
        } else if (isim1.charAt(0) == isim1.charAt(1) || isim1.charAt(1) == isim1.charAt(2) || isim1.charAt(0) == isim1.charAt(2)) {
            System.out.println("Dize yinelenen karakterlere sahip.");
        } else {
            System.out.println("Dize benzersiz karakterlere sahip.");
        }
    }
}
