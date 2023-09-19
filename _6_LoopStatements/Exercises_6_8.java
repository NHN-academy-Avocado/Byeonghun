package _6_LoopStatements;

public class Exercises_6_8 {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            for (int j = 2; j < 20; j++) {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
}
