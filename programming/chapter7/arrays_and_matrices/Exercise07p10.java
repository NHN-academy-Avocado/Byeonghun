package programming.chapter7.arrays_and_matrices;

public class Exercise07p10 {
    static boolean lowerTriangular(int[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = i; j < m[0].length; j++) {
                if(m[i][j] != 0) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] m = {{0,0,0},{1,0,0},{1,2,0}};
        int[][] m2 = {{1,0},{0,2}};
        System.out.println(lowerTriangular(m));
        System.out.println(lowerTriangular(m2));
    }
}
