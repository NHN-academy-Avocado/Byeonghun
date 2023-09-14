package _2_ObjectsAndVariables;

import javax.swing.*;

public class Exercise02_5 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Insert a String");
        StringBuffer result = new StringBuffer();
        result.append(input.substring(input.length()-1, input.length()));
        result.append(input.substring(1,input.length()-1));
        result.append(input.substring(0,1));
        System.out.println(result);
    }
}
