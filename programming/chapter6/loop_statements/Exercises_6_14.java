package programming.chapter6.loop_statements;

import static programming.chapter6.loop_statements.ReadInt.inputInt;

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
        primeFactors(ReadInt.inputInt());
    }
}
