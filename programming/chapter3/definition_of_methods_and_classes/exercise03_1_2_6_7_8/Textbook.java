package programming.chapter3.definition_of_methods_and_classes.exercise03_1_2_6_7_8;

public class Textbook extends Book{
    private final String course;
    public Textbook(String title, String author, String course) {
        super(title, author);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
    @Override
    public void printBook(){
//        System.out.println(this.getTitle());
//        System.out.println(this.getAuthor());
        super.printBook();
        System.out.println(this.course);
    }
}
