package programming.chapter9.errors_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise09p4 {
    public static void main(String[] args){
        int n=10;
        int[] v = new int[n];
        try(BufferedReader in = new BufferedReader(new FileReader("dati.txt"))) {
            int i=0;
            String linea = in.readLine();
            while (linea!=null) {
                v[i] = Integer.parseInt(linea);
                linea = in.readLine();
                i++;
            }
        }catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }


    }
}
