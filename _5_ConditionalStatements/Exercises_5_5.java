package _5_ConditionalStatements;

public class Exercises_5_5 {
    public static void main(String[] args) {

    }
}
class fx{
    double a,b,c,s;
    boolean isA = false;

    public fx(double a, double b, double c) {
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
