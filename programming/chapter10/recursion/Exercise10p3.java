package programming.chapter10.recursion;

public class Exercise10p3 {
    public static int ackermann(int m, int n) {
        if(m == 0) return n+1;
        if(n == 0) return ackermann(m-1,1);
        return ackermann(m-1,ackermann(m,n-1));
    }

    public static void main(String[] args) {
        System.out.println(ackermann(3,5));
    }
}
