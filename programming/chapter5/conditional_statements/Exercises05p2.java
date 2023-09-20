package programming.chapter5.conditional_statements;

import javax.swing.*;

public class Exercises05p2 {
    public static void main(String[] args) {
        int a,b,c;
        int count = 0;
        a = Integer.parseInt(JOptionPane.showInputDialog("a : "));
        b = Integer.parseInt(JOptionPane.showInputDialog("a : "));
        if(a == b) ++count;
        c = Integer.parseInt(JOptionPane.showInputDialog("a : "));
        if(a == c || b == c) ++count;
        if(count == 0){
            System.out.println("irregular");
        } else if (count == 1) {
            System.out.println("symmetric");
        }else {
            System.out.println("regular");
        }

    }
}
