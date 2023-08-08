package day31_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {
        //Kullanıcının verdiği doğum tarihine göre
        //kullanıcının yaşını yıl ve ay olarak yazdıran bir program yazın

        LocalDate dogumTarihi = LocalDate.of(2016,07,15);
        LocalDate bugun = LocalDate.now();

        System.out.println(Period.between(dogumTarihi, bugun));

        System.out.println(Period.between(dogumTarihi, bugun).getYears());


    }
}
