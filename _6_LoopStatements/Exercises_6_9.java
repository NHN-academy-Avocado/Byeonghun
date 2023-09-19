package _6_LoopStatements;

import static _6_LoopStatements.ReadInt.inputInt;

public class Exercises_6_9 {
    public static void main(String[] args) {
        numberTree(inputInt());
    }
    public static void numberTree(int hight){
        for (int i = 1; i <= hight; i++) {
            for (int j = 1; j <= hight-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j < i ; j++) {
                System.out.print(i-j);
            }
            System.out.println();
        }
    }
}
