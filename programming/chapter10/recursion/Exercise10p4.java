package programming.chapter10.recursion;

public class Exercise10p4 {
    public static int gdc(int x, int y){
        if(y == 0) return x;
        else return gdc(y, x%y);
    }
    public static boolean prime(int x, int y){
        if(x == 1 || y == 1) return true;
        if (x == y) return false;
        if (x < y) return prime(x,y-x);
        return prime(x-y,y);
    }
    public static int rest(int x, int y) {
        if (x < 0) return rest(x+y, y);
        if(x < y) return x;
        if(x > y) return rest(x-y,y);
        return 0;
    }
    public static void main(String[] args) {
//        System.out.println(gdc(18,27));
//        System.out.println(prime(5, 10));
        System.out.println(rest(10,6));
    }
}
