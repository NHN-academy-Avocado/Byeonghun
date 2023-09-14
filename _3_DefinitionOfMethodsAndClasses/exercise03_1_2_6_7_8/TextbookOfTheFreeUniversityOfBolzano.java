package _3_DefinitionOfMethodsAndClasses.exercise03_1_2_6_7_8;

public class TextbookOfTheFreeUniversityOfBolzano extends Textbook {
    private String faculty;

    public TextbookOfTheFreeUniversityOfBolzano(String title, String author, String course, String faculty) {
        super(title, author, course);
        this.faculty = faculty;
    }
    @Override
    public void printBook(){
//        System.out.println(this.getTitle());
//        System.out.println(this.getAuthor());
//        System.out.println(this.getCourse());
        super.printBook();
        System.out.println(this.faculty);
    }
}
