package programming.chapter6.loop_statements;

import static programming.chapter6.loop_statements.Exercises_6_11.prime;
import static programming.chapter6.loop_statements.ReadInt.inputInt;

public class Exercises_6_12 {
    public static void printPrime(int n){
        for (int i = 2; i <= n ; i++) {
            System.out.println(i + "= " +prime(i));
        }
    }

    public static void main(String[] args) {
        printPrime(ReadInt.inputInt());
    }
}
