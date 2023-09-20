package programming.chapter7.arrays_and_matrices;

import java.util.Arrays;

public class Exercise07p2 {
    static int[] intersection(int[] a, int[] b){
        int[] result = new int[a.length];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]){
                    result[index] = a[i];
                    index++;
                }
            }
        }
        return Arrays.copyOfRange(result, 0 ,index);
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,10};
        int[] b = {2,5,7,9,3,11};
        int[] test = intersection(a,b);
        Print<Integer> p = new Print<>();
        p.print(Arrays.stream(test).boxed().toArray(Integer[]::new));
    }
}
