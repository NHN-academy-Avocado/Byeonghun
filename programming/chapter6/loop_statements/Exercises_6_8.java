package programming.chapter6.loop_statements;

public class Exercises_6_8 {
    public static void main(String[] args) {
        gugudan(20,20);
    }

    private static void gugudan(int a, int b) {
        for (int i = 1; i <= a; i++) {
            for (int j = 2; j <= b; j++) {
                multiple(i, j);
            }
            getPrintln();
        }
    }

    private static void getPrintln() {
        System.out.println();
    }

    private static void multiple(int i, int j) {
        System.out.print(i * j + "\t");
    }
}
