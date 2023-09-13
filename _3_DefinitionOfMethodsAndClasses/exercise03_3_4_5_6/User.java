package exercise03_3_4_5_6;

import java.util.Scanner;
import javax.swing.*;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senderNum = "010-6255-4473";
        MessageText mts = new MessageText(scanner);
        String code = readInput("code : ");
        String text = readInput("text : ");
        MessageText mt = new MessageText(code, text);
        String numberToCall = readInput("Number to call : ");
        Message test = new Message(mt, numberToCall, senderNum);
        test.print();
    }
    public static String readInput(String show){
        return JOptionPane.showInputDialog(show);
    }
}
