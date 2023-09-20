package programming.chapter6.loop_statements;

import static programming.chapter6.loop_statements.Exercises_6_11.prime;
import static programming.chapter6.loop_statements.ReadInt.inputInt;

public class Exercises_6_13 {
    public static void printPrimeNum(int n ){
        int tmp = 2;
        for (int i = 0; i < n;) {
            for (int j = tmp;; j++) {
                if(prime(j)){
                    System.out.println(j);
                    tmp = j+1;
                    i++;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        printPrimeNum(inputInt());
    }
}
