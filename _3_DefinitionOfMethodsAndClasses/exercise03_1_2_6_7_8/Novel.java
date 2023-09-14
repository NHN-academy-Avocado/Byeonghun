package _3_DefinitionOfMethodsAndClasses.exercise03_1_2_6_7_8;

public class Novel extends Book {
    private String type;

    public Novel(String title, String author, String type) {
        super(title, author);
        this.type = type;
    }
    @Override
    public void printBook(){

    }
}
