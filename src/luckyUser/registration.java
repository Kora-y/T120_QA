package luckyUser;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class registration {

    static ArrayList<user> users = new ArrayList<>();

   static Scanner scanner = new Scanner(System.in);

    static ArrayList<user> register() {
        System.out.println("İsminizi giriniz : ");
        String name = scanner.nextLine();
        LocalDateTime time = LocalDateTime.now();
        user user = new user(name,time);
        users.add(user);

        return users;
    }


   static void printHappyUser(ArrayList<user> list) {
        for (user each: list
             ) {

            if (each.registerDate.getSecond() <= 10) {
                System.out.println(each.name + "hadi iyisin  5 kilo balı kaptın...");

            }
            else  {
                System.out.println(each.name + "bu sefer olmadı. Bi dahaki sefere...");

            }
        }
    }
    static void userList(ArrayList<user> list) {
        for (user each:list
             ) {
            System.out.println("İsim:" + each.name + "Kayıt Zamanı: " + each.registerDate);
        }
    }
}
