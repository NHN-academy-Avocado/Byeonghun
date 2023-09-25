package programming.chapter7.arrays_and_matrices;

import java.util.*;

public class Exercise07p4 {
    static int[] matrixSumColumns(int[][] m) {
        int[] result = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                result[i] += m[i][j];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] m = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int[] test = matrixSumColumns(m);
        Print<Integer> p = new Print<>();
        Print<Integer[]> p2 = new Print<>();
        p2.print(Arrays.stream(m).map(arr -> Arrays.stream(arr).boxed().toArray(Integer[]::new)).toArray(Integer[][]::new), new Print2D<>());
        System.out.println("=================");
        p.print(Arrays.stream(test).boxed().toArray(Integer[]::new), new Print1D<>());
        System.out.println();
        p.print(Arrays.stream(test).boxed().toArray(Integer[]::new), t -> System.out.print(t + "\t"));
        System.out.println();
        p.print(Arrays.stream(test).boxed().toArray(Integer[]::new), integer -> {
            System.out.print(integer);
            System.out.println();
        });
    }
}