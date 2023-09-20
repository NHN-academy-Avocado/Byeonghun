package programming.chapter2.objectsvariables;

import javax.swing.*;

public class Exercise02p5 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Insert a String");
        String result = input.substring(input.length() - 1) +
                input.substring(1, input.length() - 1) +
                input.charAt(0);
        System.out.println(result);
    }
}
