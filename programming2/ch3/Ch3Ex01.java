package programming2.ch3;

public class Ch3Ex01 {
    public static void main(String[] args) {
        int first;
        int second;
        int count = 0;
        do{
            first = (int) (Math.random()*6) + 1;
            second = (int) (Math.random()*6) + 1;
            count++;
        }while (first + second != 2);
        System.out.println(count);
    }
}
