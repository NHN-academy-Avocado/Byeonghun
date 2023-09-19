package _6_LoopStatements;

import static _6_LoopStatements.ReadInt.inputInt;

public class Exercises_6_11 {
    public static boolean prime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(prime(inputInt()));
    }
}
