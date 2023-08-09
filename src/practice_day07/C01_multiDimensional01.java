package practice_day07;

public class C01_multiDimensional01 {
    /*
   Bir okulun öğrencilerinin matematik sınav notlarını saklamak için
   bir program yapmanız gerekmektedir. Her öğrenci için
   iki dönemlik (örneğin, ilk ve ikinci dönem) sınav notlarını saklamak için
   kullanmanız gerekmektedir. öğrencilere ait notları ve yıl ortalamasını hesaplayan
   Java programını yazınız:
    */
    //MultiDimensional Array : İç içe array arr={{5. sınıf Öğrencileri},{6.sınıf Öğrencileri}}
    // arr={{{5A},{5B},{5C}}{{6A},{6B}}}
    // [][] : çoklu array tanımlamasıdır. her array için bir [] kullanılır.


    public static void main(String[] args) {
        // Sınav notları için her bir öğrenci için her bir dönem notunu ekleyeceğimiz iç içe 2'li array oluşturalım
        int [][] sinavNotlari={
                {80,100}, //Birinci öğrencinin dönem notları
                {75,90}, //İkinci öğrencinin dönem notları
                {100,100}, //Üçüncü öğrencinin dönem notları
                {60,60}, //Dördüncü öğrenicinin dönemm notları
                {30,90} //Beşinci öprencinin dönem notları
        };

        for (int i = 0; i < sinavNotlari.length; i++) {
            int ilkDonemNotu=sinavNotlari[i][0];
            int ikinciDonemNotu=sinavNotlari[i][1];

            System.out.println((i+1)+". Öğrencinin notları"); //index 0'dan başladığı için index'i sıfır olan öğrenci 1. öğrencidir
            //28.satırda iç içe arraylar'i çağırıyoruz
            //{{0,1,2,3,4},{0,1,2,3},{0,1}}  [0][3]---> 3
            //{{ali,murat,hakan,ahmet,musatafa},.... } [0][3]----> ahmet

            System.out.println("Birinci Dönem Notu: "+ilkDonemNotu);
            System.out.println("İkinci Dönem Notu: "+ikinciDonemNotu);

            //Yılsonu notunu hesaplamak için iki notun ortalaması alınır
            double yilSonuNotu=(ikinciDonemNotu+ilkDonemNotu)/2.0;


            System.out.println("Yıl Sonu Ortalması: "+yilSonuNotu);
            System.out.println("-------------------------------------------------------");
        }
    }

}
