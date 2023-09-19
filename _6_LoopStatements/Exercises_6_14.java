package _6_LoopStatements;

import static _6_LoopStatements.ReadInt.inputInt;

public class Exercises_6_14 {
    public static void primeFactors(int n) {
        for (int i = 2; n != 1; ) {
            if (n % i == 0) {
                System.out.println(i);
                n /= i;
                i = 2;
            }else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        primeFactors(inputInt());
    }
}
