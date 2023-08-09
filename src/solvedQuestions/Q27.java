package solvedQuestions;

public class Q27 {
    public static void main(String[] args) {
        /*
        Soru 27-) 'a' ile 'z' arasındaki karakterlerin ASCII değerlerini yazdıran bir Java programı yazın
            ipucu: For Loop ve Char kullanarak çözebilirsiniz.
            örnek:
            Ascii value of a = 97
            Ascii value of b = 98
            Ascii value of c = 99
            Ascii value of d = 100
         */

        for (int i = 'a'; i <= 'z' ; i++) {
            System.out.println("ASCII value of " + (char)i + " = " + i);
        }

    }
}
