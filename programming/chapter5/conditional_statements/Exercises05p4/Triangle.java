package programming.chapter5.conditional_statements.Exercises05p4;

public class Triangle {
    double a, b, c, s;
    boolean isRegular;
    boolean issymmetric;

    public Triangle(int a, int b, int c) {
        this.issymmetric = false;
        this.isRegular = false;
        if (a > b && a > c) {
            this.c = a;
            if (b > c) {
                this.b = b;
                this.a = c;
            } else {
                this.b = c;
                this.a = b;
            }
            check();
            return;
        }
        if (b > a && b > c) {
            this.c = b;
            if (a > c) {
                this.b = a;
                this.a = c;
            } else {
                this.b = c;
                this.a = a;
            }
            check();
            return;
        }
        if (c > a && c > b) {
            this.c = c;
            if (b > a) {
                this.b = b;
                this.a = a;
            } else {
                this.b = a;
                this.a = b;
            }
            check();
            return;
        }
        if (a == c && a == b) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.isRegular = true;
            return;
        }
        issymmetric = true;
        if (a == b) {
            if (a > c) {
                this.c = a;
                this.b = b;
                this.a = c;
                check();
                return;
            }
            this.c = c;
            this.b = b;
            this.a = a;
            check();
            return;
        }
        if (a == c) {
            if (a > b) {
                this.c = a;
                this.b = c;
                this.a = b;
                check();
                return;
            }
            this.c = b;
            this.b = c;
            this.a = a;
            check();
            return;
        }
        if (c == b) {
            if (a > c) {
                this.c = a;
                this.b = b;
                this.a = c;
                check();
                return;
            }
            this.c = c;
            this.b = b;
            this.a = a;
            check();
        }
    }

    private void check() {
        if(c > a+b){
            System.out.println("상각형이 될 수 없습니다");
            System.exit(1);
        }
        s = (s+b+c)/2;
    }

    public void around(){
        System.out.println(a+b+c);
    }
    public void printA(){
        double result = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(result);
    }
    public void print() {
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
        System.out.println("=======");
        if(issymmetric){
            System.out.println("이등변");
        }
        else if(isRegular){
            System.out.println("정상각");
        }
        else {
            System.out.println("평범한");
        }
    }
}
