package solvedQuestions;
import java.util.Scanner;


public class Q18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen araç hızı giriniz : ");
        int aracHizi = scanner.nextInt();
        System.out.println("Lütfen yol kilometresi giriniz : ");
        int yolKilometresi = scanner.nextInt();
        System.out.println("Varış süreniz aşağıdaki gibidir");
        System.out.println(varisSuresi(aracHizi,yolKilometresi));
    }
    public static int varisSuresi(int aracHizi,int yolKilometresi) {

        int varisSuresi = yolKilometresi / aracHizi;

        return varisSuresi;
    }
}
