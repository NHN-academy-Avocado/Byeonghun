package _3_DefinitionOfMethodsAndClasses.exercise03_1_2_6_7_8;

import javax.swing.*;

public class User {
    public static void main(String[] args) {
        String title, author;
        title = JOptionPane.showInputDialog("책 이름을 입력하세요");
        author = JOptionPane.showInputDialog("저자의 이름을 입력하세요");
        Book first = new Book(title,author);
        title = JOptionPane.showInputDialog("책 이름을 입력하세요");
        author = JOptionPane.showInputDialog("저자의 이름을 입력하세요");
        Book second = new Book(title,author);
        first.printBook();
        second.printBook();
        int price = 120;
        first.setPrice(price);
        first.printBookPrice();
    }
}
