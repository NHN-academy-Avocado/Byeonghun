package programming.chapter10.recursion;

public class Exercise10p2 {
    static int count = 0;
    public static int fibonacci(int n){
        System.out.println("호출 횟수 : " + ++count + "   n 값 : " + n);
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n-2) + fibonacci(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(20));
    }
}
