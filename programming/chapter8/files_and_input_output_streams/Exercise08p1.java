package programming.chapter8.files_and_input_output_streams;

import static programming.chapter8.files_and_input_output_streams.IOStrings.*;

import java.io.*;

public class Exercise08p1 {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        OutputStream os = System.out;
        saveArray(os, loadArray(is, 3));
    }
}
class  IOStrings{
    public static String[] loadArray(InputStream is, int n) throws IOException {
        String[] sa = new String[n];
        String tmp;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        for (int i = 0; i < n; i++) {
            tmp = br.readLine();
            sa[i] = tmp;
        }
        return sa;
    }
    public static void saveArray(OutputStream os, String[] sa){
        PrintStream pw = new PrintStream(os);
        for (String str : sa) {
            pw.println(str);
        }
    }
}
