package _6_LoopStatements;

import static _6_LoopStatements.ReadInt.inputInt;

import javax.swing.*;

public class Exercises_6_2 {
    public static void printEvenNumber(int n){
        int even = 0;
        for (int i = 0; i < n; i++) {
            even += 2;
            System.out.println(even);
        }
    }

    public static void main(String[] args) {
        printEvenNumber(inputInt());
    }

}
