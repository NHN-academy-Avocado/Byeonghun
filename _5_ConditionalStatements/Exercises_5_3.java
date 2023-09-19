package _5_ConditionalStatements;

import javax.swing.*;

public class Exercises_5_3 {
    public static void main(String[] args) {
        int a,b,c;
        int count = 0;
        a = Integer.parseInt(JOptionPane.showInputDialog("a : "));
        b = Integer.parseInt(JOptionPane.showInputDialog("a : "));
        if(a == b) ++count;
        c = Integer.parseInt(JOptionPane.showInputDialog("a : "));
        if(a == c || b == c) ++count;

        if(count > 0){
            if (count == 1) {
                System.out.println("symmetric");
            }
            System.out.println("regular");
        }
        System.out.println("irregular");
    }
}
