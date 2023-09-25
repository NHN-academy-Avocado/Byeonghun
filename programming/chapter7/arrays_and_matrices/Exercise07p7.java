package programming.chapter7.arrays_and_matrices;

import java.util.Arrays;

public class Exercise07p7 {
    public static int[] removeDuplicates(int[] a){
        int[] arr = new int[a.length];
        int count = 1;
        boolean check = true;
        arr[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < count; j++) {
                if (a[i] == arr[j]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                arr[count] = a[i];
                count++;
            }
            check = true;
        }
        return Arrays.copyOfRange(arr, 0, count);
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,1,2,3};
//        Print<Integer> p =new Print<>();
//        p.print(Arrays.stream(removeDuplicates(a)).boxed().toArray(Integer[]::new));
    }
}
