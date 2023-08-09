package solvedQuestions;

public class Q24 {
    public static void main(String[] args) {

        /*
        Soru 24-)
                20'den 0'a kadar çift sayıları yazdırın ancak decrement (i--) kullanmayın.
                Örnek:
                100'den 0'a kadar Çift Sayılar şunlardır: 20 18 16 14 12 10 8 6 4 2 0

         */
        System.out.print("20'den geriye çift sayılar : ");

        for (int i = 20; i >= 0; i--) {
            int çiftSayi = 2 * i;
            System.out.print(çiftSayi + " ");
        }

    }
}
