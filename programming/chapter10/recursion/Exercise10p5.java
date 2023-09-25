package programming.chapter10.recursion;

import java.io.BufferedReader;
import java.io.IOException;

public class Exercise10p5 {
    public static int countOne(BufferedReader br , int count) {
        try {
            String line = br.readLine();
            if(line == null) return count;
            if(Integer.parseInt(line) == 1) return countOne(br, ++count);
            return countOne(br, count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static int countOne(BufferedReader br){
        return countOne(br, 0);
    }
}
