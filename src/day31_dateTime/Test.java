package day31_dateTime;

public class Test {
    public static void main(String[] args) {
        printLength("koray");
    }

    public static void printLength(String... varargs) {
        System.out.println("Varargs length: " + varargs.length); // Output: Varargs length: 1
    }
}
