package programming.chapter9.errors_exception;

public class Exercise09p2 {
    private int x = 101;

    private void f(int x) {
        this.x = x;
        this.x++;
        g();
    }

    private void g() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Exercise09p2 e = new Exercise09p2();
        int x = 200;
        e.f(x);
    }
}
