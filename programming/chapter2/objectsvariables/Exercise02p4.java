package programming.chapter2.objectsvariables;

import javax.swing.*;

public class Exercise02p4 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Insert a String");
        String first = input.substring(0,1);
        String last = input.substring(input.length()-1);
        input = last + input.substring(1,input.length()-1) + first;
        System.out.println(input);
    }
}
