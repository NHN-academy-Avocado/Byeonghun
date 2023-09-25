package programming.chapter9.errors_exception;

//
public class Exercise09p1 {
    public static void main(String[] args) {
        int resultI = 0;
        int resultJ = 0;
        for (int i = 0, j = 0; i < 10|| j < 10; i++, j++) {
            System.out.println(i + " + " + j + " = " + (i+j));
            resultI = i;
            resultJ = j;
        }
        System.out.println("I've printed out the sums of i and j up to "
                + resultI + "," + resultJ);
    }
}
