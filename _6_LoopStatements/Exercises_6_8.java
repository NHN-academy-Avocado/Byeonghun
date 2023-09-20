package _6_LoopStatements;

public class Exercises_6_8 {
    public static void main(String[] args) {
        gugudan(20,20);
    }

    private static void gugudan(int a, int b) {
        for (int i = 1; i <= a; i++) {
            for (int j = 2; j <= b; j++) {
                multple(i, j);
            }
            getPrintln();
        }
    }

    private static void getPrintln() {
        System.out.println();
    }

    private static void multple(int i, int j) {
        System.out.print(i * j + "\t");
    }
}
