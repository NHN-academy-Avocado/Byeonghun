package programming.chapter10.recursion;

public class Exercise10p1 {
    public static int fibonacci(int n){
        switch (n){
            case 0:
            case 1: return n;
            default: return fibonacci(n-2) + fibonacci(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
