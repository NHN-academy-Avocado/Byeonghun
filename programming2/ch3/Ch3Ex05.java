package programming2.ch3;

import textio.TextIO;

public class Ch3Ex05 {
    public static void main(String[] args) {
        double total = 0;
        int count = 0;
        String input;
        TextIO.readFile("sales.dat");
        while (!TextIO.eof()) {
            input = TextIO.getln();
            String[] arr = input.split(" ");
            try {
                double sales = Double.parseDouble(arr[arr.length - 1]);
                total += sales;
            } catch (Exception e) {
                count++;
            }
        }
        System.out.println("total : " + total + " no report num " + count);
    }
}
