package luckyUser;

import java.util.Scanner;

public class menu {
    Scanner scanner = new Scanner(System.in);

    void menu() {


        boolean exit = true;
        do {

            System.out.println("1. Register \n" +
                    "2. List Users \n" +
                    "3. Lucky Users \n" +
                    "4. Exit \n" +
                    "Your Choice : ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    registration.register();
                    break;
                case 2:
                    registration.userList(registration.users);
                    break;
                case 3:
                    registration.printHappyUser(registration.users);
                    break;
                case 4:
                    exit = false;
                    break;
                default:
                    System.out.println("You entered wrong characters!!!");
                    break;
            }

        } while (exit);
    }
}
