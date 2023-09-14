package _4_PrimitiveDataTypesInJava;

import javax.swing.*;

public class Exercise04_3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("첫번째 숫자를 입력해 주세요 : "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("두번째 숫자를 입력해 주세요 : "));
        System.out.println((a+b)/2);
        System.out.println(Math.sqrt((double) a));
        System.out.println(Math.sqrt(b));
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
    }

}
