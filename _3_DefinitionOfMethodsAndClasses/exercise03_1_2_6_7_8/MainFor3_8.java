package _3_DefinitionOfMethodsAndClasses.exercise03_1_2_6_7_8;

public class MainFor3_8 {
    public static void main(String[] args) {
//        Book first = new TextbookOfTheFreeUniversityOfBolzano("JAVA", "PPIPO","Programming","POPPI");
        Textbook first = new TextbookOfTheFreeUniversityOfBolzano("JAVA", "PPIPO","Programming","POPPI");
        first.printBook();
        System.out.println("===========================");
        Book second = new Book("coca", "cola");
        Novel third = new Novel(second.getTitle(), second.getAuthor(), "study");
        second.printBook();
        System.out.println("===========================");
        first.setPrice(130);
        first.printBookPrice();
        System.out.println("===========================");

    }
}
