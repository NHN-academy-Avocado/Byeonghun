package _6_LoopStatements;

import static _6_LoopStatements.ReadInt.inputInt;

import javax.swing.*;

public class Exercises_6_3 {
    public static int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("양의 정수를 입력해 주세요");
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= (n - i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(inputInt()));
    }
}
