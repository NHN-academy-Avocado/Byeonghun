package programming.chapter7.arrays_and_matrices;

public class Exercise07p11 {
    static boolean diagonal(int[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = i+1; j < m[0].length; j++) {
                if(m[i][j] != 0) return false;
                if(m[j][i] != 0) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] m = {{0,0,0},{1,0,0},{1,2,0}};
        int[][] m2 = {{1,0},{0,2}};
        int[][] m3 = {{1,0},{0,1}};
        System.out.println(diagonal(m));
        System.out.println(diagonal(m2));
        System.out.println(diagonal(m3));
    }
}
