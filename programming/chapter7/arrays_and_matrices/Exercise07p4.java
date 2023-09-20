package programming.chapter7.arrays_and_matrices;

import java.util.Arrays;

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
        int[][] m = {{1,1,1},{2,2,2},{3,3,3}};
        int[] test = matrixSumColumns(m);
        Print<Integer> p = new Print<>();
        p.print(Arrays.stream(m).map(arr->Arrays.stream(arr).boxed().toArray(Integer[]::new)).toArray(Integer[][]::new));
        System.out.println("=================");
        p.print(Arrays.stream(test).boxed().toArray(Integer[]::new));
    }


}
