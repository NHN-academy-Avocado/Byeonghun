package programming.chapter5.conditional_statements;

import javax.swing.*;

public class Exercises05p1 {
    public static void main(String[] args) {
        int g = Integer.parseInt(JOptionPane.showInputDialog("도수를 입력하요 : "));
        if(g > 40){
            System.out.println("extra strong liquor");
        } else if (20 < g) {
            System.out.println("strong liquor");
        } else if (15 < g) {
            System.out.println("liquor");
        }else if(12 < g){
            System.out.println("strong vine");
        }else if(10.5 < g){
            System.out.println("nomal vine");
        }else{
            System.out.println("light vine");
        }
    }
}
