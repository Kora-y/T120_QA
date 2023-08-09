package practice_day07;


import java.util.Scanner;
import java.util.ArrayList;

public class C05_arrayList02 {
    // Kullanıcıdan 5 adet sayı alarak bir ArrayList oluşturun.
    // Ardından bu sayıların toplamını hesaplayarak ekrana yazdırın.
// Örnek çıktı:
// Toplam: 23


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        ArrayList<Integer> sayilar=new ArrayList<>();

        System.out.println("Toplanacak Sayıları giriniz");

        for (int i = 0; i <5 ; i++) {
            System.out.print((i+1)+". Sayı:");
            int sayi= scan.nextInt();
            sayilar.add(sayi);
        }

        int toplam=0;
        for (int sayi:sayilar) {
            toplam+=sayi;
        }

        System.out.println("Sayıların toplamı: "+toplam);
    }
}
