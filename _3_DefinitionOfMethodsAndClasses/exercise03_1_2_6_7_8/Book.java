package exercise03_1_2_6_7_8;

import java.util.Scanner;
import javax.swing.*;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public Book(Scanner sc){
        this.title = sc.nextLine();
        this.author = sc.nextLine();
    }

    public void printBook() {
        System.out.println(this.title);
        System.out.println(this.author);
    }

    public void printBookPrice() {
        printBook();
        System.out.println(price);
    }

    public String getTitle() {
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setPrice(){this.price = readInput("prive : ");}

    public static int readInput(String s) {
        return Integer.parseInt(JOptionPane.showInputDialog(s));
    }

}
