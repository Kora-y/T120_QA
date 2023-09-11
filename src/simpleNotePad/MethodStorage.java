package simpleNotePad;


import day35_inheritance.Araba;

import java.util.ArrayList;
import java.util.Scanner;

public class MethodStorage {

    static ArrayList<Note> notes = new ArrayList<>();

    public static ArrayList<Note> addNewNote() {
        System.out.println("Please type your Content : ");
        Scanner scanner = new Scanner(System.in);
        String note = scanner.nextLine();
        System.out.println("Please type your Title : ");
        String title = scanner.nextLine();
        System.out.println("Please type deadline : ");
        String deadLine = scanner.nextLine();
        Note noteScope = new Note(title, note, deadLine);

        notes.add(noteScope);

        Menu.menu();


        return notes;

    }

    public static void editNote() {


    }

    public static void deleteNote() {

    }
    public static void viewNote() {

        Note note = new Note();

        note.getInfo(notes);
    }


}
