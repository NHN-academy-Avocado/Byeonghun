package programming.chapter5.conditional_statements;

import javax.swing.*;

public class Exercises05p6 {
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
