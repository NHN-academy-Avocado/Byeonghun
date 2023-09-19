package _5_ConditionalStatements;

import javax.swing.*;

public class Exercises_5_6 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("입력 : ");
        String b = a.substring(0,4);
        char c = a.charAt(a.length()-1);
        if(b.equals("vocal")){
            System.out.println("MAYBE");
        }else if(c == 'a' || c == 'i'|| c == 'u'){
            System.out.println("YES");
        } else if (c == 'e' || c == 'o') {
            System.out.println("NO");
        }else {
            System.out.println("DON'T KNOW");
        }
    }
}
