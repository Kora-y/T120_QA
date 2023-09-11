package simpleNotePad;

public class Note {
    private String title ;
    private String content;

    private String deadline ;

    public Note(String title,String content, String deadline) {
        this.title = title;
        this.content = content;
        this.deadline = deadline;
    }


    @Override
    public String toString() {
        return "Note{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", deadline='" + deadline + '\'' +
                '}';
    }
}
