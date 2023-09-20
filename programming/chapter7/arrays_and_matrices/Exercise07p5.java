package programming.chapter7.arrays_and_matrices;

public class Exercise07p5 {
    public static boolean equalArryas(int[] a, int[] b) {
        if(a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i] != b[i])
                    return false;
            }
        }
        return true;
    }
}
