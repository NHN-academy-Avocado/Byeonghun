package programming.chapter6.loop_statements;

import static programming.chapter6.loop_statements.ReadInt.inputInt;


public class Exercises_6_2 {
    public static void printEvenNumber(int n){
        int even = 0;
        for (int i = 0; i < n; i++) {
            even += 2;
            System.out.println(even);
        }
    }

    public static void main(String[] args) {
        printEvenNumber(ReadInt.inputInt());
    }

}
