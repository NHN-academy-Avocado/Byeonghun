package programming.chapter7.arrays_and_matrices;

import java.util.Arrays;

public class Exercise07p3 {
    static double[][] transposeMatrix(double[][] m){
        double[][] result = new double[m[0].length][m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                result[j][i] = m[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        double[][] m = {{1,1,1},{2,2,2},{3,3,3}};
        double[][][] a = new double[3][3][3];
        double[][] test = transposeMatrix(m);
        Print<Double> p = new Print<>();
//        p.print(Arrays.stream(test).map(arr->Arrays.stream(arr).boxed().toArray(Double[]::new)).toArray(Double[][]::new));
//        p.print(Arrays.stream(m).map(arr -> Arrays.stream(arr).boxed().toArray(Double[]::new)).toArray(Double[][]::new));
    }


}
