package _6_LoopStatements;

import static _6_LoopStatements.Exercises_6_11.prime;
import static _6_LoopStatements.ReadInt.inputInt;

public class Exercises_6_12 {
    public static void printPrime(int n){
        for (int i = 2; i <= n ; i++) {
            System.out.println(i + "= " +prime(i));
        }
    }

    public static void main(String[] args) {
        printPrime(inputInt());
    }
}
