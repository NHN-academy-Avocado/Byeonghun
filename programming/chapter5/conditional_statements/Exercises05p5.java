package programming.chapter5.conditional_statements;

public class Exercises05p5 {
    public static void main(String[] args) {
        Fx fx = new Fx(2,4,1);
        fx.result();
    }
}
class Fx {
    double a;
    double b;
    double c;
    double s;
    boolean isA = false;

    public Fx(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.s = Math.sqrt((b*b)-4*(a*c));
        if(s == 0) isA = true;
    }
    public void result(){
        if(isA){
            System.out.println(-b/(2*a));
        }
        else {
            System.out.println((-b+s)/(2*a));
            System.out.println((-b-s)/(2*a));
        }
    }
}
