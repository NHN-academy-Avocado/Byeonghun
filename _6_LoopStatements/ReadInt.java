package _6_LoopStatements;

import javax.swing.*;
public class ReadInt {
    public static int inputInt() {
        return Integer.parseInt(JOptionPane.showInputDialog("정수 입력"));
    }
    public static int inputInt(String str) {
        return Integer.parseInt(JOptionPane.showInputDialog(str));
    }
}
