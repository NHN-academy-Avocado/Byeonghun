package _6_LoopStatements;

import static _6_LoopStatements.Exercises_6_3.factorial;
import static _6_LoopStatements.ReadInt.inputInt;

public class Exercises_6_10 {
    public static void printFactorial(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(factorial(i));
        }
    }

    public static void main(String[] args) {
        printFactorial(inputInt());
    }
}
