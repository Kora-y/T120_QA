package simpleNotePad;

import java.util.Scanner;

public class Menu {

    static String userName;

    static String password;

    static int failedTry = 0;

    public static void register() {
        String userName;
        String password;

        Scanner scanner = new Scanner(System.in);
        System.out.println("At first,please register to take notes on our app. \n" +
                "Please enter a username : ");
        userName = scanner.next();
        Menu.userName = userName;
        System.out.println("");
        System.out.println("Please enter a password : ");
        password = scanner.next();
        Menu.password = password;
        System.out.println("You have successfully registered to our app . ");

        login();
    }

    public static void login() {


        String userName;
        String password;
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter the username that you are registered with : ");

        userName = scanner.next();

        System.out.println("Please enter the password that you've specified at registration");

        password = scanner.next();

        if (Menu.userName.equals(userName) && Menu.password.equals(password)) {

            menu();


        } else if (failedTry == 3) {
            System.out.println("You've reached the maximum amount of trial");


            System.exit(0);

        } else {
            System.out.println("Username or password is false,please try again");
            failedTry++;
            login();
        }
    }

    public static void menu() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Add a new note \n" +
                "2 - Edit a note \n" +
                "3 - Delete a note \n" +
                "4 - View a note \n" +
                "5 - Log out \n" +
                "6 - Exit");

        int selection = scanner.nextInt();

        switch (selection) {
            case 1:
                MethodStorage.addNewNote();
            case 2:
                MethodStorage.editNote();
            case 3:
                MethodStorage.deleteNote();
            case 4:
                MethodStorage.viewNote();
            case 5:
                login();
            case 6:
                System.exit(0);
            default:
                System.out.println("Geçersiz bir giriş yaptınız, lütfen yeniden deneyiniz");
                menu();
        }


    }
}
