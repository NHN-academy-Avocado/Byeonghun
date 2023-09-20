package programming.chapter7.arrays_and_matrices;

public class Exercise07p9 {
    static boolean symmetric(int[][] m){
        if(m.length != m[0].length) return false;
        int[][] rm = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                rm[j][i] = m[i][j];
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if(m[i][j] != rm[i][j]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] m = {{1,2,3},{2,1,2},{3,2,1}};
        int[][] m2 = {{1,2},{1,2}};
        System.out.println(symmetric(m));
        System.out.println(symmetric(m2));
    }
}
