package _6_LoopStatements;

import static _6_LoopStatements.ReadInt.inputInt;

import javax.swing.*;

public class Exercises_6_1 {
    public static void main(String[] args) {
        int input = inputInt();
        int min = input;
        for (int i = 0; i < 9; i++) {
            input = inputInt();
            if(min > input)
                min = input;
        }
        System.out.println(min);
    }
}
