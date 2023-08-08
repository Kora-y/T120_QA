package solvedQuestions;
import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğum tarihinizi giriniz (Gün/Ay): ");
        int gun = scanner.nextInt();
        int ay = scanner.nextInt();

        String burc = burcHesapla(gun, ay);
        System.out.println("Burcunuz: " + burc);
    }

    public static String burcHesapla(int gun, int ay) {
        String burc = "";

        switch (ay) {
            case 1:
                if (gun >= 22) {
                    burc = "Kova";
                } else {
                    burc = "Oğlak";
                }
                break;
            case 2:
                if (gun >= 20) {
                    burc = "Balık";
                } else {
                    burc = "Kova";
                }
                break;
            case 3:
                if (gun >= 21) {
                    burc = "Koç";
                } else {
                    burc = "Balık";
                }
                break;
            case 4:
                if (gun >= 21) {
                    burc = "Boğa";
                } else {
                    burc = "Koç";
                }
                break;
            case 5:
                if (gun >= 22) {
                    burc = "İkizler";
                } else {
                    burc = "Boğa";
                }
                break;
            case 6:
                if (gun >= 22) {
                    burc = "Yengeç";
                } else {
                    burc = "İkizler";
                }
                break;
            case 7:
                if (gun >= 23) {
                    burc = "Aslan";
                } else {
                    burc = "Yengeç";
                }
                break;
            case 8:
                if (gun >= 23) {
                    burc = "Başak";
                } else {
                    burc = "Aslan";
                }
                break;
            case 9:
                if (gun >= 23) {
                    burc = "Terazi";
                } else {
                    burc = "Başak";
                }
                break;
            case 10:
                if (gun >= 23) {
                    burc = "Akrep";
                } else {
                    burc = "Terazi";
                }
                break;
            case 11:
                if (gun >= 22) {
                    burc = "Yay";
                } else {
                    burc = "Akrep";
                }
                break;
            case 12:
                if (gun >= 22) {
                    burc = "Oğlak";
                } else {
                    burc = "Yay";
                }
                break;
            default:
                burc = "Geçersiz tarih";
                break;
        }

        return burc;
    }
}
