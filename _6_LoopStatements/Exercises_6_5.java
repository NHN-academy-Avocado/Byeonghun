package _6_LoopStatements;

import static _6_LoopStatements.ReadInt.inputInt;

public class Exercises_6_5 {
    public static double calculPi(int n) {
        double result = 4;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result -= 4.0/(3.0+(2.0*i));
            }else {
                result += 4.0/(3.0+(2.0*i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculPi(inputInt()));
    }
}
