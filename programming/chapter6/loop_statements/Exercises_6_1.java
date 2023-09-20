package programming.chapter6.loop_statements;

import static programming.chapter6.loop_statements.ReadInt.inputInt;

public class Exercises_6_1 {
    public static void main(String[] args) {
        int input = ReadInt.inputInt();
        int min = input;
        for (int i = 0; i < 9; i++) {
            input = ReadInt.inputInt();
            if(min > input)
                min = input;
        }
        System.out.println(min);
    }
}
