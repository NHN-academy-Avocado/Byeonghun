package programming.chapter7.arrays_and_matrices;

public class Exercise07p1 {
    public static double scalarProduct(double[] a, double[] b){
        double result = 0.0;
        for (int i = 0; i < a.length; i++) {
            result += a[i]*b[i];
        }
        return result;
    }
}
