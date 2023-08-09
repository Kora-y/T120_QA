package practice_day07;

public class C03_array {
    /*
    Bir array oluşturun, ve içine 5 adet isim ekleyin
    Daha sonra bu isimleri sondan başlayarak ekrana yazdırın

    Örnek Çıktı :
    Son isim : Ahmet
    Son ikinci isim : Mehmet
     */
    public static void main(String[] args) {

        String[] isimListesi = {"Koray", "Ayşe", "Mehmet", "Fatih"};

        for (int i = (isimListesi.length - 1); 0 <= i; i--) {
            switch (i) {
                case 0:
                    System.out.println("Son dördüncü isim : " + isimListesi[i]);
                    break;
                case 1:
                    System.out.println("Son üçüncü isim : " + isimListesi[i]);
                    break;
                case 2:
                    System.out.println("Son ikinci isim : " + isimListesi[i]);
                    break;
                case 3:
                    System.out.println("Son isim : " + isimListesi[i]);
            }

        }
    }
}
