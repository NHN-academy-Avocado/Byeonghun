package programming.chapter7.arrays_and_matrices;

public class Exercise07p6 {
    public static int numberOfDuplicates(int[] a) {
        int[] arr = new int[a.length];
        int count = 1;
        boolean check = true;
        arr[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < count; j++) {
                if (a[i] == arr[j]) {
                    check = false;
                }
            }
            if (check) {
                arr[count] = a[i];
                count++;
            }
            check = true;
        }
        return count;
    }
    public static int numberOfDistinctValues(int[] a){
        return a.length - numberOfDuplicates(a);
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,1,2,3};
        System.out.println(numberOfDuplicates(a));
        System.out.println(numberOfDistinctValues(a));
    }
}
