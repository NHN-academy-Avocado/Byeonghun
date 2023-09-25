package programming.chapter8.files_and_input_output_streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exercise08p2 {
    public static void main(String[] args) throws IOException {
        System.out.println(average());
    }
    public static double average() throws IOException {
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        int temp = Integer.parseInt(br.readLine());
        int count = 0;
        int sum = 0;
        while (temp != 0) {
            count++;
            sum += temp;
            temp = Integer.parseInt(br.readLine());
        }
        return (double) sum/count;
    }
}
