package programming2.ch3;

public class Ch3Ex02 {
    public static void main(String[] args) {
        int maxNumberDivisors;
        int maxNumber;
        maxNumber = 0;
        maxNumberDivisors = 0;
        for (int i = 2; i < 10000; i++) {
            int countDivisor = 0;
            for (int j = 1; j <= i; j++) {
                if(i % j == 0) countDivisor++;
            }
            if(maxNumberDivisors < countDivisor){
                maxNumberDivisors = countDivisor;
                maxNumber = i;
            }
        }
        System.out.println("number of divisor " + maxNumberDivisors + " number " + maxNumber);
    }
}
