package _6_LoopStatements;

import static _6_LoopStatements.ReadInt.inputInt;

public class Exercises_6_4 {
    public static int sum(int n){
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += inputInt();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(inputInt("입력받을 수 입력")));
    }
}
