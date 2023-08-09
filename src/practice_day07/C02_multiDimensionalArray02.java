package practice_day07;
import java.util.Scanner;

public class C02_multiDimensionalArray02 {
    /*
       // 5x2'lik bir multidimension[Her birinin içinde 2li eleman bulunduran 5 elemanlı array] array oluşturun ve
        içine çeşitli şehir ve nüfus bilgileri ekleyin.
       // Daha sonra kullanıcıdan bir şehir adı alarak, bu şehrin nüfusunu ekrana yazdırın.
    */
    public static void main(String[] args) {
        String [][] sehirlerNufuslar={
                {"Ankara", "5.000.000"},
                {"Kırıkkale","277.000"},
                {"Adana", "2.000.000"},
                {"Elazığ","450.000"},
                {"Amsterdam","1.100.000"}
        };
        //Kullanıcıdan şehir adını alalım
        Scanner sehir=new Scanner(System.in);
        System.out.print("Nüfusunu öğrenmek istediğiniz şehir yazınız: ");
        String arananSehir= sehir.next();
        boolean kontrol=false;
        for (int i = 0; i < sehirlerNufuslar.length ; i++) {
            if (arananSehir.equalsIgnoreCase(sehirlerNufuslar[i][0])){
                System.out.println(arananSehir+" şehrinin nüfusu: "+sehirlerNufuslar[i][1]);
                kontrol=true;
                break;
            }
        }
        if(!kontrol){
            System.out.println("Girdiğiniz şehrin nüfusu datalarımızda mevcut değildir");
        }
    }
}
