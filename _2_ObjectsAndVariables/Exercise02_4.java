package _2_ObjectsAndVariables;

import java.util.jar.JarOutputStream;
import javax.swing.*;

public class Exercise02_4 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Insert a String");
        String first = input.substring(0,1);
        String last = input.substring(input.length()-1, input.length());
        input = last + input.substring(1,input.length()-1) + first;
        System.out.println(input);
    }
}
