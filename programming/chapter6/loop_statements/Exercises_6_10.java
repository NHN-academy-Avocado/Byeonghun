package programming.chapter6.loop_statements;

import static programming.chapter6.loop_statements.ReadInt.inputInt;

public class Exercises_6_10 {
    public static void printFactorial(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(Exercises_6_3.factorial(i));
        }
    }

    public static void main(String[] args) {
        printFactorial(ReadInt.inputInt());
    }
}
