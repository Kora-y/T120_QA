package day44_maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class C04_IsimSoyisimIleOgrenciBulma {
    /*
    öğrenci mapinde verilen isim ve soyisime sahip öğrencilerin
    isim,soy isim sınıf ve şubelerini yazdırın

     */

    public static void main(String[] args) {

        Map<Integer, String> ogrenci = MethodDeposu.ogrenciMapOlustur();


        System.out.println(ogrenci);

        Collection<String> ogrenciCollection = ogrenci.values();

        System.out.println(ogrenciCollection);

        for (String each: ogrenciCollection
             ) {
            String[] valueArr = each.split("-");

            for (int i = 0; i < valueArr.length; i++) {
                System.out.print(valueArr[i] + ",");
            }
            System.out.println();
        }
    }


    public static void isimSoyIsimileOgrenciBulma(Map<Integer, String> ogrenciMap, String ogrenciIsim, String ogrenciSoyIsim) {

        Collection<String> ogrenciCollection = ogrenciMap.values();  // mapteki Valuelar artık bir collection
                                                                     // olan "ogrenciCollection" a atıldı.


        for (String each : ogrenciCollection    // ogrenciCollection içerisindeki her bir value each içine geçici süre depolandı.

        ) {
            String[] valueArr = each.split("-");   // for-each scope'undaki her bir each değişkeni için, each'in barındırdığı
                                                        //  değer .split() methodu ile aralardaki  "-" elimine edilerek valueArr'ye
                                                        // depolandı

        }

    }
}
