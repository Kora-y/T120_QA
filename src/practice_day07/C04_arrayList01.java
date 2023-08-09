package practice_day07;

import java.util.ArrayList;

public class C04_arrayList01 {
     /*
    Bir arraylist oluşturun, ve içine 5 adet isim ekleyin
    Daha sonra bu isimleri sondan başlayarak ekrana yazdırın

    Örnek Çıktı :
    Son isim : Ahmet
    Son ikinci isim : Mehmet
     */

    public static void main(String[] args) {
        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("Burhan");
        isimler.add("Resul");
        isimler.add("Nergiz");
        isimler.add("Ömer Faruk");
        isimler.add("Afife");

        for (int i = isimler.size()-1; i >= 0; i--) {
            System.out.println("Sondan " + (isimler.size()-i) + ". isim " + isimler.get(i));
        }
    }
}
