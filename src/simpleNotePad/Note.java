package simpleNotePad;

import java.util.ArrayList;

public class Note {
    private String title ;
    private String content;

    private String deadline ;

    public Note() {

    }

    public Note(String title,String content, String deadline) {
        this.title = title;
        this.content = content;
        this.deadline = deadline;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getDeadline() {
        return deadline;
    }

    public void getInfo(ArrayList<Note> list) {
        for (Note note : list) {
            System.out.println("Title: " + note.getTitle());
            System.out.println("Content: " + note.getContent());
            System.out.println("Deadline: " + note.getDeadline());
            System.out.println("-------------------");
        }
    }
}
